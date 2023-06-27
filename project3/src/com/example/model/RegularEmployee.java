package com.example.model;

public class RegularEmployee extends Employee {
	
	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return super.getDetails()+" salary "+salary;
	}

	private double salary;

	public RegularEmployee() {
		super();
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public void setSalary(int salary) {
		this.salary=salary;
	}
	
	

}
