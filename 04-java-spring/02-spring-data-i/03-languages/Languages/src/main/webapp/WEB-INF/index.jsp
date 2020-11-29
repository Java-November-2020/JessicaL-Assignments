<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="author" content="Jessica LaPlante">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
	crossorigin="anonymous">
<title>Languages Assignment - Home Page</title>
</head>
<body>

	<div class="container">
		<h1>Welcome To My Language Database</h1>
		<h3>Showing All Languages</h3>
		<table class="table table-dark">
			<thead>
				<tr>
					<th>id</th>
					<th>Name</th>
					<th>Creator</th>
					<th>Version</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach items="${allLanguages }" var="lang">
					<tr>
						<td>${car.id }</td>
						<td>${car.name }</td>
						<td>${car.creator }</td>
						<td>${car.version }</td>
					</tr>
				</c:forEach>

			</tbody>
		</table>
	</div>



</body>
</html>