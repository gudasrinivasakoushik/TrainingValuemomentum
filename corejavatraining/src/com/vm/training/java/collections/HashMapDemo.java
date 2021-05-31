package com.vm.training.java.collections;
import java.util.*;

public class HashMapDemo {
	static HashMap hashadd(HashMap contacts,String name, String number)
	{
		contacts.put(name,number);
		return contacts;
	}
	static HashMap hashremove(HashMap contacts,String name, String number)
	{
		contacts.remove(name);
		return contacts;
	}
	static void displayContact(HashMap contacts)
	{
		System.out.println(contacts);
	}
public static void main(String[] args) {
	/*LinkedHashMap lhm=new LinkedHashMap();
	lhm.put("guda", "koushik");
	lhm.put("tirumal", "subha");
	lhm.put("basha", "chand");
	lhm.put("aktar", "javed");
	System.out.println(lhm);
	System.out.println(lhm.get("guda"));
	System.out.println(lhm.keySet());
	System.out.println(lhm.values());
	for(Object s:)*/
	
	
	HashMap contacts=new HashMap();
	hashadd(contacts,"guda","9866374666");
	hashadd(contacts,"tirumala","44438773");
	hashadd(contacts,"basha","89988661");
	hashremove(contacts,"guda", null);
	displayContact(contacts);
	
}
}
