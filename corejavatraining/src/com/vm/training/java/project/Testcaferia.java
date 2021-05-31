package com.vm.training.java.project;

public class Testcaferia {
public static void main(String[] args) {
	Menu menu=new Menu();
	Bookings book=new Bookings();
	System.out.println("Caferia special");
	Menu.meals();
	
	Menu.tiffins();
	
	Menu.snacks();

	Menu.evening();
	System.out.println("advance booking should provide");
	Bookings.Name();
	Bookings.Time();
	Bookings.Count();
	Bookings.Date();
}
}
