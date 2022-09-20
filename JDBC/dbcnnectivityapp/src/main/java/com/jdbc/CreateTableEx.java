package com.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class CreateTableEx {
	public static void main(String[] args)
	{
		//try with resource
		try(Connection conn=DatbaseConnection.getDbConnection())
	 {
	//create statement
	Statement st=conn.createStatement();
	//write/create query
	String sql="create table emp(id int primary key,name varchar(50),email varchar(70),salary int)";
	//execute query
	st.executeUpdate(sql);
	System.out.println("Table created successfully");
	}catch(Exception e){
		System.out.println(e.getMessage());
	}

}
}
