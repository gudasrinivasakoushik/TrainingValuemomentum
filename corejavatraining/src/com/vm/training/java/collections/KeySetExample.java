package com.vm.training.java.collections;

import java.util.HashMap;
import java.util.Set;

public class KeySetExample {
public static void main(String[] args) {
	try {
		System.out.println(2/0);
	}
	catch(Exception ex) {
		System.out.println("exception	");
	}
	catch(Exception e){
		System.out.println("arthim");
	}
	System.out.println("completed");
	/*HashMap<String, String> hm = new HashMap<String, String>();
    //add key-value pair to hashmap
    hm.put("guda", "koushik");
    hm.put("tirumala", "subash");
    
    System.out.println(hm);
    Set<String> k = hm.keySet();
    for(String i: k){
        System.out.println(i);
    }
	HashMap<String,String> hm=new HashMap<String,String>();
	hm.put("guda","koushik");
	hm.put("tirumala","subha");
	System.out.println(hm);
	Set<String> k=new hm.KeySet();
	for(String i:k)
	{
		System.out.println(k);
	}*/
}
}
