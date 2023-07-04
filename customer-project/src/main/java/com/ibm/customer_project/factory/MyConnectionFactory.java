package com.ibm.customer_project.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class MyConnectionFactory {
	
	private   Connection CONNECTION=null;
	
	private static MyConnectionFactory myConnectionFactory;
	
	private MyConnectionFactory() throws SQLException
	{	 
		
	}
	
	
	
	public Connection getConnection() throws SQLException
	{
		DriverManager.registerDriver(new Driver());
		CONNECTION=DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","root");
		return CONNECTION;
	}
	
	
	public static MyConnectionFactory getMyFactory() throws SQLException
	{
		try {
			if(myConnectionFactory==null)
			{
				myConnectionFactory=new MyConnectionFactory();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return myConnectionFactory;
	}

}
