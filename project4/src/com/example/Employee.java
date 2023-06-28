package com.example;

public class Employee {
	
	private String name;
	private double salary;
	
	
	public Employee() {
		super();
	}


	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}


	public final String getDetails()
	{
		return "name" +name+" salary"+salary;
	}

}
