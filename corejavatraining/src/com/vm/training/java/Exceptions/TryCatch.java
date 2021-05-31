package com.vm.training.java.Exceptions;
class Employee
{
	int id;

	public Employee(int id) {
		super();
		this.id = id;
	}
	
}
public class TryCatch {
public static void main(String[] args) {
	
	int[] i= {1,2};
	Employee e=null;
	int n1=1,n2=2,s=0;
	try
	{
	System.out.println("ok");
	s=n1+n2;
	System.out.println(2/0);
	System.out.println(i[2]);
	}
	catch(Exception e1)
	{
		System.out.println(e1);
	}
}
}
