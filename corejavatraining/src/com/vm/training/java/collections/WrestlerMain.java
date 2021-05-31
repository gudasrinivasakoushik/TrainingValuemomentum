package com.vm.training.java.collections;
import java.util.*;
public class WrestlerMain {
public static void main(String[] args) {
	ArrayList<Wrestler>ar=new ArrayList<Wrestler>();
	ar.add(new Wrestler("kali",100,7.2));
	ar.add(new Wrestler("cena",97,6.2));
	ar.add(new Wrestler("rock",84,5.9));
	ar.add(new Wrestler("randy",122,6.0));
	/*
	for(Wrestler i:ar)
	{
		System.out.println(i);
	}*/

	Collections.sort(ar,new WeightSort());
	for(Wrestler i:ar)
	{
		System.out.println(i);
	}

	Collections.sort(ar,new HeightSort());
	for(Wrestler i:ar)
	{
		System.out.println(i);
	}
	
}
}
