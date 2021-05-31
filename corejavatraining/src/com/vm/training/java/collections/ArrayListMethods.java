package com.vm.training.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class ArrayListMethods {
	static Boolean search(ArrayList ar1,Integer key)
	{
		return ar1.contains(key);
	}
	/*static ArrayList sort(ArrayList ar1)
	{
		Collections.sort(ar1);
		return ar1;
	}
	static ArrayList min(ArrayList ar1)
	{
		return (ArrayList) (Collections.min(ar1));
		
	}*/
	static int even(ArrayList ar1)
	{
		Iterator<Integer> it= ar1.iterator();
		int e=0;
		while(it.hasNext())
		{
			if(it.next()%2==0)
			{
				e=e+it.next();
			}
		}
		return e;
	}
	static int odd(ArrayList ar1)
	{
		Iterator<Integer> it= ar1.iterator();
		int o=0;
		while(it.hasNext())
		{
			if(it.next()%2!=0)
			{
				o=o+it.next();
			}
		}
		return o;
	}
/*private static boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}*/
public static void main(String[] args) {
	ArrayList <Integer> ar1=new ArrayList<Integer>();
	ar1.add(1);
	ar1.add(3);
	ar1.add(14);
	ar1.add(5);
	ar1.add(7);
	ar1.add(8);
	//Collections.sort(ar1);
	//System.out.println("the sorted list"+ar1);
	//Collections.reverse(ar1);
	//System.out.println("the sorted list"+ar1);
	//System.out.println("min element:"+(Collections.min(ar1)));
	//System.out.println("max element:"+(Collections.max(ar1)));
	System.out.println(search(ar1,14));
	//System.out.println(min(ar1));
	System.out.println(even(ar1));
	System.out.println(odd(ar1));
}
}
