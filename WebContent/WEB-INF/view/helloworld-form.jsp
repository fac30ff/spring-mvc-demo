<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Hello World - Input Form</title>
	</head>
	<body>
		<form action="processForm" method="GET">
			<input type="text" name="studentName" placeholder="What's your name?"/>
			<input type="submit"/>
		</form>
		<br><br>
		<form action="processFormVersionTwo" method="GET">
			<input type="text" name="uppercased" placeholder="to uppercase"/>
			<input type="submit" value="UpperCase"/>
		</form>
	</body>
</html>