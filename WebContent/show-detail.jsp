<%@ page import="com.jm2190921.model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Detail</title>
</head>
<body>
	<table border="1px">
		<tr>
			<td>Name</td>
			<td><%= ((User)request.getAttribute("user")).getName() %></td>
		</tr>
		<tr>
			<td>Age</td>
			<td>${requestScope.user.age}</td>
		</tr>
		<tr>
			<td>Email</td>
			<td><%= request.getParameter("email") %></td>
		</tr>
		<tr>
			<td>Type</td>
			<td><%= request.getParameter("type") %></td>
		</tr>
	</table>

</body>
</html>