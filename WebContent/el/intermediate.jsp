<%@ page import="java.util.*" %>
<%
	request.setAttribute("type", "Buyer");
	application.setAttribute("date", new Date());
	session.setAttribute("username", "rSharma");
	request.getRequestDispatcher("process-registration.jsp").forward(request, response);
%>