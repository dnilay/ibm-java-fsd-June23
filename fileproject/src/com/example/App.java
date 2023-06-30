package com.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class App {

	public static void main(String args[]) throws IOException, ClassNotFoundException {

		/*
		 * String firstName=args[0]; String lastName=args[1]; int
		 * salary=Integer.parseInt(args[2]);
		 * System.out.println("First Name: "+firstName+" Last Name: "
		 * +lastName+" Salary: "+salary); Properties properties=System.getProperties();
		 * properties.list(System.out);
		 */

		FileOutputStream outputStream=null;
		ObjectOutputStream objectOutputStream=null;
		FileInputStream inputStream=null;
		ObjectInputStream objectInputStream=null;
		try {
			outputStream = new FileOutputStream("employee.data");
			 objectOutputStream = new ObjectOutputStream(outputStream);
			
			Employee employee=new Employee("1", "John");
			objectOutputStream.writeObject(employee);
			inputStream=new FileInputStream("employee.data");
			objectInputStream=new ObjectInputStream(inputStream);
			Employee tempEmployee=(Employee)objectInputStream.readObject();
			System.out.println(tempEmployee);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			objectOutputStream.close();
		}

	}

}

//int--Integr
//char--Character;
//boolean---Boolean
//float---Float
//double---Double
