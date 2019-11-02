<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Login</title>
</head>
<body>
	<h1>JSP Login Page!!!</h1>
	<%=request.getParameter("msg") != null ? request.getParameter("msg") : "Enter carefully" %>
	<form action="process-login.jsp" method="post">
		<input type="text" name="username" placeholder="Enter user name">
		<input type="password" name="password" placeholder="Enter password">
		<input type="submit" value="Login">
	</form>
</body>
</html>