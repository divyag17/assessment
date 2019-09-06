<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%><%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>formpage</title>
</head>
<body>
<form:form action="processform" modelAttribute="student">
id <form:input path="id"/><br/>
name
<form:input path="name"/><br/>country
<!--<form:select path="country">
<form:option value="null"></form:option>
<form:option value="india">india</form:option>
<form:option value="usa">usa</form:option>
</form:select>
	-->
	<form:select path="country">
		
			<form:options items="${student.countryOptions}"></form:options>
			
		</form:select>			
		<br><br>
		Language:
		
		Java <form:radiobutton path="favoriteLanguage" value="Java" />
		C# <form:radiobutton path="favoriteLanguage" value="C#" />
		PHP <form:radiobutton path="favoriteLanguage" value="PHP" />
		Ruby <form:radiobutton path="favoriteLanguage" value="Ruby" />

		<br><br> operating system 
		unix<form:checkbox path="os" value="unix"/>
		linux<form:checkbox path="os" value="linux"/>
		mac<form:checkbox path="os" value="mac"/>
		windows<form:checkbox path="os" value="windows"/>
<input type="submit" value="submit">
</form:form>

</body>
</html>