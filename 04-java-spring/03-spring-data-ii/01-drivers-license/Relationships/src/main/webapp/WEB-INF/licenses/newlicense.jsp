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
<title>Relationship Project from Spring Data II</title>
</head>
<body>
	<div class="container">
		<h2>New License</h2>
		<form:form action="/licenses" method="POST" modelAttribute="license">
			<div class="form-group">
		        <form:label path="person">Person</form:label>
		        <form:errors path="person"/>
		        <form:select class="form-control" path="person">
		        <c:forEach items="${ persons }" var="p">
		        	<form:option value="${ p.id }">${ p.firstName } ${ p.lastName }</form:option>
		        </c:forEach>
		        </form:select>
		    </div>
			<div class="form-group">
		        <form:label path="state">State</form:label>
		        <form:errors path="state"/>
		        <form:input class="form-control" path="state"/>
		    </div>
		    <div class="form-group">
		        <form:label path="exirationDate">Expiration Date</form:label>
		        <form:errors path="exirationDate"/>
		        <form:input type="date" class="form-control" path="exirationDate"/>
		    </div>
		    <button>Add License</button>
		</form:form>
	</div>
</body>
</html>