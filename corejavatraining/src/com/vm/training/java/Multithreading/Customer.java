package com.vm.training.java.Multithreading;

public class Customer {

	
	int balance=5000;
	 synchronized public int withdraw(int  amount) {
		if(balance<amount) {
			System.out.println("wait u dont have sufficient balance ");
			try {
				wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		
		}
		System.out.println(Thread.currentThread().getName()+" is going to withdraw ");
		balance-= amount;
		return  balance;
	}
	 synchronized public int deposit(int  amount) {
			balance+=amount;
			System.out.println(Thread.currentThread().getName()+" is deposit ");
				
				return balance;
			
	
	
	}


}
