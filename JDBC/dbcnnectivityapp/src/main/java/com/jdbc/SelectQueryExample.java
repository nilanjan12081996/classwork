package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectQueryExample {

	public static void main(String[] args) {
		try(Connection conn=DatbaseConnection.getDbConnection())
		 {
		 String sql="select * from emp";
		 PreparedStatement ps1=conn.prepareStatement(sql);
		 ResultSet rs=ps1.executeQuery();
		
		 while(rs.next())
		 {
			 System.out.println("Employee id: "+rs.getInt(1));
			 System.out.println("Employee Name: "+rs.getString("name"));
			 System.out.println("Employee E-mail: "+rs.getString("email"));
			 System.out.println("Employee Salary: "+rs.getInt(4));
			 System.out.println("=====================================");
		 }
		 
		 }catch(SQLException e)
		{
			 System.out.println(e);
		}

	}

}
