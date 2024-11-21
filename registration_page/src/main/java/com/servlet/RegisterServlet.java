package com.servlet;

import java.io.IOException;

import com.connection.HibernateUtil;
import com.dao.EmpDao;
import com.entity.Employee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String department = req.getParameter("department");
		String salary = req.getParameter("salary");
		String password = req.getParameter("password");
		
		Employee emp = new Employee(name, email, department, salary, password);		
		EmpDao dao = new EmpDao(HibernateUtil.getSessionFactory());
		boolean f = dao.saveEmp(emp);
		
		HttpSession session = req.getSession();
		
		
		
		if(f==true) {			
			session.setAttribute("msg", "Emp register successfully");
			System.out.println("Employee Register Successfully...");
		}
		else {
			session.setAttribute("msg", "Somthing wrong");						
			System.out.println("Something Wrong On Server...");
		}
		
		
		resp.sendRedirect("index.jsp");
		
	}
	

}
