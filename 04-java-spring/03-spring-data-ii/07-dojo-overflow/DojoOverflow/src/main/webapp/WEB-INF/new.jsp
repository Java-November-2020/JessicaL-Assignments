<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
		<h1>What is your question</h1>
		<form:form action="/" method="post" modelAttribute="newQuest">
			 <div class="form-group">
		        <form:label path="question">Question</form:label>
		        <form:errors path="question"/>
		        <form:textarea class="form-control" path="question"></form:textarea>
		    </div>
		    <div class="form-group">
		        <form:label path="tags">Tags</form:label>
		        <form:errors path="tags"/>
		        <form:input class="form-control" path="tags"/>
		    </div>
		    <button>Submit</button>
		</form:form>
	</div>
</body>
</html>