package com.ems.service;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ems.dao.EmployeeDAO;
import com.ems.model.Employee;


@WebServlet("/findByEmail")
public class SearchEmployee extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String email =request.getParameter("email");
	EmployeeDAO dao =new EmployeeDAO();
	Employee employee = dao.searchEmployee(email);
	
	}
}
