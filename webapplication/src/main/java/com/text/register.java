package com.text;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("fname");
		String user = request.getParameter("user");
		String pass = request.getParameter("pwd");
		if (name.equals("admin")) {
			out.println("Registration success");
			//RequestDispatcher rd = request.getRequestDispatcher("Login.html");
			//rd.forward(request, response);
		} 
		else
		{	
			//out.println("<font color ='red'>Registration failed</font>");

			//RequestDispatcher rd = request.getRequestDispatcher("register.html");
			//rd.include(request, response);

		}
	}
}
