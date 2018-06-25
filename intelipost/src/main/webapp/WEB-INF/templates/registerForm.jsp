<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
	<h2>Cadastro Intelipost</h2>
	<form:form action="register" modelAttribute="loginDTO" method="POST">
		<form:label path="user">Name</form:label>
		<form:input path="user" />
		<br>
		<br>
		<form:label path="password">Password</form:label>
		<form:password path="password" />
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>
