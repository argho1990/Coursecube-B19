<%@ page import="java.util.*,javax.sql.*;" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<%@ include file="header.jsp" %>
<body>
<h1>Hey,how are you,today?</h1>
<%!
String str ="JLC";
void m1(){
	System.out.println("Method Declaration");
	
}

{
	System.out.println("Instance Blocks");	
}

static{
	
	System.out.println("Static Blocks");
}
%>

<h1>Today's Date is:</h1>
<%
Date d = new Date();
%>
<%=d%>
<h2>Greetings:</h2>
<%
String str1 ="Hey,";
%>
<%=str1%>
<%="HELLO dear"%>
<%@ include file="login.jsp"%>
</body>
<%@ include file="footer.jsp"%>
</html>