package com.example.demo.repo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Customer;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {

	private final Map<Integer, Customer> customers;

	{
		customers = new HashMap<Integer, Customer>();
	}

	@Override

	public Customer createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customers.put(new Random().nextInt(10000), customer);
		return customer;
	}

	@Override
	public Collection<Customer> getAllCustomers() {
		Collection<Customer> collection = customers.values();
		return collection;
	}

}
