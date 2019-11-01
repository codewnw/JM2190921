package com.jm2190921.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/login", "/login-to-profile" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doGet of LoginServlet");
		String url = request.getRequestURI();
		System.out.println(url);
		if (url.contains("login-to-profile")) {
			response.sendRedirect("login-to-profile.html");
		} else {
			response.sendRedirect("login.html");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doPost of LoginServlet");
		String url = request.getRequestURI();
		System.out.println(url);
		if (url.contains("login-to-profile")) {
			String un = request.getParameter("username");
			String pass = request.getParameter("password");

			if (un.equals(pass)) {
				request.setAttribute("loginMsg", "Login Successfull!!!");
				RequestDispatcher rd = request.getRequestDispatcher("profile");
				rd.forward(request, response);
			} else {
				response.sendRedirect("login-to-profile.html");
			}
		} else {

			String un = request.getParameter("username");
			String pass = request.getParameter("password");

			if (un.equals(pass)) {
				PrintWriter out = response.getWriter();
				out.print("Hello, " + un + " Login Sucessfull.");
			} else {
				response.sendRedirect("login.html");
			}
		}
	}

}
