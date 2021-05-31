package com.vm.training.java.collections;
import java.util.*;
public class TreeSetExample {
public static void main(String[] args) {
	TreeSet ts=new TreeSet();
	ts.add("koushik");
	ts.add("subha");
	ts.add("javed");
	System.out.println(ts);
	System.out.println("is tree set empty:"+ts.isEmpty());
	System.out.println("size of treeset is:"+ts.size());
	ts.remove("javed");
	System.out.println(ts);
	ts.clear();
	System.out.println("is tree set empty after deleting:"+ts.isEmpty());
	
	
}
}
