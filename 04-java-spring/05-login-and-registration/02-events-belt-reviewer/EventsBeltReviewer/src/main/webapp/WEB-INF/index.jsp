<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="author" content="Jessica LaPlante">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<title>Events Belt Reviewer Assignment - Index Page</title>
</head>
<body>
<div class="container">
<h1>User Login & Registration Page</h1>
<div class="row">
<div class="col">
<h3>Login</h3>
<p>${ loginError }</p>
<form method="POST" action="/login">
				<div class="form-group">
			    	<label>Email:</label>
			    	<input class="form-control" type="email" name="lemail">
			    </div>
			    <div class="form-group">
			    	<label>Password:</label>
			    	<input class="form-control" type="password" name="lpassword">
			    </div>
			    <button class="btn btn-primary">Login</button>
</form>
</div>
<div class="col">
<h3>Register</h3>
			<form:form action="/register" method="post" modelAttribute="user">
			    <div class="form-group">
			        <form:label path="firstName">First Name</form:label>
			        <form:errors path="firstName"/>
			        <form:input class="form-control" path="firstName"/>
			    </div>
			    <div class="form-group">
			        <form:label path="lastName">Last Name</form:label>
			        <form:errors path="lastName"/>
			        <form:input class="form-control" path="lastName"/>
			    </div>
			    			    <div class="form-group">
			        <form:label path="city">City</form:label>
			        <form:errors path="city"/>
			       <form:input type="city" class="form-control" path="city"/>
			    </div>
			    			    <div class="form-group">
			        <form:label path="state">State</form:label>
			        <form:errors path="state"/>
			       <form:input type="state" class="form-control" path="state"/>
			    </div>
			    <div class="form-group">
			        <form:label path="email">Email</form:label>
			        <form:errors path="email"/>
			       <form:input type="email" class="form-control" path="email"/>
			    </div>
			    <div class="form-group">
			        <form:label path="password">Password</form:label>
			        <form:errors path="password"/>
			       <form:input type="password" class="form-control" path="password"/>
			    </div>
			    <div class="form-group">
			        <form:label path="confirmPassword">Confirm Password</form:label>
			        <form:errors path="confirmPassword"/>
			       <form:input type="password" class="form-control" path="confirmPassword"/>
			    </div>
			    <input class="btn btn-primary" type="submit" value="Submit"/>
			</form:form>

</div>
</div>


</div>
</body>
</html>