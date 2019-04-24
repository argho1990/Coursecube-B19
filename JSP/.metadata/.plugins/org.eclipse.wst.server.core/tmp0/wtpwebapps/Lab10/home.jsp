<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>

<html>
<body>
<jsp:include page="header.jsp">
<jsp:param name="cname" value="Java Learning Centre"/>
</jsp:include>
<form action="test.jsp">
<h1>Select the Branch</h1>
<select name="branch">
<option value="MTH">Marathalli</option>
<option value="KLN">Kalyanagar</option>
<option value="BTM">BTM Layout</option>
</select>
<input type="submit" value="Submit">
</form> 
<jsp:include page="footer.jsp">
<jsp:param name="cname" value="Java Learning Centre"/>
</jsp:include>
</body>
</html>