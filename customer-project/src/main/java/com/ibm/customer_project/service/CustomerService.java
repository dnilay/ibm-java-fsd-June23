package com.ibm.customer_project.service;

import java.sql.SQLException;
import java.util.List;

import com.ibm.customer_project.model.Customer;

public interface CustomerService {
	
	public List<Customer> getAllCustomers() throws SQLException;

}
