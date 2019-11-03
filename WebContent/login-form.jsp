<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Login</title>
</head>
<body>
<%@ include file="header.jsp" %>
	<h1>JSP Login Page!!!</h1>
	${param.msg}
	<%-- <%=request.getParameter("msg") != null ? request.getParameter("msg") : "Enter carefully" %> --%>
	<form action="process-login.jsp" method="post">
		<input type="text" name="username" placeholder="Enter user name">
		<input type="password" name="password" placeholder="Enter password">
		<input type="submit" value="Login">
	</form>
	<%@ include file="footer.jsp" %>
</body>
</html>