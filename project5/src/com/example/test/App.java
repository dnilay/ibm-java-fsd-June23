package com.example.test;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

import com.example.model.Employee;
import com.example.model.FirstNameComrator;
import com.example.model.GpaComparator;
import com.example.model.Student;
import com.example.service.EmployeeServiceMap;
import com.example.service.EmployeeServiceMapImpl;

public class App {

	public static void main(String[] args) {
		/*
		 * EmployeeServiceMap map=new EmployeeServiceMapImpl(); map.createEmployee(new
		 * Employee(new Random().nextInt(100), "John", "Doe",
		 * "john@email.com",10000.98)); map.createEmployee(new Employee(new
		 * Random().nextInt(100), "Marry", "Public", "marry@email.com",8906.90));
		 * map.createEmployee(new Employee(new Random().nextInt(100), "Rahul", "Dravid",
		 * "rahul@email.com",20000)); Collection<Employee>
		 * employees=map.getAllEmployees();
		 * 
		 * Iterator<Employee> iterator=employees.iterator(); while(iterator.hasNext()) {
		 * System.out.println(iterator.next()); }
		 */
		
		/*
		 * Set<Employee> set=new TreeSet<Employee>(); set.add(new Employee(1, "A", "B",
		 * "C", 1000)); set.add(new Employee(2, "D", "E", "F", 9000)); set.add(new
		 * Employee(3, "M", "N", "C", 11000)); set.add(new Employee(4, "D", "G", "F",
		 * 900)); System.out.println(set);
		 */
		Comparator<Student> c=new GpaComparator();
		TreeSet<Student> students=new TreeSet<Student>(c);
		students.add(new Student("John","Doe",4.5));
		students.add(new Student("Anil","Public",3.4));
		System.out.println(students);
		

	}

}
