package com.example;

public class Manager extends Employee{
	
	private DEPT dept;
	

	public Manager(DEPT dept) {
		super();
		this.dept = dept;
	}


	/*
	 * public Manager() { super(); }
	 * 
	 * public Manager(String department) { super(); this.department = department; }
	 */
	/*
	 * @Override public String getDetails() {
	 * 
	 * }
	 */
	
	public static void main(String args[])
	{
		Manager m=new Manager(DEPT.SALES);
	}

}
