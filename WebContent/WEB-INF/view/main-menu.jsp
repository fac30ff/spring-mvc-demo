<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
<%-- this is how to obrtai static resources for jsp	<link rel="stylesheet" type="text/css"          

           href="${pageContext.request.contextPath}/resources/css/my-test.css">

    <script src="${pageContext.request.contextPath}/resources/js/simple-test.js"></script> --%>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h2>Spring MVC Demo - Home Page</h2>
		<%-- <img src="${pageContext.request.contextPath}/resources/images/spring-logo.png" /> --%>
		<hr>
		<a href="showForm">Hello World form</a>
		<br><br>
		<a href="student/showForm">student form</a>
		<br><br>
		<a href="customer/showForm">Customer form</a>
	</body>
</html>