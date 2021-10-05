
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Title: <c:out value="${book.title}"></c:out></h1>
	<h1>Description: <c:out value="${book.description}"></c:out></h1>
	<h1>Language: <c:out value="${book.language}"></c:out></h1>
	<h1>Pages: <c:out value="${book.numberOfPages}"></c:out></h1>
</body>
</html>