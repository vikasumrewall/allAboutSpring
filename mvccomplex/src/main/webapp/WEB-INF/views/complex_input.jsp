<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<link href="<c:url  value="/resources/css/style.css"/>"/>


<script src="<c:url  value="/resources/javascript/script.js"/>" type="text/javascript" ></script>

    <title>Complex Form</title>
  </head>
  <body>
  
 
   <div class="alert alert-danger" role="alert">
 
   <form:errors path="student.*"/>
</div>
 
 
   <form action="doAction" method="post">
   
    <div class="form-group">
    <label for="name">Name</label>
    <input type="text" class="form-control" id="name" placeholder="Enter email" name="name">
  
  </div>
  
   
  <div class="form-group">
    <label for="id">Your ID </label>
    <input type="text" class="form-control" id="id"  placeholder="ID" name="id">
    </div>
    
    
     <div class="form-group">
    <label for="dob"> </label>
    <input type="text" class="form-control" id="dob"  placeholder="DOB" name="dob">
    </div>
    
    
  
   <div class="form-group">
    <label for="course">Select Multiple Languages</label>
    <select multiple class="form-control" id="course" name="course">
       <option>Java</option>
      <option>Spring</option>
      <option>Python</option>
    </select>
  </div>
  
  <div class="form-group">
  <span class="mr-3">Select Gender</span>
  <input class="form-check-input" type="radio" name="gender" id="genderMale" value="male" >
  <label class="form-check-label" for="genderMale">
    Male
  </label>
</div>
<div class="form-check">
  <input class="form-check-input" type="radio" name="gender" id="genderFemale" value="female">
  <label class="form-check-label" for="genderFemale">
   Female
  </label>
</div>

  
  <div class="form-group">
    <label for="exampleFormControlSelect1">StudentType</label>
    <select class="form-control" id="exampleFormControlSelect1" name="studentType">
      <option>College</option>
      <option>Professional</option>
    </select>
  </div>
  
  <div class="card">
 
  <div class="card-body">
  <div class="form-group">
  <p> Your Address</p>
    <label for="address.city">Name</label>
    <input type="text" class="form-control" id="address.city" placeholder="Enter city" name="address.city">
  
  </div>
  
  
  <div class="form-group">
    <label for="name">address.street</label>
    <input type="text" class="form-control" id="address.street" placeholder="Enter street" name="address.street">
  
  </div>
  </div>
  
   </div>
  
  
  
    <button type="submit" class="btn btn-primary">Submit</button>
</form>

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  </body>
</html>