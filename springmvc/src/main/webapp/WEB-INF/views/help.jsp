<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page isELIgnored="false" %>
    

  
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>
My Help Page    ...--------------..---use EL for MODEL and View
</h1>
<c:forEach var="i" begin="1" end="10" step="1">
  <c:out value="${i}" />
  <br />
</c:forEach>
<c:forEach  var="item" items="${marksLstMV}">
<h1><c:out value="${item}"></c:out></h1>
</c:forEach>

roll No${rollNo}

collar No ${collarNo}


</body>
</html>