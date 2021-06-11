package com.vm.training.java.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class StoredProcedure {

	public static void main(String[] args) {
	
		try
		{
			Connection con=DBConnection.getConnection();
			
			//PreparedStatement ps=con.prepareStatement("select * from product");
			CallableStatement stmt=con.prepareCall("{call findAllRecord()}");
			ResultSet rs=stmt.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+ " "+rs.getString(2));
			}
			
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
