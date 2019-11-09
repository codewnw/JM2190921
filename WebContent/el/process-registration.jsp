<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Process Registration</title>
</head>
<body>

	<table border="1px">
		<tr>
			<td>Name</td>
			<td>${param.name}</td>
		</tr>
		<tr>
			<td>Email</td>
			<td>${param.email}</td>
		</tr>
		<tr>
			<td>Age</td>
			<td>${param.age}</td>
		</tr>
		<tr>
			<td>Gender</td>
			<td>${param.gender}</td>
		</tr>
		<tr>
			<td>Courses</td>
			<td>${paramValues.courses[0]}&nbsp;${paramValues.courses[1]}
				&nbsp; ${paramValues.courses[3]}</td>
		</tr>
		<tr>
			<td>Country</td>
			<td>${param.country}</td>
		</tr>
		<tr>
			<td>Feedback</td>
			<td>${param.feedback}</td>
		</tr>
		<tr>
			<td>Institute</td>
			<td>${initParam.institute}</td>
		</tr>
		<tr>
			<td>Type</td>
			<td>${requestScope.type}</td>
		</tr>
		<tr>
			<td>Date</td>
			<td>${applicationScope.date}</td>
		</tr>
		<tr>
			<td>UserName</td>
			<td>${sessionScope.username}</td>
		</tr>
	</table>
</body>
</html>