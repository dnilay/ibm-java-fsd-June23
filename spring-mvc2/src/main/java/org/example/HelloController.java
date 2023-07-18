package org.example;

import javax.servlet.http.HttpServletRequest;

import org.example.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HelloController {

	@GetMapping
	public String goHome() {
		return "home";
	}

	@GetMapping("/showForm")
	public String showForm() {
		return "showForm";
	}

	@PostMapping("/addEmployee")
	public String addEmployee(HttpServletRequest request, Model theModel) {
		String name = request.getParameter("t1");
		double age = Double.parseDouble(request.getParameter("t2"));
		theModel.addAttribute("emp", new Employee(name, age));

		return "sucess";
	}
}
