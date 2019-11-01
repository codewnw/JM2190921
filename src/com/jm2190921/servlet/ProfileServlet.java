package com.jm2190921.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/profile")
public class ProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ProfileServlet() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doPost of ProfileServlet");
		response.setContentType("text/HTML");
		String un = request.getParameter("username");
		PrintWriter out = response.getWriter();
		out.print("Hello, " + un);
		out.print("<br>");
		out.print(request.getAttribute("loginMsg").toString());
		out.print("<br>");
		out.print("This is your profile.");
	}

}
