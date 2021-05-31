package com.vm.training.java.newFeatures;
import java.util.*;
public class StreamSort {
public static void main(String[] args) {
	
	
	ArrayList<Integer> nums=new ArrayList<Integer>();
	nums.add(2);
	nums.add(9);
	nums.add(6);
	nums.add(8);
	nums.add(7);
	
	nums.forEach(System.out::println);
	nums.stream().sorted().forEach(System.out::println);
	
	nums.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
	
	ArrayList<String>ar=new ArrayList<String>();
	ar.add("kou");
	ar.add("subha");
	ar.add("basha");
	ar.stream().sorted().forEach(System.out::println);
}
}
