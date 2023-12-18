<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- Custom CSS -->
     <link rel="stylesheet" href="index.css">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>SMP</title>
</head>
<body>

 <h1 class="text-center heading"> Course Managment Portal </h1>
  
  <table class="table table-bordered">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">First Name</th>
      <th scope="col">Last Name</th>
      <th scope="col">Email</th>
      <th scope="col">Edit</th>
      <th scope="col">Delete</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach var="stds" items="${allStudents}" >
    <tr>
      <th scope="row">${stds.id}</th>
      <td>${stds.getFirstName()}</td>
      <td>${stds.lastName}</td>
      <td>${stds.email}</td>
      <td><a class="btn btn-primary" href="" role="button">EDIT</a></td>
      <td><a class="btn btn-primary" href="" role="button">Delete</a></td>
    </tr>
   </c:forEach>
	
    </tbody>
</table>

</body>
</html>