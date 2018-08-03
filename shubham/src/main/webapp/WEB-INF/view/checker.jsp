<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Checker</title>
</head>
<%@taglib uri = "http://www.springframework.org/security/tags" prefix="security"%>
<body>
 <h1><center>Welcome, <security:authentication property="name"/>  </center></h1>
</body>
</html>
