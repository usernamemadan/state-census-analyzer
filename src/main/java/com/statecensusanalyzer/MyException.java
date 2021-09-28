package com.statecensusanalyzer;

public class MyException extends Exception {

	String msg;
	public MyException(String msg) {
		super();
		this.msg = msg;
	}
	
}
