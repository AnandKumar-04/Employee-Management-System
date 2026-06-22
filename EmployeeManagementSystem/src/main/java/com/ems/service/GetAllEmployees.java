package com.ems.service;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ems.dao.EmployeeDAO;


@WebServlet("/findAll")
public class GetAllEmployees extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmployeeDAO dao = new EmployeeDAO();
		List<Employee> emplist = dao.getAllData();
		RequestDispatcher rd = request.getRequestDispatcher("viewemps.jsp");
		request.setAttribute("empList", empList);
		rd.forward(request, response);
	}
}
