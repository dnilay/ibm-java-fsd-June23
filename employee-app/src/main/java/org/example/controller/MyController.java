package org.example.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.example.model.Employee;

public class MyController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<String> errors=new ArrayList<String>();	
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("t1");
		if(name.length()<=0)
		{
			errors.add("Name Field Can not be blank.");
		}
		int age=0;
		try {
			age=Integer.parseInt(request.getParameter("t2"));
			
		} catch (Exception e) {
			// TODO: handle exception
			errors.add("age field must be numeric");
		}
		if(age<18)
		{
			errors.add("invalid age age must be >=18");
		}
		
		if(!errors.isEmpty())
		{
			request.setAttribute("ERROR", errors);
			RequestDispatcher view=request.getRequestDispatcher("error.view");
			view.forward(request, response);
		}
		else
		{
			Employee employee=new Employee(name, age);
			
			request.setAttribute("EMP", employee);
			RequestDispatcher view=request.getRequestDispatcher("success.view");
			view.forward(request, response);
		}
		
	}

}
