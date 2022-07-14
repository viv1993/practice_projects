package com.test.testproject;

public abstract class AbstractLogger {

	private int level;
	private AbstractLogger nextLevelLogger;
	
	public AbstractLogger(int level) {
		this.level = level;
	}
	
	public abstract void displayMsg(String msg);
}
