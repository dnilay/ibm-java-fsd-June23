package com.ibm.customer_project;

import java.util.List;

import com.ibm.customer_project.model.Customer;
import com.ibm.customer_project.service.CustomerService;
import com.ibm.customer_project.service.CustomerServiceImpl;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			CustomerService service = new CustomerServiceImpl();
			Customer c = new Customer(5, "Marry", "Public", "marry@email.com");

			Customer c1 = service.createCustomer(new Customer(2, "John", "Doe", "john@email.com"));
			service.createCustomer(c);
			System.out.println(c1);
			List<Customer> l = service.getAllCustomers();
			for (Customer c2 : l) {
				System.out.println(c2);
			}

			/*
			 * Customer customer = service.findCustomerById(10);
			 * 
			 * if (customer == null) { System.out.println("no such customer exists"); } else
			 * { System.out.println("Customer Found: \n" + customer); }
			 */
			/*
			 * List<Customer> list=service.findCustomerByFirstName("Sachin"); if(list==null)
			 * { System.out.printf("No customer FOund with the given first name"); } else {
			 * for(Customer c: list) { System.out.println(c); } }
			 */

			/*
			 * Customer customer=service.updateCustomer(1, new Customer("John", "doe",
			 * "john.doe@gmail.com"));
			 * 
			 * if(customer==null) { System.out.println("update unsucessfull.."); } else {
			 * System.out.println("Customer updated: "+customer); }
			 */
			// service.deleteCustomerById(1);

			//service.deleteAllCustomers();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
