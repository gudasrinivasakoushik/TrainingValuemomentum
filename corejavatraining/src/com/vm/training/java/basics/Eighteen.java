package com.vm.training.java.basics;

import java.util.Scanner;

public class Eighteen {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);

	StringBuilder sb=new StringBuilder("The quick brown fox jumps over the lazy dog.");
	System.out.println("old="+sb);
	System.out.println("substring is NEW: "+sb.substring(10,25));
}

}
