package com.ibm.customer_project.model;

public class Customer {
	
	private int customerId;
	private String firstName;
	private String lastName;
	private String email;
	public Customer() {
		super();
	}
	public Customer(int customerId, String firstName, String lastName, String email) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + "]";
	}
	

}
