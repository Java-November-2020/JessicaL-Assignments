<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="author" content="Jessica LaPlante">
<link rel="stylesheet" href="/css/style.css" />
<title>The Code JSP Page</title>
</head>
<body>

	<form action="/attempt" method="post">
		<span class="span"><c:out value="${ error }" /></span>
			<h1>What is the code?</h1>
		<input type="text" name="guess" placeholder="What is the code?" />
		<button>Try Code</button>
	</form>

</body>
</html>