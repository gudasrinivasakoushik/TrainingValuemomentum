package com.vm.training.java.basics;
import java.util.*;
public class Eigth {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	int i;
	
	System.out.println("Input the no fo terms");
	int n=sc.nextInt();
	for(i=1;i<=n;i++)
	{
		System.out.println("Number:"+i+"and cube is:"+(i*i*i));
	}
}
}
