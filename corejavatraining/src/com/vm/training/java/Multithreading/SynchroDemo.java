package com.vm.training.java.Multithreading;
import java.util.*;
class Bottle
{
	synchronized public void drink(int time)
	{
		for(int i=0;i<time;i++)
		{
			System.out.println(Thread.currentThread().getName()+"is drinking"+i);
		}
	}
}
class DrinkWater implements Runnable
{
	Bottle bottle=new Bottle();
	public void run()
	{
		bottle.drink(6);
	}
}
public class SynchroDemo {
public static void main(String[] args) {
	DrinkWater drinkwater=new DrinkWater();
	Thread kou=new Thread(drinkwater);
	Thread subha=new Thread(drinkwater);
	kou.setName("teja");
	subha.setName("subha");
	//kou.run();
	//kou.bottle();
	//System.out.println("koushim drinking:"+kou);
	kou.start();
	subha.start();
}
}
