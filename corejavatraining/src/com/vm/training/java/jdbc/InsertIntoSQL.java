package com.vm.training.java.jdbc;
import java.sql.CallableStatement;
import java.sql.Connection;

public class InsertIntoSQL {

	public static void main(String[] args) {


		try
		{
			Connection con=DBConnection.getConnection();
			CallableStatement stmt=con.prepareCall("{call insertNewEmployee(?,?,?,?,?)}");
			stmt.setInt(1, 13);
			stmt.setString(2, "sravan");
			stmt.setInt(3, 30000);
			stmt.setString(4, "dev");
			stmt.setInt(5, 25);
			stmt.execute();
			System.out.println("Inserted");


			
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}

}