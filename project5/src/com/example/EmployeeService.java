package com.example;

import java.util.List;
import java.util.Set;

import com.example.model.Employee;

public interface EmployeeService {
	
	public void createEmployee(Employee employee);
	
	//generics
	public Set<Employee> getAllEmployees();
	
	
	public Employee findEmployeeById(int id);

}
