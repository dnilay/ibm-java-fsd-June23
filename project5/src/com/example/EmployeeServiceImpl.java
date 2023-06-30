package com.example;

import java.util.HashSet;
import java.util.Set;

import com.example.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	private Set<Employee> employees;

	{
		employees = new HashSet<>();
	}

	@Override
	public void createEmployee(Employee employee) {

		employees.add(employee);
	}

	@Override
	public Set<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employees;
	}

	@Override
	public Employee findEmployeeById(int id) {
		Employee employee = null;
		for (Employee e : employees) {
			if (e.getEmployeeId() == id) {
				employee = e;
				break;
			}
		}
		return employee;
	}

}
