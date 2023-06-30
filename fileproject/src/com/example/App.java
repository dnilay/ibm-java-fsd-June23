package com.example;

import java.util.Properties;

public class App {
	
	public static void main(String args[])
	{
		
		  String firstName=args[0]; String lastName=args[1]; int
		  salary=Integer.parseInt(args[2]);
		  System.out.println("First Name: "+firstName+" Last Name: "
		  +lastName+" Salary: "+salary);
		 Properties properties=System.getProperties();
		 properties.list(System.out);
		
	}
	


}


//int--Integr
//char--Character;
//boolean---Boolean
//float---Float
//double---Double
