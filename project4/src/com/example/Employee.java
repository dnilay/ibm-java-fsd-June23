package com.example;

public class Employee {
	
	private String name;
	private double salary;
	private DEPT dept;
	
	
	public Employee() {
		super();
	}


	public Employee(String name, double salary,DEPT dept) {
		super();
		this.name = name;
		this.salary = salary;
		this.dept=dept;
	}


	public final String getDetails()
	{
		return "name" +name+" salary"+salary;
	}

}
