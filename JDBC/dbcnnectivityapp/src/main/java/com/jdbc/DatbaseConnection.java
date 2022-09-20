package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatbaseConnection {
	static Connection con=null;
	//this method will create connection and return connection object
	public static Connection getDbConnection() 
	{
		try {
		//register driver
		Class.forName("com.mysql.cj.jdbc.Driver");
	con= DriverManager.getConnection("jdbc:mysql://localhost:3306/anudip","root","root");
	
	
	}catch(Exception e)
		{
		System.out.println(e);
		}
		return con;
	}

}
