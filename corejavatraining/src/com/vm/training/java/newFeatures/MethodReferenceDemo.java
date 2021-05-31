package com.vm.training.java.newFeatures;

interface Validate
{
		void validateLogin();
	
}
class Car
{
	void myLogin()
	{
		System.out.println("you can login using username and password");
	}
}
class Bus
{
	static void login()
	{
		System.out.println("this is login");
	}
}

public class MethodReferenceDemo {

	public static void main(String[] args) {
	
		
		Validate v =()->System.out.println("validate login");
		v.validateLogin();
		Car c=new Car();
		Validate v1=c::myLogin;
		v1.validateLogin();
		Validate v2=Bus::login;
		v2.validateLogin();
		
	}
}
