package com.vm.training.java.collections;
import java.util.*;
public class ComporatorDemo {
public static void main(String[] args) {
	ArrayList<Product>ar=new ArrayList<Product>();
	ar.add(new Product(1,"sal",100));
	ar.add(new Product(2,"milk",30));
	ar.add(new Product(3,"ghee",400));
	System.out.println(ar);
	for(Product product:ar)
	{
		System.out.println(product);
	}
	for(Product product:ar)
	{
		if(product.getPrice()>99)
		{
			System.out.println(product.getName());
		}
	}
	
	Collections.sort(ar,new PriceSorting());
	for(Product product:ar)
	{
		System.out.println(product);
	}
	
	Collections.sort(ar,new NameSorting());
	for(Product product:ar)
	{
		System.out.println(product);
	}
}
}
