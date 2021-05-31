package com.vm.training.java.basics;
import java.util.*;
public class Sixteen {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string:");
	StringBuilder sb=new StringBuilder(sc.next());
	System.out.println("enter position:");
	int k=sc.nextInt();
	System.out.println("The character at position:"+sb.charAt(k));
	
	
}
}
