<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>index</title>

</head>
<body>
	<form:form id="formUploadFile" method="POST" action="uploadFile" acceptcharset="UTF-8" enctype="multipart/form-data; charset=" modelAttribute="myFile">
		File: <input type="file" name="multipartFile" /> <br /> <br/>
		Description: <form:input path="description"/> <br />
		<input type="submit" value="Submit" />
	</form:form>
	
</body>

</html>