package com.example.model;

public class Employee {
	
	
	private int id;
	private String name;
	public Employee() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	public String getDetails()
	{
		return "id"+id+"name"+name;
	}
	
	public void setSalary(int salary)
	{
		
	}
	
	
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	
	public void add(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	
	public void add(float a,float b)
	{
		System.out.println(a+b);
	}
	
	
	public void add(int... b)
	{
		
	}
}


