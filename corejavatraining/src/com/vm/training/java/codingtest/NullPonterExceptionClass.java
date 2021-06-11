package com.vm.training.java.codingtest;

public class NullPonterExceptionClass extends Exception {

	String fullname;
	
	public NullPonterExceptionClass(String fullname) {
		super();
		this.fullname = fullname;
		
	}

	@Override
	public String toString() {
		return "NullPonterExceptionClass " + fullname + "]";
	}
	
	
	
}
