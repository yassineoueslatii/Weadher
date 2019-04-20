<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Acceuil</title>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</head>
<body>
<div class="container">
<div class="row">
<div class="col-md-6">
<table class="table table-dark">
  <thead>
    <tr>
		 <th scope="col"></th>     
      <th scope="col">#</th>
      <th scope="col">Ville</th>
      <th scope="col">Temperature</th>
      <th scope="col">Actions</th>
    </tr>
  </thead>
  <tbody>
    <c:forEach items="${lists}" var="list">
    <tr>
      <th scope="row"></th>
      <td> ${list.code}</td>
      <td> ${list.titre}</td>
      <td> ${list.desc}</td>
     
      <td>
      <div class="row">
	  <div class="col-md-4"> 
	  <a href="/Weadher/supprimer?code=${list.code}">D</a>
	  </div>
	  <div class="col-md-4"> 
	  <a href="/Weadher/supprimer?code=${list.code}">A</a>
	  </div>
	  <div class="col-md-4"> 
	  <a href="/Weadher/supprimer?code=${list.code}">M</a>
	  </div>
	  </div>
	  </td>
    </tr>
    </c:forEach>
  </tbody>
</table>
</div>
</div>
</div>
</body>
</html>