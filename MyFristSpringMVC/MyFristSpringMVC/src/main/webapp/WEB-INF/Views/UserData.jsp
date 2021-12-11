<%@page import="com.technoelevate.myBeans.EmployeeDTO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

 <% 
 EmployeeDTO empDto = (EmployeeDTO)request.getAttribute("myEmpObj");
 %>
<body>

Welcome <%=empDto.getUserName() %>!<br><br>

Your employee id is : <%=empDto.getEmpId() %><br>
Your password id is : <%=empDto.getPassword() %>

</body>
</html>