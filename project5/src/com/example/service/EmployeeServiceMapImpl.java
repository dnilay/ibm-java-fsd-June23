package com.example.service;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

import com.example.model.Employee;

public class EmployeeServiceMapImpl implements EmployeeServiceMap {
	
	private Map<String, Employee> emplMap;
	
	{
		emplMap=new LinkedHashMap<String,Employee>();
	}

	@Override
	public Employee createEmployee(Employee employee) {
		String[] str=UUID.randomUUID().toString().split("-");
		emplMap.put(str[0], employee);
		
		return employee;
	}

	@Override
	public Collection<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		System.out.println(emplMap);
		return emplMap.values();
	}

}
