package com.vm.training.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;


public class RetreiveDemo {

	public static void main(String[] args) throws Exception{
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("classs loaded");
			Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/digital?autoReconnect=true&useSSL=false\r\n"
					, "root", "root");
				System.out.println("connected");
				Statement stmt=con1.createStatement();
				ResultSet rs=stmt.executeQuery("select * from product");
				while(rs.next())
				{
					System.out.println(rs.getInt(1)+ " "+rs.getString(2)+" "+rs.getInt(3));
				}
				ResultSetMetaData rsd = rs.getMetaData();
				System.out.println(rsd.getColumnName(1)+"\t"+rsd.getColumnName(2)+"\t\t"+rsd.getColumnName(3));
				System.out.println("-------------------------------------------------------------------");
				while(rs.next())
				{
					System.out.println("|"+rs.getInt(1)+"|\t|"+rs.getString(2)+"|\t|"+rs.getInt(3));
				}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
/*public static void main(String[] args) 
{
	
try
	{
		Class.forName("com.mysql.cj.driver.Driver");
		System.out.println("classs loaded");
		
		Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/digital?autoReconnect=true&useSSL=false\r\n"
				, "root", "root");
			System.out.println("connected");
			Statement stmt=con1.createStatement();
			ResultSet rs=stmt.executeQuery("select * from product");
			while(rs.next())
			{
				System.out.println(rs.getInt(2)+ " "+rs.getString(2)+" "+rs.getInt(3));
			}
			
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	
	
}*/