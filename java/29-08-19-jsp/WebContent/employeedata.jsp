<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="e" class="emp.Employee" scope="request">

	<form id="form-1"  method="get">
		<label for="input-1">Name</label>
		<input id="input-1" name="name" type="text"/>
	<br/>
	<label for="input-2">Address</label>
	<input id="input-2" name="address" type="text"/>
	<br/>
	<label for="input-3">Salary</label>
	<input id="input-3" name="salary" type="text"/>
	<input type="submit" value="Submit" id="button-1"/>
	</form>
	</jsp:useBean>
<c:if test="${fn:length(param.name)>0 && fn:length(param.address)>0 && fn:length(param.salary)>0}" >
        
           
            <jsp:include page="second.jsp"/>
            
            
    </c:if>

</body>
</html>