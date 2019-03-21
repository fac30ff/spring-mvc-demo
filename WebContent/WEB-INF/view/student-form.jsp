<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Student Registration Form</title>
	</head>
	<body>
		<form:form action="processForm" modelAttribute="student">
			First Name: <form:input path="firstName" />
			<br><br>
			Last Name: <form:input path="lastName" />
			<br><br>
			<form:select path="country">
				<form:option value="Switzerland" label="Switzerland"/>
				<form:option value="Deutchland" label="Deutchland"/>
				<form:option value="Norge" label="Norge"/>
				<form:option value="United Kingdom" label="United Kingdom"/>
				<form:option value="Australia" label="Australia"/>
				<form:option value="New Zealand" label="New Zealand"/>
				<form:option value="Canada" label="Canada"/>
				<form:option value="USA" label="USA"/>
				<form:option value="Luxemburg" label="Luxemburg"/>
				<form:option value="Lichtenstein" label="Lichtenstein"/>
			</form:select>
			<br><br>
			<input type="submit" value="submit" /> 
		</form:form>
	</body>
</html>