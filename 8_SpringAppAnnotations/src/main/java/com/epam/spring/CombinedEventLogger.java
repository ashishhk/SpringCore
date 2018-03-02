package com.epam.spring;

import java.util.List;

public class CombinedEventLogger implements EventLogger {
	private List<EventLogger> loggers;
	
	public void setLoggers(List<EventLogger> loggers) {
		this.loggers = loggers;
	}

	@Override
	public void logEvent(Event event) {
		for(EventLogger logger:loggers) {
			logger.logEvent(event);
		}
	}

}
