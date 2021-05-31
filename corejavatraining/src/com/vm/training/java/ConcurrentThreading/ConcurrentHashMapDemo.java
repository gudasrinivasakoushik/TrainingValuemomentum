package com.vm.training.java.ConcurrentThreading;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
//import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentHashMap;

import javax.print.attribute.HashAttributeSet;

public class ConcurrentHashMapDemo {

	public static void main(String[] args) {
		ConcurrentHashMap<String, Integer> hm=new ConcurrentHashMap<String,Integer>();
		//HashMap<String, Integer> hm=new HashMap<String, Integer>();
		hm.put("kou",78);
		hm.put("subha",67);
		hm.put("javed",80);
		System.out.println("elemnts of map:"+hm);
		for(Integer val:hm.values())
		{
			System.out.println(val);
			hm.computeIfAbsent("mahesh",a->90);
		}
		System.out.println("elemtns of hm:"+hm);
		/*System.out.println("element sof hm :"+hm);
		hm.computeIfAbsent("kou",a->90);
		hm.computeIfAbsent("subha",a->95);
		System.out.println(hm.containsKey(78));
		System.out.println(hm.containsKey(67));
		System.out.println(hm.containsKey(80));
		System.out.println(hm.containsKey("kou"));
		*/
	}
}
