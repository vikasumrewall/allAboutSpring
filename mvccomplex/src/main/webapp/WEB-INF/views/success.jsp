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
<h1>student_detals: ${student}</h1>


<h1>student_course: ${student.course}</h1>



<h1>student_dob: ${student.dob}</h1>



student_addres_city: ${student.address.city}
student_addres_street: ${student.address.street}
</body>
</html>