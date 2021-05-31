package com.vm.training.java.collections;

import java.util.*;

public class ArrayListAssignment {
public static void main(String[] args) {
	ArrayList <String> ar1=new ArrayList<String>();
	ArrayList <String> ar2=new ArrayList<String>();
	ar1.add("ravi");
	ar1.add("jhon");
	ar1.add("anil");
	ar1.add("kumar");
	
	ar2.add("saurab");
	ar2.add("ankiha");
	ar2.add("jhon");
	ar2.add("kumar");
	ar2.add("manoj");
	//System.out.println(ar1);
	//System.out.println(ar2);
	ar1.removeAll(ar2);
	
	ar1.addAll(ar2);
	
	
	
	Collections.sort(ar1);
	System.out.println(ar1);
	
	
	
}
}
