<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>index</title>
</head>
<body>
<c:url value="/uploadFile/${fileName}" var="img"></c:url>
<img src="${img}" alt="" width="100px" height="100px" />
<embed src="${img}" showcontrols="true" width="425" height="350"></embed>
	<h1>${message}</h1>
	<br/>
	description: ${description}
</body>
</html>