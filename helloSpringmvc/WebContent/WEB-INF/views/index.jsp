<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Quản lí emplyee</h2>

	<c:url var="add" value="/add"></c:url>
	<a href="${add}">Thêm</a>

	<table border="1">
		<tr>
			<th>STT</th>
			<th>id</th>
			<th>name</th>
			<th>email</th>
			<th>phone</th>
			<th colspan="2">
				hành động
			</th>
		</tr>
		<c:forEach var="user" items="${users}" varStatus="loop">
			<tr>
				<td>${loop.count}</td>
				<td>${user.id}</td>
				<td>${user.name}</td>
				<c:if test="${user.email} == "></c:if>
				<td>${user.email}</td>
				<td>${user.phone}</td>
				<td>xóa</td>
				<td>sửa</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>