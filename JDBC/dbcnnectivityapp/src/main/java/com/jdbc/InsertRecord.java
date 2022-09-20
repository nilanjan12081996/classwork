package com.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertRecord {

	public static void main(String[] args) {
		try(Connection conn=DatbaseConnection.getDbConnection())
		{
			//static query-you know values at the compilation time,need to use statement
			Statement st=conn.createStatement();
			String query="insert into emp values(101,'Nilanjan','nilanjan@gmail.com',30000)";
			int row=st.executeUpdate(query);
			System.out.println(row+" recoed insert successfuly");
		}catch(SQLException e)
		{
			System.out.println(e);
		}

	}

}
