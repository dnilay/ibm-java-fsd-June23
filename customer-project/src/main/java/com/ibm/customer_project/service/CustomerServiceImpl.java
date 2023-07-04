package com.ibm.customer_project.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ibm.customer_project.factory.MyConnectionFactory;
import com.ibm.customer_project.model.Customer;

public class CustomerServiceImpl implements CustomerService {
	
	private MyConnectionFactory myConnectionFactory=null;
	
	private List<Customer> customers;
	
	private Connection connection=null;
	
	{
		try {
			customers=new ArrayList<Customer>();
			myConnectionFactory=MyConnectionFactory.getMyFactory();
			connection=myConnectionFactory.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<Customer> getAllCustomers() throws SQLException {
		// TODO Auto-generated method stub
		Statement statement=connection.createStatement();
		ResultSet resultSet=statement.executeQuery("select * from customers");
		while(resultSet.next())
		{
			customers.add(new Customer(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4)));
		}
		return customers;
	}

}
