package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertRecordUsingPs {

	public static void main(String[] args) {
try(Connection conn=DatbaseConnection.getDbConnection() ;
	Scanner sc=new Scanner(System.in))
	{
	String sql="insert into emp values(?,?,?,?)";
	PreparedStatement ps=conn.prepareStatement(sql);
	System.out.println("enter the id: ");
	int id=sc.nextInt();
	sc.nextLine();
	System.out.println("enter the name: ");
	String name=sc.nextLine();
	
	System.out.println("enter the email: ");
	String mail=sc.nextLine();
	
	System.out.println("enter the slaray: ");
	int salary=sc.nextInt();
	
	ps.setInt(1, id);
	ps.setString(2, name);
	ps.setString(3,mail);
	ps.setInt(4, salary);
	int r=ps.executeUpdate();
	System.out.println(r+" record inserted successfully");
	
}catch(SQLException e)
{
	System.out.println(e);
	}
	}

}
