package com.vm.training.java.newFeatures;


interface Calculate1
{
	void addition(int a,int b);
}
interface Calculate2
{
	int multiply(int a,int b);
}

interface Large
{
	int Findlarge(int a,int b);
}



public class LamdaExpressionsWithParameters {

	public static void main(String[] args) {
		
		
		Calculate1 c=(a,b)->System.out.println("addition:"+ (a+b));
		c.addition(2,4);
		
		Calculate2 c2=(a,b)->(a*b);
		System.out.println("multiply:"+c2.multiply(2, 4));
		
		Large large =(a,b)->{
			if(a>b)
			{
				return a;
			}
			else
			{
				return b;
			}
		};
		System.out.println("largest number is:"+large.Findlarge(3,6));
	}
}
