package com.text;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	String name=request.getParameter("user");
	String pass=request.getParameter("pwd");
	if(name.equals("admin")&& pass.equals("admin"))
	{
		out.println("login success.");
		//RequestDispatcher rd=request.getRequestDispatcher("home.html");
	//	rd.forward(request, response);
		
	}	
	else
	{
		//out.println("<font color ='red'>login failed.</font>");
		
		//RequestDispatcher rd=request.getRequestDispatcher("Login.html");
		//rd.include(request, response);
		
	}
	}
}

