package com.vm.training.java.collections;
import java.util.*;
public class HashsetCopy {
public static void main(String[] args) {
	HashSet<String> hashset=new HashSet<String>();
	hashset.add("kou");
	hashset.add("subha");
	System.out.println(hashset);
	HashSet<String> hs=new HashSet<String>();
	hs.addAll(hashset);
	hs.add("vijay");
	hs.add("basha");
	System.out.println(hs);
	String[] str=new String[hs.size()];
	hs.toArray(str);
	for(String i:str) {
	System.out.println(str);
	}
}
}
