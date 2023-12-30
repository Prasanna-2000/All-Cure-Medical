<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style="background-color:powderblue;">
<div align=center>
<h1>PRODUCT VIEW PAGE</h1>
<table border="2">
  <tr>
    <th>Product Id</th>
    <th>Product Name</th>
    <th>Retail Rate</th>
    <th>Whole SaleRate</th>
     <th>Stock </th>
      <th>Action </th>
    </tr>
    <c:forEach  items="${productList}" var="pro">
      <tr>
     <th> <c:out value="${pro.productId}"></c:out></th>
    <th> <c:out value="${pro.productName}"></c:out></th>
    <th> <c:out value="${pro.wholesaleRate}"></c:out></th>
    <th> <c:out value="${pro.retailRate}"></c:out></th>
    <th> <c:out value="${pro.stock}"></c:out></th>
    <th>
    <a href="Getproduct/${pro.productId}">viewProduct</a>
    &nbsp; &nbsp;
    <a href="Deleteproduct/${pro.productId}">DeleteProduct</a>
    &nbsp; &nbsp;
    <a href="editProduct/${pro.productId}">editProduct</a>
     &nbsp; &nbsp;
    
    </th>
      </tr>
     </c:forEach>
  </table>
  <a href="pEntry">Enter a new Product</a>
 
  </div>
</body>
</html>