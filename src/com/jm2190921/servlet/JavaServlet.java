package com.jm2190921.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/java-enrollment" }, initParams = { @WebInitParam(name = "trainerName", value = "John"),
		@WebInitParam(name = "trainerMobile", value = "0987654321") })
public class JavaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public JavaServlet() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.sendRedirect("java-enrollment.html");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/HTML");
		String name = request.getParameter("name");

		ServletConfig config = getServletConfig();
		String trnName = config.getInitParameter("trainerName");
		String trnMobile = config.getInitParameter("trainerMobile");
		ServletContext context = config.getServletContext();
		String institute = context.getInitParameter("institute");

		PrintWriter out = response.getWriter();
		out.print("Hi, " + name);
		out.print("<br>");
		out.print(trnName + " is your trainer and his mobile number is " + trnMobile + " in " + institute);
	}

}
