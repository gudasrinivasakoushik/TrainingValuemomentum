package com.vm.training.java.date;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateDemo1 {
public static void main(String[] args) {
	
	LocalDate todaydate=LocalDate.now();
	System.out.println("date:"+todaydate);
	
	LocalDateTime datetime=LocalDateTime.now();
	System.out.println("time"+datetime.getDayOfYear());
	System.out.println("time"+datetime.getDayOfMonth());
	System.out.println("time"+datetime.getDayOfWeek());
}
}
