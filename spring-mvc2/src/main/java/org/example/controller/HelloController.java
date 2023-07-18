package org.example.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.example.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

	private final DataSource dataSource;

	@Autowired
	public HelloController(DataSource dataSource) {

		this.dataSource = dataSource;
	}

	@GetMapping
	public String goHome() {
		return "home";
	}

	@GetMapping("/showForm")
	public String showForm() {
		return "showForm";
	}

	/*
	 * @PostMapping("/addEmployee") public String addEmployee(HttpServletRequest
	 * request, Model theModel) { String name = request.getParameter("t1"); double
	 * age = Double.parseDouble(request.getParameter("t2"));
	 * theModel.addAttribute("emp", new Employee(name, age));
	 * 
	 * return "sucess"; }
	 */

	@PostMapping("/addEmployee")
	public String addEmployee(@RequestParam(name = "t1") String name, @RequestParam(name = "t2") double age,
			Model theModel) {
		try {
			Connection connection=dataSource.getConnection();
			PreparedStatement pst=connection.prepareStatement("insert into employee(name,age) values(?,?)");
			pst.setString(1, name);
			pst.setDouble(2, age);
			pst.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		theModel.addAttribute("emp", new Employee(name, age));
		return "sucess";
	}
}
