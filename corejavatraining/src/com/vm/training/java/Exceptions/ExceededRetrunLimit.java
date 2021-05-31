package com.vm.training.java.Exceptions;

public class ExceededRetrunLimit extends Exception{
	String nodays;
	ExceededRetrunLimit(String nodays)
	{
		this.nodays=nodays;
	}
	@Override
	public String toString() {
		return "ExceededRetrunLimit[nodays=" + nodays + "]";
	}
}
