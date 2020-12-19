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
<title>Events Belt Reviewer Assignment - Events Page</title>
</head>
<body>
																<!-- events in user's state -->
<div class="container">
	<h1>Welcome, ${user.firstName }</h1> 
	<hr />
	<a href="/logout">Logout</a>
	<hr />
	<h3>Here are some of the events in your state</h3>
	<table class="table table-dark">
	<tbody>
		<thead>
			<tr>
				<th>Name</th>
				<th>Date</th>
				<th>City</th>
				<th>State</th>
				<th>Host</th>
				<th>Action/Status</th>
			</tr>		
		</thead>
	
		<c:forEach items="${allEvents }" var="event">				<!-- table data info -->
			<tr>
				<td><a href="/event/${event.id}">${event.eventName}</a></td>
				<td><fmt:formatDate value="${event.date}" pattern="MMM dd, yyyy" /></td>
				<td>${event.city}</td>
				<td>${event.state}</td>
				<td>${event.host}</td>
				<td>
				<c:choose>
					<c:when test="${event.planner.id == user.id }">
						<a href="/delete">Delete</a>
					</c:when>
					<c:when test="${event.guests.contains(user)}">
						<a href="/dontattend/${event.id}">Don't Attend</a>
					</c:when>
					<c:otherwise>
						<a href="/attend/${event.id}">Attend</a>
					</c:otherwise>
					</c:choose>
				</td>
			</tr>
		</c:forEach>
	</table>

</div>

<div class="container">										<!-- create an event -->
	<h5>Create A New Event</h5>
	<div class="new-event float float-left">
	<form:form action="/dashboard" method="post" modelAttribute="event">
			    <div class="form-group">
			        <form:label path="eventName">Event Name: </form:label>
			        <form:errors path="eventName"/>
			        <form:input class="form-control" path="eventName"/>
			    </div>
			    <div class="form-group">
			        <form:label path="date">Event Date: </form:label>
			        <form:errors path="date"/>
			        <form:input type = "date" class="form-control" path="date"/>
			    </div>
			    			    <div class="form-group">
			        <form:label path="city">City: </form:label>
			        <form:errors path="city"/>
			       <form:input type="city" class="form-control" path="city"/>
			    </div>
			    			    <div class="form-group">
			        <form:label path="state">State: </form:label>
			        <form:errors path="state"/>
			       <form:input type="state" class="form-control" path="state"/>
			    </div>
			    			    			    <div class="form-group">
			        <form:label path="host">Host: </form:label>
			        <form:errors path="host"/>
			       <form:input type="host" class="form-control" path="host"/>
			    </div>
			    <input class="btn btn-primary" type="submit" value="Submit"/>
			</form:form>
		</div>

</div>


</body>
</html>