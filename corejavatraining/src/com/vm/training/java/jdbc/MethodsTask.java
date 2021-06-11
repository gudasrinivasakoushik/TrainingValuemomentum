package com.vm.training.java.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MethodsTask 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter id");
		int id=scanner.nextInt();
		System.out.println("enter name");
		String name=scanner.next();
		System.out.println("enter slary:");
		int sal=scanner.nextInt();
		System.out.println("eneter dept:");
		String dept=scanner.next();
		System.out.println("eneter age:");
		int age=scanner.nextInt();
		//System.out.println("enter city;");
		//String city=scanner.next();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Class Loaded");
			
			//Step-2:
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/digital?autoReconnect=true&useSSL=false\r\n","root","root");
			System.out.println("Connected");
			
			PreparedStatement st=con.prepareStatement("insert into employee values(?,?,?,?,?)");
			
			st.setInt(1, id);
			st.setString(2, name);
			st.setInt(3, sal);
			st.setString(4, dept);
			st.setInt(5, age);
			//st.setString(6, city);
			System.out.println(add(st));
			
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from employee");
			
			viewAll(rs);
			System.out.println("Enter id to search : ");
			int n=scanner.nextInt();
			ResultSet rs1=stmt.executeQuery("select * from employee where id=n");
			//st.setInt(1, id);
			
			viewById(rs1);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}



//Add
static boolean add(PreparedStatement st)
{
	try {
		st.execute();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return true;
	
}

//View All
static ResultSet viewAll(ResultSet rs)
{
	try {
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getInt(5));
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return rs;
	
}


//View By Id
static ResultSet viewById(ResultSet rs)
{
	try {
		while(rs.next())
		{
			System.out.println(rs.getInt(1));
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return rs;
	
}
}