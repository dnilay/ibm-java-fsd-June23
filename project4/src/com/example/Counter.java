package com.example;

public class Counter {
	
	private final int MAX_VALUE;
	
	private static int count;
	
	private int a;
	private int b;
	
	{
		//MAX_VALUE=200;
		a=100;
		b=200;
	}
	
	static
	{
		count=0;
	}
	
	public Counter()
	{
		MAX_VALUE=200;
		count++;
		System.out.println(count);
	}
	
	public static void main(String args[])
	{
		/*
		 * Counter counter=new Counter(); Counter counte1r=new Counter(); Counter
		 * counter2=new Counter(); System.out.println(counter.a);
		 * System.out.println(counter.b);
		 */
		
		Employee e=new Employee("AA", 10, DEPT.IT);
	}

}
