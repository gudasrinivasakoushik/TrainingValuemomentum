package com.vm.training.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.*;
public class PrepareStatementDemo {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("classs loaded");
			Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/digital?autoReconnect=true&useSSL=false\r\n"
					, "root", "root");
				System.out.println("connected");
				
				PreparedStatement ps=con1.prepareStatement("insert into student40 (name,dept,year) values(?,?,?)");
				
				System.out.println("enter student name");
				ps.setString(1, sc.next());
				System.out.println("enter student dept");
				ps.setString(2, sc.next());
				System.out.println("enter student year");
				ps.setString(3, sc.next());
				ps.execute();
				System.out.println("inserted");
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
