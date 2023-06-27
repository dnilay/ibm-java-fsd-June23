package com.example.model;

public class Manager extends Employee {
	
	private String department;

	public Manager() {
		super();
	}

	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return super.getDetails()+" Department: "+department;
	}
	

}
