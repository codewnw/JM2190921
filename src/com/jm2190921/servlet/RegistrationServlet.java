package com.jm2190921.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RegistrationServlet() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doGet of RegistrationServlet");
		response.sendRedirect("registration.html");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doPost of RegistrationServlet");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		int age = Integer.parseInt(request.getParameter("age"));
		String gender = request.getParameter("gender");
		String[] courses = request.getParameterValues("courses");
		String country = request.getParameter("country");
		String feedback = request.getParameter("feedback");

		PrintWriter out = response.getWriter();
		out.println("Name: " + name);
		out.println("Email: " + email);
		out.println("Age: " + age);
		out.println("Gender: " + gender);
		out.print("Courses: ");
		for (int i = 0; i < courses.length; i++) {
			out.print(courses[i] + " ");
		}
		out.println();
		out.println("Country: " + country);
		out.println("Feedback: " + feedback);

	}

}
