<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>league</title>
</head>
<body>


	<form id="form-1" action="add_league.do" method="post">
		<label for="input-1">Name</label>
		<input id="input-1" name="title" type="text"/>
	<br/>
	<label for="input-2">season</label>
	<select name="season">
	<option value="unknown">unknown</option>
	<option value="autumn">autumn</option>
	<option value="winter">winter</option>
	<option value="summer">summer</option>
	<option value="spring">spring</option>
	</select>
	<br/>
	<input type="submit" value="Submit" id="button-1"/>
	</form>
	
	<c:if test="${ERROR != null}" >
        
           
    <c:forEach var="e" items="${ERROR}">
    
         ${e} 
      </c:forEach>      
    </c:if>
    <c:if test="${ERROR == null}" >
        
           
    <jsp:include page="second.jsp"/>
            
            
    </c:if>
</body>
</html>