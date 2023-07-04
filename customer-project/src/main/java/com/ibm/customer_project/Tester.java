package com.ibm.customer_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import com.ibm.customer_project.model.Customer;
import com.ibm.customer_project.service.CustomerService;
import com.ibm.customer_project.service.CustomerServiceImpl;
import com.mysql.cj.jdbc.Driver;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			/*
			 * //registering driver DriverManager.registerDriver(new Driver());
			 * //establishing the connection Connection
			 * connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/hr",
			 * "root","root"); //creating statement object Statement
			 * statement=connection.createStatement(); //storing query data into result set
			 * ResultSet rs= statement.executeQuery("select * from customers"); //looping
			 * over resultset and retriving the data while(rs.next()) {
			 * System.out.println(rs.getInt("customer_id")+","+rs.getString("first_name")+
			 * ","+rs.getString("last_lase")+","+rs.getString("email")); }
			 */
			
			
			CustomerService service=new CustomerServiceImpl();
			List<Customer> l=service.getAllCustomers();
			for(Customer c:l)
			{
				System.out.println(c);
			}
			
			
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
