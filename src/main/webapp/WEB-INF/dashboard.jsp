
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
	<div class="container">
		<h1>All Books</h1>
		<table class="table table-bordered">
			<tr>
				<th>ID</th>
				<th>Title</th>
				<th>Language</th>
				<th># of Pages</th>
			</tr>
			<c:forEach var="oneBook" items="${books}">
				<tr>
					<td><c:out value="${oneBook.id}"></c:out></td>
					<td><c:out value="${oneBook.title}"></c:out></td>
					<td><c:out value="${oneBook.description}"></c:out></td>
					<td><c:out value="${oneBook.numberOfPages}"></c:out></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>