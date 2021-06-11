package com.vm.training.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

import java.sql.*;



public class MysqlConnection {
public static void main(String[] args) throws SQLException {
	
	
	try {
		//step-1
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver class loaded");
		//step-2
		
	Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/digital?autoReconnect=true&useSSL=false\r\n"
			, "root", "root");
		System.out.println("connected");
		
		Statement stmt=con1.createStatement();
		stmt.execute("insert into product values(1,'milk',30)");
		//stmt.execute("create table teacher(id int,name varchar(30),subject varchar(30))");
		System.out.println("inserted");
		
		ResultSetMetaData rsd = rs.getMetaData();
		System.out.println(rsd.getColumnName(1)+"\t"+rsd.getColumnName(2)+"\t\t"+rsd.getColumnName(3)+"\t"+rsd.getColumnName(4));
		System.out.println("-------------------------------------------------------------------");
		while(rs.next())
		{
			System.out.println("|"+rs.getInt(1)+"|\t|"+rs.getString(2)+"|\t|"+rs.getInt(3)+"|\t|"+rs.getString(4)+"|");
		}
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	}
	
}
}
