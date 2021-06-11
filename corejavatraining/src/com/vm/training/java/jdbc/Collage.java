package com.vm.training.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Collage {

	
	static void display()
	{
		System.out.println("1.Insert");
		System.out.println("2.DisplayAll");
		System.out.println("3.Display by id");
	}
	
	static void add(Connection con1,int id,String name,String address) throws SQLException
	{
		
		PreparedStatement ps=con1.prepareStatement("insert into college1 values(?,?,?)");
		
		ps.setInt(1, id);
		
		ps.setString(2, name);
	
		ps.setString(3, address);
		ps.executeUpdate();
	}
	static void DisplayAll(Connection con1, Statement stmt) throws SQLException
	{
		ResultSet rs=stmt.executeQuery("select * from college1");
		System.out.println("ID  Name  Address");
		System.out.println("--  ----  --------");
	    while(rs.next())
	    {
	    	System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"    "+rs.getString(3));
	    }
		
	}
	static void DiaplayById(Connection con1, Statement stmt,int id) throws SQLException
    {
		PreparedStatement ps=con1.prepareStatement("select * from college1 where id=?");
		ps.setInt(1, id);
		ResultSet rs=ps.executeQuery();
		System.out.println("ID  Name  Address");
		System.out.println("--  ----  --------");
		while(rs.next())
	    {
	    	System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"    "+rs.getString(3));
	    }
		
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc=new Scanner(System.in);
		try {
			Connection con1=DBConnection.getConnection();
		   System.out.println("connected to digital database");
		   
		   
		   Statement stmt=con1.createStatement();
		  // stmt.execute("create table college1(id int,name varchar(20),address varchar(30))");
		   System.out.println("created");
		   
		   int n=-1;
		   
		   while(n!=0)
		   {
			   System.out.println();
			   display();
			  
			   n=sc.nextInt(); 
			   
			   switch(n)
			   {
			   case 1:
				   System.out.println("How many records you want to enter");
				   int num=sc.nextInt();
				   for(int i=0;i<num;i++)
				   {
					   System.out.print("enter id: ");
					   int id=sc.nextInt();
					   System.out.print("enter name: ");
					   String name=sc.next();
					   System.out.print("enter address: ");
					   String address=sc.next();
					   add(con1,id,name,address);
					  
				   }
				   break;
			   
			   case 2:
				   DisplayAll(con1,stmt);
				   break;
				   
			   case 3:
				   System.out.print("enter id : ");
				   int id=sc.nextInt();
				   DiaplayById(con1,stmt,id);
				   break;
			   }
		   }
		   
		   
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}