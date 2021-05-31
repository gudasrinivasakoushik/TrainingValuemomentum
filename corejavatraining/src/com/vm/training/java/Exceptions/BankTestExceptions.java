package com.vm.training.java.Exceptions;
import java.util.*;
public class BankTestExceptions {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your choice 1. withdraw 2. deposit 3. to check fine for minmum balance");
	Hdfc hdfc;
	int balance;
	int c=sc.nextInt();
	switch(c)
	{
	case 1:
		hdfc=new Hdfc();
		System.out.println("how much you want to withdraw");
		int debit=sc.nextInt();
		balance=hdfc.debit(debit);
		System.out.println("take your money and balance is"+balance);
		break;
	case 2:
		hdfc=new Hdfc();
		System.out.println("how much you want to credit in account");
		int credit=sc.nextInt();
		balance=hdfc.credit(credit);
		System.out.println("your money credited and balance is"+balance);
		break;
	case 3:
		hdfc=new Hdfc();
		System.out.println("enter balance after with draw");
		int fine=45;
		balance=sc.nextInt();
		if(balance<3500)
		{
		balance=hdfc.fine(fine);
		}
		System.out.println("thank you"+balance);
		break;
	}
	
	
		
}
}
