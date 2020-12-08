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
<title>Dojos And Ninjas</title>
</head>
<body>
	<div class="container">
		<h1>Dojos N Ninjas</h1>
		<hr />
		<h2>Add a Ninja</h2>
		<form:form action="/ninjas" method="post" modelAttribute="ninja">
			<div class="form-group">
		        <form:label path="dojo">Dojo Name</form:label>
		        <form:errors path="dojo"/>
		        <form:select class="form-control" path="dojo">
		        <c:forEach items="${ dojos }" var="doj">
		        	<option value="${ doj.id }">${ doj.name }</option>
		        </c:forEach>
		        </form:select>
		    </div>
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
		        <form:label path="age">Age</form:label>
		        <form:errors path="age"/>
		        <form:input class="form-control" path="age"/>
		    </div>
		    <button>Add Ninja</button>
		</form:form>
	</div>
</body>
</html>