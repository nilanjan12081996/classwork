package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SelectById {

	public static void main(String[] args) {
		try(Connection conn=DatbaseConnection.getDbConnection() ;
				Scanner sc=new Scanner(System.in))
		{
			String sql1="select * from emp where id=?";
			PreparedStatement pst=conn.prepareStatement(sql1);
			System.out.println("enter the id: ");
			int id=sc.nextInt();
			pst.setInt(1, id);
			ResultSet rs1=pst.executeQuery();
			if(rs1.next())
			 {
				 System.out.println("Employee id: "+rs1.getInt(1));
				 System.out.println("Employee Name: "+rs1.getString("name"));
				 System.out.println("Employee E-mail: "+rs1.getString("email"));
				 System.out.println("Employee Salary: "+rs1.getInt(4));
				 System.out.println("=====================================");
			 }
			else
				System.out.println("id not found");
			 
			
		}catch(SQLException e)
		{
			System.out.println(e);
		}

	}

}
