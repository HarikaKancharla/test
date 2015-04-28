<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="">
<div align="center">
<h1><i>Incresol Employee Details</i></h1>
 <table border="1">
			 <tr>
                <th>EMP_ID</th>
                <th>EMP_NAME</th>
                <th>DEPARTMENT_ID</th>
                <th>DESIGNATION_ID</th>
                 </tr>
                <c:forEach var="emp" items="${listEmployees}" varStatus="status">
                <tr>
                    <td>${emp.id}</td>
                    <td>${emp.EMP_NAME}</td>
                    <td>${emp.DEPARTMENT_ID}</td>
                    <td>${emp.DESIGNATION_ID}</td>
                             
                </tr>
                </c:forEach>             
            </table>
            <a href="index.jsp">Back</a>
</div>

</body>
</html>