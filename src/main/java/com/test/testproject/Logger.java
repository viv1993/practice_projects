package com.test.testproject;

public class Logger {

	private static volatile Logger logger;
	
	private Logger() {
		
	}
	
	public static Logger getLogger() {
		if(logger == null) {
			synchronized (Logger.class) {
				if(logger ==  null) {
					logger = new Logger();
				}
			}
		}
		return logger;
	}
}
