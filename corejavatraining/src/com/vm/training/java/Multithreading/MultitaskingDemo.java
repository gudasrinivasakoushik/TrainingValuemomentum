package com.vm.training.java.Multithreading;
import java.util.*;
class Maniteja extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("teja:"+i);
		}
	}
}
class Santhosh extends Thread
{
	public void run()
	{
		for(int i=10;i<=20;i++)
		{
			System.out.println("santhosh:"+i);
		}
	}
}
class Saiteja extends Thread
{
	public void run()
	{
		for(int i=20;i<=30;i++)
		{
			try {
				sleep(1);
			}
			catch(InterruptedException e)
			{
			System.out.println("saiteja:"+i);
			e.printStackTrace();
			}
		}
	}
}

public class MultitaskingDemo {
public static void main(String[] args) {
	Maniteja m=new Maniteja();
	Santhosh s=new Santhosh();
	Saiteja sa=new Saiteja();
	m.run();
	Thread t1=new Thread(s);
	Thread t2=new Thread(sa);
	t1.start();
	t2.run();
	
}
}
