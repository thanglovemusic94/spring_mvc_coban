<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>add</title>
</head>
<body>
	<h2>Thêm dữ liệu</h2>
	
	<c:url var="add" value="/add"></c:url>
	<form:form action="{add}" method="post" modelAttribute="user">
		<div>
			<label>name</label>
			<form:input type="text" path="name" />
		</div>
		
		<div>
			<label>email</label>
			<form:input type="email" path="email" />
		</div>
		
		<div>
			<label>email</label>
			<form:input type="number" path="phone" />
		</div>
		
		<button type="submit">Thêm</button>
	</form:form>
</body>
</html>