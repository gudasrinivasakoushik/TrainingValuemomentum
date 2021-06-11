package com.vm.training.java.codingtest;

public class Employee {
	private String firstname;
	private String lastname;
	public Employee(String firstname, String lastname) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
	}
	@Override
	public String toString() {
		return "Employee [firstname=" + firstname + ", lastname=" + lastname + "]";
	}
	
	public String ValaidateMethod(String firstname,String lastname)
	{
		if(firstname=="" && lastname=="")
		{
			try
			{
				throw new  NullPonterExceptionClass("Entry missing");
			}
			catch( NullPonterExceptionClass e)
			{
				e.printStackTrace();
			}
		}else
		{
			System.out.println(firstname + lastname);
		}
		return "entry missing";
	}
	
	

}
