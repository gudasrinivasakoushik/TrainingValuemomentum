package com.vm.training.java.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateFormatterDemo {

	public static void main(String[] args) {
		LocalDate today=LocalDate.now();
		
		System.out.println(LocalDate.now());
		
		DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		String afterFormat=today.format(dtf);
		System.out.println(afterFormat);
		
		DateTimeFormatter dtfull=DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		DateTimeFormatter dtmedium=DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		DateTimeFormatter dtshort=DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		
		String fulldate=today.format(dtfull);
		System.out.println("full date:"+fulldate);
		
		String umdate=today.format(dtmedium);
		System.out.println("full date:"+umdate);

		String shortdate=today.format(dtshort);
		System.out.println("full date:"+shortdate);

		
	}
	
}
