package com.vm.training.java.ConcurrentThreading;
import java.util.*;
import java.util.Map.Entry;
public class MapIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer>hm=new HashMap<String, Integer>();
		hm.put("sai",78);
		hm.put("kumar ",67);
		hm.put("jhon",80);
		for(Entry<String, Integer>h:hm.entrySet())
		{
			System.out.println(h);
		}
		for(Integer i:hm.values())
		{
			System.out.println("values are:"+i);
		}
		for(String k :hm.keySet())
		{
			System.out.println("keys"+ k +" "+ hm.get(k));
		}
	}

}
