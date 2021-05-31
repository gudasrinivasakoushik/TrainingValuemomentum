package com.vm.training.java.basics;

import com.vm.training.java.oops.Calculator;
import com.vm.training.java.oops.Customer;

public class test{
	public static void main(String[] args) {
		/*Calculator cl=new Calculator();
		System.out.println(cl.add(100,200,300,400));
		System.out.println(cl.add(100,200,100));
		System.out.println(cl.add(100,200));*/
		Customer c1=new Customer();
		Customer c2=new Customer(103,"abc");
		Customer c3=new Customer(102,"ab","abc");
		Customer c4=new Customer(101,"a","abc","sav");
		c1.show();
		c2.show();
	}
}

