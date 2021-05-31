package com.vm.training.java.Exceptions;

import java.sql.Connection;
import java.sql.DriverManager;

public class CheckExceptionIdentity {
public static void main(String[] args) {
	try {
		int[] i= {1,2};
		System.out.println(i[2]);
		Connection con=DriverManager.getConnection("","","");
	}
	catch(Exception e)
	{
		System.out.println(e);
		e.printStackTrace();
	}
}
}
