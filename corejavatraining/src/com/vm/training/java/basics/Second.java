package com.vm.training.java.basics;
import java.util.*;
public class Second {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a,b,c;
	System.out.println("input the 1st number");
	a=sc.nextInt();
	System.out.println("input the 2nd number");
	b=sc.nextInt();
	System.out.println("input the 3rd number");
	c=sc.nextInt();
	if(a>b&&a>c)
	{
		System.out.println("greaest number is:"+a);
	}
	else if(b>a&&b>c)
	{
		System.out.println("greaetest number is:"+b);
	}
	else
	{
		System.out.println("greatest number is:"+c);
	}
}
}
