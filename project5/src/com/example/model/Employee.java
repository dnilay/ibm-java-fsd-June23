package com.example.model;

public class Employee implements Comparable<Employee> {
	
	private int employeeId;
	private String firstName;
	private String lastName;
	private String email;
	private double salary;
	
	public Employee() {
		super();
	}
	
	
	public Employee(int employeeId, String firstName, String lastName, String email,double salary) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.salary=salary;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Employee ID: "+getEmployeeId()+" First Name: "+getFirstName()+" Last Name: "+getLastName()+" Email: "+getEmail()+" Salary: "+getSalary();
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee employee=null;
		if(obj instanceof Employee)
		{
			employee=(Employee)obj;
		}
		
		if((this.getEmployeeId()==employee.getEmployeeId())&&(this.getFirstName().equals(employee.getFirstName()))
				&&(this.getLastName().equals(employee.getLastName()))&&(this.email.equals(employee.getEmail())&&(this.getSalary()==employee.getSalary())))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}


	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		double f=getSalary()-o.getSalary();
		if(f==0.0)
			return 0;
		else if(f<0.0)
		{
			return 1;
		}
		else 
		{
			return -1;
		}
		
		
	}
}
