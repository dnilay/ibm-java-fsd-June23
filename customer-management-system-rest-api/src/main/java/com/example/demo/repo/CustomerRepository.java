package com.example.demo.repo;

import java.util.Collection;

import com.example.demo.model.Customer;

public interface CustomerRepository {

	Customer createCustomer(Customer customer);

	Collection<Customer> getAllCustomers();

}
