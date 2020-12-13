<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="author" content="Jessica LaPlante">
<title>Dojo OverFlow Assignment</title>
</head>
<body>
<div class="container">
		<h1>Questions Dashboard</h1>
		<table class="table table-hover">
			<thead>
				<tr>
					<th>Question</th>
					<th>Tags</th>
				</tr>
			</thead>
			<c:forEach items="${ questions }" var="question">
				<tr>
					<td><a href="/${ question.id }">${ question.question}</a></td>
					<td>
					<c:forEach items="${ question.tags }" var="tag">
						<span>${ tag.subject }<c:if test="${ question.tags.indexOf(tag) != question.tags.size() - 1 }">, </c:if></span>
					</c:forEach>
					</td>
				</tr>
			</c:forEach>
		</table>
		<a href="/new">New Question</a>
	</div>
</body>
</html>