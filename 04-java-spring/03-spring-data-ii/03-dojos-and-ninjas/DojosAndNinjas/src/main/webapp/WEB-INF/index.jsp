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
			<h3><a href="/ninjas">Ninjas</a></h3>
			<a href="/dojos/new">Add Dojo</a>
			<hr />
			<h2>All Dojos</h2>
			<ul>
			<c:forEach items="${ dojos }" var="dojo">
				<li><a href="/dojos/${ dojo.id }">${ dojo.name }</a></li>
			</c:forEach>
			</ul>	
		</div>
</body>
</html>