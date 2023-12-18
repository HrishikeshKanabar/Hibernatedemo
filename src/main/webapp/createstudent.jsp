<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- Custom CSS -->
    <link href="${pageContext.request.contextPath}/index.css" rel="stylesheet" type="text/css">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>SMP</title>
</head>
<body>

   <div class="Student">
   <h3 class="text-center"> Create Student </h3>
  
	   <form action="createStudent" method="post">
	   First Name:
	   <br/>
	   <input type="text" class="form-control" name="firstname" aria-describedby="emailHelp" placeholder="Enter firstname">
	   <br/>
	   Last Name:
	   <br/>
	   <input type="text" class="form-control" name="lastname" aria-describedby="emailHelp" placeholder="Enter lastname">
	   <br/>
	   Email:
	   <br/>
	   <input type="email" class="form-control" name="studentemail" aria-describedby="emailHelp" placeholder="Enter email">
       <br/>
       <center>
	   <input type="submit" class="btn btn-primary"  value="Create Student"/>
	   </center>
	   </form>
   </div>

</body>
</html>