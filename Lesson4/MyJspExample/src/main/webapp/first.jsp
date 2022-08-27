<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login page</title>
</head>
<body>
	<h1>login</h1>
	<form method="get" action="first.jsp">
		Enter Uname:<input type="text" name="username" required><br />
		Enter Password:<input type="password" name="password" required><br />
		<input type="submit" value="submit">
	</form>
	
	
	<%
	   String name=request.getParameter("username");
	   String pass=request.getParameter("password");
	   out.println(name+" "+pass);
	%>
</body>
</html>