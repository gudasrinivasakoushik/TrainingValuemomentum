package com.vm.training.java.Multithreading;

class Employee extends Thread
{
	public void run()
	{
		System.out.println("this is employee");
	}
}
class Student implements Runnable
{
	public void run()
	{
		System.out.println("this is student");
	}
}
public class CreateDemo {
public static void main(String[] args) {
	Employee em=new Employee();
	em.run();
	em.start();
	Student s=new Student();
	Thread t1=new Thread(s);
	t1.start();
}
}
