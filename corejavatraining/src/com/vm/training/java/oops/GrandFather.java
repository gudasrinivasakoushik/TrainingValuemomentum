package com.vm.training.java.oops;

public class GrandFather {
int age;

/* GrandFather(int age) {
	
	this.age = age;
}*/
 	void walk()
 	{
 		System.out.print("i cant go fast because my age is ;"+age);
 	}
}
class Father extends GrandFather
{
	
	void walk()
	{
		System.out.println("icann wlak fast");
	}
}
class son extends Father
{
	void walk()
	{
		System.out.print("i can run");
	}
}
