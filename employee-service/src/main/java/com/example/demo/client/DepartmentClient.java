package com.example.demo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.ui.DepartmentDto;

@FeignClient(value = "DEPARTMENT-SERVICE")
public interface DepartmentClient {

	@GetMapping("/departments/{departmentName}")
	DepartmentDto getDepartmentByName(@PathVariable("departmentName") String departmentName);

}
