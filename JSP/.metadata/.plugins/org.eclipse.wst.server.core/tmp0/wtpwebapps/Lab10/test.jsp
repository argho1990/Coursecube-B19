<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<body>
<jsp:include page="header.jsp">
<jsp:param name="cname" value="Java Learning Centre"/>
</jsp:include>
<%
String bn = request.getParameter("branch");
if(bn.equals("MTH")){
%>
<jsp:forward page="mth.jsp">
<jsp:param name="bn" value="MTH"/>
<jsp:param name="email" value="mth@jlc.com"/>
</jsp:forward>
<%
}else if(bn.equals("KLN")){
%>
<jsp:forward page="kln.jsp">
<jsp:param name="bn" value="KLN"/>
<jsp:param name="email" value="kln@jlc.com"/>
</jsp:forward>
<%
}else if(bn.equals("BTM")){
%>	
	<jsp:forward page="btm.jsp">
	<jsp:param name="bn" value="BTM"/>
	<jsp:param name="email" value="btm@jlc.com"/>
	</jsp:forward>
<%
}%>
	

<jsp:include page="footer.jsp">
<jsp:param name="cname" value="Java Learning Centre"/>
</jsp:include>
</body>
</html>