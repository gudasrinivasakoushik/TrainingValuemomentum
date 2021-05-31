package com.vm.training.java.Exceptions;
import java.util.*;
public class ProductDetailsTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter product number");
		int productNo=sc.nextInt();
		try {
			if(productNo>5)
			{
				throw new ProductNotReceived("your product does not exist");
			}
		}
		catch(ProductNotReceived e)
		{
			e.printStackTrace();
		}
		int pdam;
		System.out.println("if product damaged press number >0");
		pdam=sc.nextInt();
		try {
			if(pdam==0)
			{
				throw new ProductDamaged("your product damaged we will return ");
			}
			else
			{
				System.out.println("thanks for oredering");
			}
		}
		catch(ProductDamaged e1)
		{
			e1.printStackTrace();
		}
		int nodays;
		System.out.println("enter how many days from order");
		nodays=sc.nextInt();
		try {
			if(nodays>10)
			{
				throw new ExceededRetrunLimit("your product damaged");
			}
			else
			{
				System.out.println("we will look");
			}
		}
		catch(ExceededRetrunLimit e2)
		{
			e2.printStackTrace();
		}
	}
}

