<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form to capturing details</title>
</head>
<body>
<jsp:include page="header.jsp" />
	<form action="process-detail.jsp" method="post">
		<input type="text" name="name" placeholder="Enter name"> <input
			type="number" name="age" placeholder="Enter age"> <input
			type="email" name="email" placeholder="Enter email"> <input
			type="submit" value="Submit">
	</form>
	<jsp:include page="footer.jsp" />
</body>
</html>