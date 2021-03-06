<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="author" content="Jessica LaPlante"/>
<link rel="stylesheet" href="/css/style.css" />
<title>Java Result Page</title>
</head>
<body>
<c:set var="result" value="${ result }"/>
	<h1>Java Submitted Info</h1>
	<h2>You Chose Java!  Nice Job!</h2>
	<p><strong>Name:</strong> <c:out value="${ result.getName() }"/></p>
	<p><strong>Language:</strong> <c:out value="${ result.getLanguage() }"/></p>
	<p><strong>Location:</strong> <c:out value="${ result.getLocation() }"/></p>
	<p><strong>Comment:</strong> <c:out value="${ result.getComment() }"/></p>
</body>
</html>