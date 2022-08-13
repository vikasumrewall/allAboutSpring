<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@ include file="./base.jsp"  %>
</head>
<body>
<h>This is add product Form</h>


<form action="handleAddProduct"  method="post">
  <div class="form-group">
    <label for="name">Name</label>
    <input type="text" class="form-control" id="name" name="name" placeholder="name">
    
  </div>
  <div class="form-group">
    <label for="description">description</label>
    <input type="text" class="form-control" id="description" name="description" placeholder="description">
  </div>
  <div class="form-group">
    <label for="price">price</label>
    <input type="text" class="form-control" id="price" name="price" placeholder="price">
  </div>
  
  <div class="container text-center">
  <a href="${pageContext.request.contextPath}">Back</a>
   <button type="submit" class="btn btn-primary">Submit</button>
  </div>
 
</form>
</body>
</html>