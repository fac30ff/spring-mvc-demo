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
			<form:errors path="lastName" cssClass="error"/>
			<br><br>
			Country:
			<form:select path="country">
				<form:options items="${student.countryOptions}"/>
				<%-- <form:option value="Switzerland" label="Switzerland"/>
				<form:option value="Deutchland" label="Deutchland"/>
				<form:option value="Norge" label="Norge"/>
				<form:option value="United Kingdom" label="United Kingdom"/>
				<form:option value="Australia" label="Australia"/>
				<form:option value="New Zealand" label="New Zealand"/>
				<form:option value="Canada" label="Canada"/>
				<form:option value="USA" label="USA"/>
				<form:option value="Luxemburg" label="Luxemburg"/>
				<form:option value="Lichtenstein" label="Lichtenstein"/> --%>
			</form:select>
			<br><br>
			Favorite Language:
			Java <form:radiobutton path="favoriteLanguage" value="Java"/>
			C++ <form:radiobutton path="favoriteLanguage" value="C++"/>
			C# <form:radiobutton path="favoriteLanguage" value="C#"/>
			Scala <form:radiobutton path="favoriteLanguage" value="Scala"/>
			Ruby <form:radiobutton path="favoriteLanguage" value="Ruby"/>
			<br><br>
			Operating Systems:
			Linux <form:checkbox path="operatingSystems" value="Linux"/>
			MacOS <form:checkbox path="operatingSystems" value="MacOS"/>
			Windows <form:checkbox path="operatingSystems" value="Windows"/>
			FreeBSD <form:checkbox path="operatingSystems" value="FreeBSD"/>
			<br><br>
			Country 2:
			<form:select path="country2">
				<form:options items="${theCountryOptions}"/>
			</form:select>
			<br><br>
			<input type="submit" value="submit" /> 
		</form:form>
	</body>
</html>