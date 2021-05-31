package com.vm.training.java.newFeatures;


interface Bank
{
	default void openAccount()
	{
		System.out.println("you can open account");
	}

static void holiday()
{
	System.out.println("holidays on 2 nad saturdays");
}
abstract int rateOfInterest(int interest);
abstract int minBalance(int amount);
}
class Axis implements Bank
{

	@Override
	public int rateOfInterest(int interest) {
		// TODO Auto-generated method stub
		return interest;
	}

	@Override
	public int minBalance(int amount) {
		// TODO Auto-generated method stub
		return amount;
	}
	
}
public class NewInterfaceDemo {
public static void main(String[] args) {
	Bank bank=new Axis();
	bank.openAccount();
	bank.minBalance(1000);
	bank.minBalance(4);
	Bank.holiday();
	
}
}
