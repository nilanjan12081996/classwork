package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateEmp {

	public static void main(String[] args) {
		try(Connection conn=DatbaseConnection.getDbConnection() ;
				Scanner sc=new Scanner(System.in))
		{
			System.out.println("enter the name: ");
			String name=sc.nextLine();
			
			System.out.println("enter the email: ");
			String mail=sc.nextLine();
			
			System.out.println("enter the slaray: ");
			int salary=sc.nextInt();
			
			String query1="update emp set name='"+name+"',email='"+mail+"',salary='"+salary+"'where id=?";
			PreparedStatement pst1=conn.prepareStatement(query1);
			System.out.println("enter id: ");
			int id =sc.nextInt();
			pst1.setInt(1, id);
			int row=pst1.executeUpdate();
			System.out.println(row+" record updated successfully");
			String query2="select * from emp where id='"+id+"'";
			PreparedStatement pst2=conn.prepareStatement(query2);
		ResultSet rst=pst2.executeQuery();
			if(rst.next())
			{
				System.out.println("Id: "+rst.getInt("id"));
				System.out.println("Name: "+rst.getString("name"));
				System.out.println("Email: "+rst.getString("email"));
				System.out.println("Salary: "+rst.getInt("salary"));
				System.out.println("========================");
			}
			else
				System.out.println("id not found");
		}catch(SQLException e)
		{
			System.out.println(e);
		}

	}

}
