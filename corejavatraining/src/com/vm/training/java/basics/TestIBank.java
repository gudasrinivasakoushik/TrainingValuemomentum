package com.vm.training.java.basics;

public class TestIBank {
public static void main(String[] args) {
	IBank ib=new Sbi();
	IBank ib1=new Icici();
	IBank ib2=new APragathiBank();
	System.out.println(ib.RateOfIntreast());
	System.out.println(ib1.RateOfIntreast());
	System.out.println(ib2.RateOfIntreast());
	
}
}
