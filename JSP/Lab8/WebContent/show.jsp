<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>This is JSP</h1>
<% int x =10/0; %>
<h6>The Result is:</h6>
<h5><%=x%></h5>
</body>
</html>