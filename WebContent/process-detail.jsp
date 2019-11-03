<jsp:useBean id="user" class="com.jm2190921.model.User" ></jsp:useBean>
<jsp:setProperty property="*" name="user" />

<%
	request.setAttribute("user", user);
%>

<jsp:forward page="show-detail.jsp">
	<jsp:param value="Admin" name="type" />
</jsp:forward>