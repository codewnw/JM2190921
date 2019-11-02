package com.jm2190921.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/show-detail")
public class ShowDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ShowDetailServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.sendRedirect("show-detail-form.html");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/HTML");
		
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String email = request.getParameter("email");

		PrintWriter out = response.getWriter();
		out.print("<table border=\"1px\">\r\n" + 
				"		<tr>\r\n" + 
				"			<td>Name</td>\r\n" + 
				"			<td>"+name+"</td>\r\n" + 
				"		</tr>\r\n" + 
				"		<tr>\r\n" + 
				"			<td>Age</td>\r\n" + 
				"			<td>"+age+"</td>\r\n" + 
				"		</tr>\r\n" + 
				"		<tr>\r\n" + 
				"			<td>Email</td>\r\n" + 
				"			<td>"+email+"</td>\r\n" + 
				"		</tr>\r\n" + 
				"	</table>");
	}

}
