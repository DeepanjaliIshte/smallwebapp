<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1> Registration Form </h1>
	
	<form action="userDetails">
	
	User Name : <input id="user name" name="Name"/><br>
	Email ID : <input id="email id" name="Email"/><br> 
	Password : <input id="password" name="Password"/><br>
	
	Gender :<input type="radio" name="gender" value="Male">Male
	<input type="radio" name="gender" value="female">Female <br>
	
	Hobby : <input type="checkbox" name="hobby" value="dancing">Dancing
	<input type="checkbox" name="hobby" value="singing">Singing <br>
	
	<input type="submit" value="Register Now "/>
	</form>
</body>
</html>