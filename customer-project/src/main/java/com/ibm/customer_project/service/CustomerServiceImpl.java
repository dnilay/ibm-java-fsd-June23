package com.ibm.customer_project.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ibm.customer_project.factory.MyConnectionFactory;
import com.ibm.customer_project.model.Customer;

public class CustomerServiceImpl implements CustomerService {

	private MyConnectionFactory myConnectionFactory = null;

	private List<Customer> customers;

	private Connection connection = null;

	{
		try {
			customers = new ArrayList<Customer>();
			myConnectionFactory = MyConnectionFactory.getMyFactory();
			connection = myConnectionFactory.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<Customer> getAllCustomers() throws SQLException {
		// TODO Auto-generated method stub
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from customers");
		while (resultSet.next()) {
			customers.add(new Customer(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3),
					resultSet.getString(4)));
		}
		return customers;
	}

	@Override
	public Customer createCustomer(Customer customer) throws SQLException {

		PreparedStatement pStatement = connection
				.prepareStatement("insert into customers(customer_id,first_name,last_name,email) values(?,?,?,?)");
		pStatement.setInt(1, customer.getCustomerId());
		pStatement.setString(2, customer.getFirstName());
		pStatement.setString(3, customer.getLastName());
		pStatement.setString(4, customer.getEmail());
		int result = pStatement.executeUpdate();
		System.out.println(result + " rows inserted/updated");

		return customer;
	}

	@Override
	public Customer findCustomerById(int customerId) throws SQLException {
		// TODO Auto-generated method stub
		PreparedStatement pStatement = null;
		pStatement = connection.prepareStatement("select * from customers where customer_id=?");
		pStatement.setInt(1, customerId);
		ResultSet rs= pStatement.executeQuery();
		while(rs.next())
		{
			customers.add(new Customer(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));
		}
		if(customers.isEmpty())
		{
			return null;
		}
		else
		{
			return customers.get(0);
		}
		
	}

	@Override
	public List<Customer> findCustomerByFirstName(String firstName) throws SQLException {
		// TODO Auto-generated method stub
		PreparedStatement pStatement = null;
		pStatement = connection.prepareStatement("select * from customers where first_name=?");
		pStatement.setString(1, firstName);
		ResultSet rs= pStatement.executeQuery();
		while(rs.next())
		{
			customers.add(new Customer(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));
		}
		if(customers.isEmpty())
		{
			return null;
		}
		else
		{
			return customers;
		}
		
	}

	@Override
	public Customer updateCustomer(int customerId, Customer customer) throws SQLException {
		// TODO Auto-generated method stub
		PreparedStatement pStatement = null;
		pStatement = connection.prepareStatement("select * from customers where customer_id=?");
		pStatement.setInt(1, customerId);
		ResultSet rs= pStatement.executeQuery();
		while(rs.next())
		{
			customers.add(new Customer(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));
		}
		if(customers.isEmpty())
		{
			return null;
		}
		else
		{
			pStatement = connection.prepareStatement("update customers set first_name=?,last_name=?,email=?  where customer_id=?");
			pStatement.setString(1, customer.getFirstName());
			pStatement.setString(2, customer.getLastName());
			pStatement.setString(3, customer.getEmail());
			pStatement.setInt(4, customerId);
			pStatement.executeUpdate();
			return customer;
		}
		
	}

}
