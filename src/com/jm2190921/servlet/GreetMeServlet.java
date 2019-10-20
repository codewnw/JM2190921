package com.jm2190921.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/greet-me")
public class GreetMeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public GreetMeServlet() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doGet of GreetMeServlet");
		String un = request.getParameter("username");
		System.out.println("Hello, " + un);
		PrintWriter out = response.getWriter();
		out.print("Hey, " + un);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doPost of GreetMeServlet");

	}

}
