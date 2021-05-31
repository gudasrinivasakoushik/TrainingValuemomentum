package com.vm.training.java.basics;
import java.util.*;
public class Seventh {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Input the 5 number");
	int i,s=0;
	for(i=0;i<=5;i++)
	{
		i=sc.nextInt();
		s=s+i;
	}
	float a=s/5;
	System.out.println("The sum of 5 is:"+s);
	System.out.println("The average of 5 is:"+a);
}
}
