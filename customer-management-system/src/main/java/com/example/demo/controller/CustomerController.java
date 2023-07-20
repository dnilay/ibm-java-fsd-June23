package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Customer;
import com.fasterxml.jackson.annotation.JsonCreator.Mode;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@GetMapping
	public String showDate(Model theModel) {
		theModel.addAttribute("theDate", new Date());
		return "hello-world";
	}

	@GetMapping("/list")
	public String listCustomers(Model theModel)
	{
		
		Customer cust1 = new Customer(1, "Leslie", "Andrews", "leslie@luv2code.com");
		Customer cust2 = new Customer(2, "Emma", "Baumgarten", "emma@luv2code.com");
		Customer cust3 = new Customer(3, "Avani", "Gupta", "avani@luv2code.com");
		// create the list
		List<Customer> theCustomers = new ArrayList<Customer>();
		// add to the list
		theCustomers.add(cust1);
		theCustomers.add(cust2);
		theCustomers.add(cust3);
		// add to the spring model
		theModel.addAttribute("customers", theCustomers);
		return "customer-list";
	}
}
