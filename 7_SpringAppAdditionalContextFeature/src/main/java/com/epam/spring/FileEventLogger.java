package com.epam.spring;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class FileEventLogger implements EventLogger {

	private String fileName;
	private File file;

	public FileEventLogger(String fileName) {
		super();
		this.fileName = fileName;
	}

	public void init() throws IOException {
		this.file = new File(fileName);
	}

	@Override
	public void logEvent(Event event) {
		try {
			FileUtils.writeStringToFile(file, event.toString()+"\n", true);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
