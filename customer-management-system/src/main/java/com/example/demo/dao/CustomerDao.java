package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.Customer;

public interface CustomerDao {
	
	public List<Customer> getAllCustomers();
	
	public void saveCustomer(Customer customer);
	
	public Customer findCustomerById(int customerId);

}
