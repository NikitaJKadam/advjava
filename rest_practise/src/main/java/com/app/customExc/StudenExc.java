package com.app.customExc;

public class StudenExc extends RuntimeException {
	private String msg;
	 public StudenExc(String msg) {
		super(msg);
	}

}
