package com.example.demo.controller;

import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.client.DepartmentClient;
import com.example.demo.exception.DepartmentNoFountException;
import com.example.demo.model.EmployeeEntity;
import com.example.demo.service.EmployeeService;
import com.example.demo.ui.DepartmentDto;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/employees")
@AllArgsConstructor
public class EmployeeController {

	private final EmployeeService employeeService;
	private final Environment environment;
	private final DepartmentClient departmentClient;
	// private final RestTemplate restTemplate;

	@ExceptionHandler
	public ResponseEntity<?> handleException(DepartmentNoFountException e)
	{
		e.setErrorReportringTime(System.currentTimeMillis());
		e.setStatusCode(HttpStatus.NOT_FOUND.value());
		
		StringBuffer sb=new StringBuffer();
		sb.append(e.getMessaage());
		sb.append(e.getErrorReportringTime());
		sb.append(e.getStatusCode());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(sb);
	}
	@GetMapping("/status")
	public ResponseEntity<?> status() {
		return ResponseEntity
				.ok("employee-service is up and runuing on port: " + environment.getProperty("local.server.port"));
	}

	@PostMapping("/{departmentName}")
	public ResponseEntity<?> createEmployee(@RequestBody EmployeeEntity employee,
			@PathVariable("departmentName") String departmentName) {

		DepartmentDto dto = departmentClient.getDepartmentByName(departmentName);
		if(dto==null)
		{
			throw new DepartmentNoFountException("department with "+departmentName+" not found");
		}
		employee.setDepartmentId(dto.getDepartmentId());
		employee.setDepartmentName(dto.getDepartmentName());
		return ResponseEntity.status(HttpStatus.CREATED).body(employeeService.createEmployee(employee));
	}

}
