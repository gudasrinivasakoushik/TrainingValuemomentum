package com.vm.training.java.Exceptions;

public class OnHoldMoney extends Exception{
String balance;

public OnHoldMoney(String balance) {
	super();
	this.balance = balance;
}

@Override
public String toString() {
	return "OnHoldMoney [balance=" + balance + "]";
}

}
