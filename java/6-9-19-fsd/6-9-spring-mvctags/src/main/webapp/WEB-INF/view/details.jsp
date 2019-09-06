<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>details</title>
</head>
<body>
details:
${temp.id}

<br/>
${temp.name}<br/>
${temp.favoriteLanguage}<br/>
${temp.country}<br/>
<c:forEach var="os" items="${temp.os}">
    <td>
        <c:out value="${os}" />
    </td>
</c:forEach>
<br/>
</body>
</html>