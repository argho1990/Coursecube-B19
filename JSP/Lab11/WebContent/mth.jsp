<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>

<html>

<body>
<jsp:include page="header.jsp">
<jsp:param name="cname" value="Java Learning Centre"/>
</jsp:include>
<h4>This is mth.jsp Home Page<br>
which shows ${param.bn} branch details 
Contact email:${param.email}</h4>
<jsp:include page="footer.jsp">
<jsp:param name="cname" value="Java Learning Centre"/>
</jsp:include>
</body>
</html>