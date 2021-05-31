package com.vm.training.java.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class DateCalculation {

	public static void main(String[] args) {
		LocalDate today=LocalDate.now();
		
		/*System.out.println("today"+today);
		System.out.println("tommarrow:"+today.plusDays(1));
		System.out.println("tommarrow:"+today.plusMonths(3));
		System.out.println("tommarrow:"+today.plusYears(4));
		System.out.println("tommarrow:"+today.plusWeeks(1));
		
		
		LocalDate BookingDate=LocalDate .of(2021, 5,30);*/
		Scanner sc=new Scanner(System.in);
		
		
		
		String date=sc.next();
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate toda=LocalDate.parse(date,dtf);
		System.out.println(today);
		LocalDate BookingDate=LocalDate.parse(BookingDate, dtf);
		if(BookingDate.isAfter(today))
		{
			System.out.println("correct date u can bbok");
			
		}
		else
		{
			System.out.println("invalid date");
		}
	}
	
}
