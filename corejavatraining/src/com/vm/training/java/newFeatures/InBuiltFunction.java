package com.vm.training.java.newFeatures;
import java.util.*;
import java.util.function.Predicate;

/*
interface Predic
{
	public 
}
*/
public class InBuiltFunction {

	public static void main(String[] args) {
		
		Predicate<Integer> p=(var1)-> var1>2;
		
		System.out.println(p.test(1));
		Predicate<String> p2=(v1)->v1.startsWith("a");
		System.out.println(p2.test("assam"));
	}
}
