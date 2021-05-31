package com.vm.training.java.oops;

public class TestAssociation {

	static void showAggregation() {
		Address address=new Address();
		address.setcity("vijayawada");
		address.setstate("AP");
		address.setcountry("india");
		
		Emp emp=new Emp();
		emp.setId(1001);
		emp.setFirstName("guda");
		emp.setLastName("koushik");
		emp.setAddress(address);
		
		System.out.println(emp);
		System.out.println("---------------");
		emp=null;
		System.out.println(emp);
		System.out.println(address);
		
	}
	static void showComposition()
	{
		Person person=new Person();
		
	}
}
