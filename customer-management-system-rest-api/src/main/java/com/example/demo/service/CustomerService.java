package com.example.demo.service;

import java.util.Collection;

import com.example.demo.model.Customer;

public interface CustomerService {

	Customer createCustomer(Customer customer);

	Collection<Customer> getAllCustomers();
}
