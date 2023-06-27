package com.example;

import com.example.model.Employee;
import com.example.model.HourlyEmployee;
import com.example.model.Manager;
import com.example.model.RegularEmployee;
import com.example.model.TaxCalculator;

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

		/*
		 * Employee employee = new RegularEmployee(); employee.setId(100);
		 * employee.setName("Marry"); employee.setSalary(3000);
		 * System.out.println(employee.getDetails());
		 */
		/*
		 * Employee e= new RegularEmployee(); if(e instanceof HourlyEmployee) {
		 * System.out.println("HE"); } else if(e instanceof RegularEmployee) {
		 * System.out.println("RE"); } else { System.out.println("EMPLOYEE"); }
		 */
		
		TaxCalculator taxCalculator=new TaxCalculator();
		taxCalculator.calculateTax(new Manager());

	}

}
