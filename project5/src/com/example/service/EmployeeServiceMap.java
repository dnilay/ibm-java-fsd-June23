package com.example.service;

import java.util.Collection;

import com.example.model.Employee;

public interface EmployeeServiceMap {
	
	public Employee createEmployee(Employee employee);
	
	public Collection<Employee> getAllEmployees();

}
