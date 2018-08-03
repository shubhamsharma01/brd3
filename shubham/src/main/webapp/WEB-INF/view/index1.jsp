<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<%@taglib uri = "http://www.springframework.org/security/tags" prefix="security"%>
<body>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
    <a class="navbar-brand" href="#">MAKER</a>
    
    </div>
 
    <ul class="nav navbar-nav">
  	  <li><a  href="home">Home</a></li>
      <li><a href="insert">Add</a></li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">View <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="singleview">Single View</a></li>
          <li><a href="allview">Multiple View</a></li>
          
          <li><a href="allview1">Multiple View 1</a></li>
          
        </ul>
      </li>
      <li><a href="update">Update</a></li>
      <li><a href="delete">Delete</a></li>
      </ul>
       <ul class="nav navbar-nav navbar-right">
      <li><a href="j_spring_security_logout"><span class="glyphicon glyphicon-user"></span> Logout</a></li>
      
    </ul>
 </div>
 </nav>
 <h1><center>Welcome ,<security:authentication property="name"/> </center></h1>
 
</body>
</html>
