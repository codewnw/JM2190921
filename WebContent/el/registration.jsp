<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
	<h1>Registration Page!!!</h1>
	<form action="intermediate.jsp" method="post">
		<input type="text" name="name" placeholder="Enter name"> <br>
		<input type="email" name="email" placeholder="Enter email"> <br>
		<input type="number" name="age" placeholder="Enter age"> <br>
		<input type="radio" name="gender" value="M">Male <input
			type="radio" name="gender" value="F">Female<br> <input
			type="checkbox" name="courses" value="Core Java">Module 1 <input
			type="checkbox" name="courses" value="Advance Java">Module 2
		<input type="checkbox" name="courses" value="Java Frameworks">Module
		3<br> <select name="country">
			<option value="">---SELECT---</option>
			<option value="IND">India</option>
			<option value="US">United States</option>
			<option value="UK">United Kingdom</option>
		</select><br>
		<textarea rows="5" cols="50" name="feedback"></textarea>
		<br> <input type="reset" value="Reset"> <br> <input
			type="submit" value="Register"> <br>
		
	</form>
</body>
</html>