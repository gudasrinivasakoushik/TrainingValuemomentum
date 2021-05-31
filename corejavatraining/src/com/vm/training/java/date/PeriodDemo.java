package com.vm.training.java.date;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo {
public static void main(String[] args) {
	LocalDate today=LocalDate.now();
	LocalDate joinDate=LocalDate.of(2000,4,4);
	Period period=Period.between(joinDate,today);
	
	System.out.println("year: "+period.getYears()+" months: "+period.getMonths()+" days: "+period.getDays());
	
}
}
