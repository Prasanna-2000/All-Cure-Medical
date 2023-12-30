<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style="background-color:powderblue;">
<div align =center>
<form:form action="proEdit" method="post" modelAttribute="shareRecord">
Enter productId<form:input type="text" path="productId"  readonly="true"/>
<br><br>
Enter productName<form:input type="text" path="productName"/>
<br><br>
Enter wholesaleRate<form:input type="text" path="retailRate"/>
<br><br>
Enter retailRate<form:input type="text" path="wholesaleRate"/>
<br><br>
Enter stock<form:input type="text" path="stock"/>
<br><br>
<input type="submit" value="submit"/>
</form:form>
</div>
</body>
</html>