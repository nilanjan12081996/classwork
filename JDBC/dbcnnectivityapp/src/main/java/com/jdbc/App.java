package com.jdbc;

import java.sql.Connection;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Connection conn=DatbaseConnection.getDbConnection();
    	
        System.out.println( conn );
    }
}
