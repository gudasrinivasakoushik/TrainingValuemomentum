package com.vm.training.java.Exceptions;

public class LowBalance extends Exception{
String balance;

public LowBalance(String balance) {
	super();
	this.balance = balance;
}

@Override
public String toString() {
	return "LowBalance [balance=" + balance + "]";
}

}
