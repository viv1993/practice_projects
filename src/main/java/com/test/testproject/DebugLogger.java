package com.test.testproject;

public class DebugLogger extends AbstractLogger {

	public DebugLogger(int level) {
		super(level);
	}

	@Override
	public void displayMsg(String msg) {
		System.out.println("Logging debug level : " + msg);
	}

}
