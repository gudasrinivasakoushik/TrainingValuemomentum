package com.vm.training.java.basics;
import java.util.*;
import java.util.Scanner;

public class Seveneen {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);

	StringBuilder sb=new StringBuilder("seventeen");
	
	sb.replace(0,5,"f");
	System.out.println("after replace: "+sb);
}
}
