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
			<td><%= request.getParameter("name") %></td>
		</tr>
		<tr>
			<td>Age</td>
			<td><%= request.getParameter("age") %></td>
		</tr>
		<tr>
			<td>Email</td>
			<td><%= request.getParameter("email") %></td>
		</tr>
	</table>

</body>
</html>