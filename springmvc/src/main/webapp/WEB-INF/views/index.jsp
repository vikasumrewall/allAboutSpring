<%@ page import="java.util.*" %>
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
<h1>
home page
</h1>

<!-- fetching attribute without EL -->

<%

String name=(String)request.getAttribute("name");
int id=((Integer)request.getAttribute("id"));
List<String> friendLst=(java.util.List<String>)request.getAttribute("friendLst");
%>

<h1>id <%=id%></h1>
<h1>name <%=name%></h1>
<h1>
<%

for(String s:friendLst)
{
		out.println("=>"+s);
}
%>
</h1>

<!-- fetching attribute using EL -->
id ${id}
name ${name}
owner ${owner}

</body>
</html>