package com.example;

import com.example.model.Employee;
import com.example.model.RegularEmployee;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// base class ref variable can refer an object of derived class
		// dynamic method dispatching
		/*
		 * Student student; student=new StreamedStudent(); student.createStudent(100,
		 * "Marry", "CS");
		 * 
		 * System.out.println(student.getDetails());
		 */

		Employee employee = new RegularEmployee();
		employee.setId(100);
		employee.setName("Marry");
		employee.setSalary(3000);
		System.out.println(employee.getDetails());
		

	}

}
