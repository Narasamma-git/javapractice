<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"   sELIgnored = "false"%>
    
      <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table>
    <c:forEach items="${mystudentdetails}" var="stu">
        <tr>
            <td>${stu.id}</td>
            <td><c:out value="${stu.name}" /></td>
            <td>${stu.username}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>


