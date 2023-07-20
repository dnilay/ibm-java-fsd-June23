package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	private CustomerService customerService;

	public CustomerController(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}

	@GetMapping
	public String showDate(Model theModel) {
		theModel.addAttribute("theDate", new Date());
		return "hello-world";
	}

	@GetMapping("/list")
	public String listCustomers(Model theModel) {

		List<Customer> theCustomers =null;
		theCustomers=customerService.getAllCustomers();
		theModel.addAttribute("customers", theCustomers);
		return "customer-list";
	}
}
