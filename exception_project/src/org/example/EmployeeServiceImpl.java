package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EmployeeServiceImpl implements EmployeeService {
	
	private List<Employee> employees;
	
	{
		employees=new ArrayList<>();
	}

	@Override
	public Employee createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employee.setId(new Random().nextInt(100));
		employees.add(employee);
		return employee;
	}

}
