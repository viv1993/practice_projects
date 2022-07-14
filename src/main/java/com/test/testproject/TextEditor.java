package com.test.testproject;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

import org.springframework.util.ReflectionUtils;

public class TextEditor {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		ListNode obj = new ListNode();
		String value = "code";
		Field field = ReflectionUtils.findField(ListNode.class, value);
		if(field != null) {
			field.setAccessible(true);
			field.set(obj, 123);
		}
		System.out.println(obj.getCode());
	}
	
}

class ListNode{
	
	private Long code;
	
	public Long getCode() {
		return code;
	}
	
	public void setCode(Long code) {
		this.code = code;
	}
}
