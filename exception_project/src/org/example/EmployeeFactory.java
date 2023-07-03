package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmployeeFactory {

	private BufferedReader bufferedReader = null;
	private EmployeeService employeeService = null;
	private Employee employee;
	{
		bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		employeeService = new EmployeeServiceImpl();
		employee=new Employee();
	}

	public void createEmployee() throws IOException, NumberFormatException {

		System.out.print("Enter Employee Name: ");
		String eName=bufferedReader.readLine();
		System.out.print("Enter Employee Salary: ");
		double eSalary=Double.parseDouble( bufferedReader.readLine());
		employee.setName(eName);
		employee.setSalary(eSalary);
		Employee e=employeeService.createEmployee(employee);
		System.out.println("Employee Created: "+e);
		

	}

}
