<%@page import="emp.Validate"%>
<body>
  <jsp:useBean id="u" class="emp.Validate" scope="request">
  <jsp:setProperty name="u" property="*" />
  </jsp:useBean>
  You entered user name as <jsp:getProperty name="u" property="user" /> <br>

  You entered user password as <jsp:getProperty name="u" property="pass" /> <br>
  <br>

   <%= u.validate("Admin","Admin") %> user.  <br>

</body></html>