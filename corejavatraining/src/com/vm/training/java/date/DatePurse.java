package com.vm.training.java.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatePurse {

	
	public static void main(String[] args) {
		
		String startdate="2021-05-25";
		LocalDate ld=LocalDate.parse(startdate);
		System.out.println(ld);
		
		
		String bookindate="2021/May/25";
		
		DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("yyyy/mm/dd");
		System.out.println(dtf1);
		
		
	}
}
