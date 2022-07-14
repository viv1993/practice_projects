package com.test.testproject.model;

public enum Slot {
	SLOT1("6 TO 7 AM"),SLOT2("7 TO 8 AM");

	Slot(String slotTime) {
		this.slotTiming = slotTime;
	}
	
	private String slotTiming;
	
	public String getSlotTiming() {
		return slotTiming;
	}
}
