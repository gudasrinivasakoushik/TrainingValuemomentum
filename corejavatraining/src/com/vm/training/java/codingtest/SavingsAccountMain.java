package com.vm.training.java.codingtest;

public class SavingsAccountMain {
public static void main(String[] args) {
	
	SavingsAccount savingsaccount = new SavingsAccount(9325,5.90);
	savingsaccount.withdraw(250);
	System.out.println("after with drwan: Balance is:"+savingsaccount.getBalance());
	savingsaccount.deposit(400);
	System.out.println("after deposit: Balance is:"+savingsaccount.getBalance());
	savingsaccount.addInterest();
	System.out.println("intrest is:"+savingsaccount.getBalance());
	
	
}
	
}
