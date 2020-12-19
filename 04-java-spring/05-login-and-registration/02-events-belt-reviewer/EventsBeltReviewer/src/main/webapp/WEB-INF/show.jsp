<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="author" content="Jessica LaPlante">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<title>Events Belt Reviewer Assignment - Show Event Details Page</title>
</head>
<body>
<div class="container">
	<h3>${event.eventName }</h3>
	<div class="event-details-side">
		<p>Host: ${event.host }</p>
		<p>Date: ${event.date}</p>
		<p>Location: ${event.city }, ${event.state }</p>
		<p>Number of Attendees: ${event.guests.size() }</p>

<table class="table table-responsive">
		<thead>
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>City</th>
				<th>State</th>
			</tr>		
		</thead>
		<c:forEach items="${event.guests}" var="user">
				<tr>
					<td>${user.firstName }</td>
					<td>${user.lastName }</td>
					<td>${user.city }</td>
					<td> ${user.state }</td>
				</tr> 
				
		</c:forEach>

</table>

		<a href="/logout">Logout</a>
</div>
</div>
</body>
</html>