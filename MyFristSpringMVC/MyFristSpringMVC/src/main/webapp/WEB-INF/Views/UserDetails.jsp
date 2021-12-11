<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%
	String empId = (String) request.getAttribute("myEmpId");
	String userName = (String) request.getAttribute("myUserName");
	String password = (String) request.getAttribute("myPassword");
%>
<body>

Welcome <%= userName %>!<br><br>

Your employee id is : <%=empId %><br>
Your password id is : <%=password %>




</body>
</html>