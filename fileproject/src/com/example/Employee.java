package com.example;

import java.io.Serializable;

public class Employee implements Serializable {
	
	private String employeeID;
	private String name;
	public Employee() {
		super();
	}
	public Employee(String employeeID, String name) {
		super();
		this.employeeID = employeeID;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", name=" + name + "]";
	}
	
	

}
