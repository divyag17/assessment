<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
out.println("hello");
%>
<form method="post" action="next.jsp">
name: <input type="text" name="name">
<input type="submit" value="click">
</form>
</body>
</html>