package com.example.demo.rest;

import java.util.Collection;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;
import org.springframework.http.MediaType;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/customers")
@AllArgsConstructor
public class CustomerController {

	private final CustomerService customerService;

	@PostMapping(produces = MediaType.APPLICATION_ATOM_XML_VALUE)
	public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
		customer.setCustomerId(UUID.randomUUID().toString());
		return new ResponseEntity<Customer>(customerService.createCustomer(customer), HttpStatus.CREATED);
	}

	@GetMapping(produces = MediaType.APPLICATION_ATOM_XML_VALUE)
	public ResponseEntity<Collection<Customer>> getAllCustomers() {
		return new ResponseEntity<Collection<Customer>>(customerService.getAllCustomers(), HttpStatus.OK);
	}
}
