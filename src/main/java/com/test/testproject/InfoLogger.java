package com.test.testproject;

public class InfoLogger extends AbstractLogger {

	public InfoLogger(int level) {
		super(level);
	}

	@Override
	public void displayMsg(String msg) {
		System.out.println("Logging Info level : " + msg);
	}

}
