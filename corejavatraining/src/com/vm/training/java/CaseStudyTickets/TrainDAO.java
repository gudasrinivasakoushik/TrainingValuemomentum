package com.vm.training.java.CaseStudyTickets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.vm.training.java.jdbc.Train;

public class TrainDAO {

		private String DRIVER_NAME="com.mysql.cj.jdbc.Driver";
		private String DB_URL="jdbc:mysql://localhost:3306/train?autoReconnect=true&useSSL=false";
		private String USERNAME="root";
		private String PASSWORD="root";
		
		
		
		public Train findTrain(int n) 
		{
			Train t = null;
			try {
			Class.forName(DRIVER_NAME);
			Connection con=DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
			 PreparedStatement ps=con.prepareStatement("select * from trains");
				ResultSet rs=ps.executeQuery();
			
			while(rs.next())
			{
				if(rs.getInt(1)==n)
				{
					
					 t =new Train(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),(double) rs.getInt(5));
			    }
			}
			
			
		
		
		
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	
}
	}
