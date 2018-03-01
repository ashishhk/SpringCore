package com.epam.spring;

import java.util.List;

public class CacheFileEventLogger extends FileEventLogger {
	private int cacheSize;
	private List<Event> cache;
	
	public CacheFileEventLogger(String fileName, int cacheSize, List<Event> cache) {
		super(fileName);
		this.cacheSize=cacheSize;
		this.cache=cache;

	}
	
	@Override
	public void logEvent(Event event) {
		cache.add(event);
		if(cache.size()==cacheSize) {
			writeEventsFromCache();
			cache.clear();
		}
	}

	private void writeEventsFromCache() {
		for(Event event:cache) {
			super.logEvent(event);
		}
	}
	
	private void destroy() {
		if(!cache.isEmpty()) {
			writeEventsFromCache();
		}
	}

}
