package com.example.test;

import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

import com.example.model.Employee;
import com.example.service.EmployeeServiceMap;
import com.example.service.EmployeeServiceMapImpl;

public class App {

	public static void main(String[] args) {
		EmployeeServiceMap map=new EmployeeServiceMapImpl();
		map.createEmployee(new Employee(new Random().nextInt(100), "John", "Doe", "john@email.com"));
		map.createEmployee(new Employee(new Random().nextInt(100), "Marry", "Public", "marry@email.com"));
		map.createEmployee(new Employee(new Random().nextInt(100), "Rahul", "Dravid", "rahul@email.com"));
		Collection<Employee> employees=map.getAllEmployees();
		
		Iterator<Employee> iterator=employees.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		

	}

}
