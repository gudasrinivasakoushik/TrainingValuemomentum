package com.vm.training.java.newFeatures;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.io.*;
public class ProductMain {
	
	static long countProducts(ArrayList<Product> pro)
	{
		return pro.stream().count();
	}
	static long CountProductbyPrice(ArrayList<Product> pro1)
	{
		return pro1.stream().filter(s->s.getPrice()>30).count();
	}
	static List<Product> sortby(ArrayList<Product> psort)
	{
		return psort.stream().filter(s->s.getProductCategory().equals("fruits")).collect(Collectors.toList());
	}
public static void main(String[] args) {
	ArrayList<Product> product=new ArrayList<Product>();
	product.add(new Product(1,"milk","eatable",60.5,1));
	product.add(new Product(2,"book","usage",30,2));
	product.add(new Product(3,"switch","electronics",15,4));
	product.add(new Product(4,"dryfruits","eatable",400,9));
	product.add(new Product(5,"pens","usage",3.5,10));
	
	product.forEach(System.out::println);
	
	//product.stream().filter(s->s.getPrice()>30).count();
	System.out.println("product price >30:"+CountProductbyPrice(product));
	
	System.out.println("product price"+product);
	//List<Product> prd=product.stream().filter(s->s.getProductCategory().equals("fruits")).collect(Collectors.toList());
	
	System.out.println("prodcuts count :"+countProducts(product));
	System.out.println("product by sort:"+sortby(product));
	

}
}
