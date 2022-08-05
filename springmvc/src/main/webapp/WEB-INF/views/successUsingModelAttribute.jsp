<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
    <%@page isELIgnored="false" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>hello use success page.Model Attribute.</h1>
name ${user.userName}
email ${user.emailId}
password ${user.password}
lastName ${user.lastName}

common Thing ${desc}
</body>
</html>