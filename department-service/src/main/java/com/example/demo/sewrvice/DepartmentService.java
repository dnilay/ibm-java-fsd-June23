package com.example.demo.sewrvice;

import com.example.demo.model.Department;

public interface DepartmentService {
	
	Department findDepartmentByName(String departmentName);

}
