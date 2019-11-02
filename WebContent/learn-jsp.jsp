<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Learn JSP</title>
</head>
<body>
	<h1>Expression Tag</h1>
	<p>Sum of 10 + 20 is: <%= 10+20 %> </p>
	
	<h1>Declaration Tag</h1>
	<%!
	int number = 100;
	int sum(int a, int b){
		return a + b + number;
	}
	%>
	
	<h1>Scriptlet Tag</h1>
	<%
	int anotherNumber = 200;
	out.print(number);
	number = number + anotherNumber + sum(10, 20);
	%>
	
	<%= number %>
</body>
</html>