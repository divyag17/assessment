<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>

</head>
<body>
<form method="post" action="check.do">
 
     Enter User Name <input type="text" name="user"> <br>
     Enter Password <input type="password" name="pass"> <br>
     <input type="submit"> 
   
  </form>
  <c:if test="${ERROR!= null}" >
  <jsp:include page="second.jsp"/>
  </c:if>
  <c:if test="${SUCESS!= null}" >
  <%
  out.println("valid user");
  %>
  </c:if>
  
</body>
</html>