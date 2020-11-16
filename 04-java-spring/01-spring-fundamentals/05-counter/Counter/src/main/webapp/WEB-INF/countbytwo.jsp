<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Counter Page</title>
</head>
<body>
<h1>You have visited <a href="http://localhost:8080"> <c:out value="${count * 2}"/> times</a></h1>
<a href="/">Test another visit?</a>
<a href="/reset"> <button>Reset Session</button> </a>

</body>
</html>