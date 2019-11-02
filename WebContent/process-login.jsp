<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Process Login</title>
</head>
<body>
	<%
		String un = request.getParameter("username");
		String pass = request.getParameter("password");

		if (un.equals(pass)) {
			out.print("Hi, " + un);
		} else {
			response.sendRedirect("login-form.jsp?msg=Please try again...");
		}
	%>
</body>
</html>