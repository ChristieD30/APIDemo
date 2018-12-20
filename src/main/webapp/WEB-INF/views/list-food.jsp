<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Food List</title>
<link rel="stylesheet" type="text/css" href="style.css">
<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/sketchy/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-5cy8WdlNAGqQwyB33aLiqJoRQQxZsc3TDUkSTahHAx2gMK3o0te7Xqm+nNLe4Ou3"
	crossorigin="anonymous">
	<link href = "style.css" rel = "stylesheet">
</head>
<body>


	<div class="container">
		<h1>Food</h1>
		<form action ="/food">
			<input type = "text" value = "${category}"  name = "category"  placeholder ="Category">
			<input type = "submit" value = "Search" class ="btn btn-primary">
			 <c:if test = "${not empty category}" >
			 <!--  The c:if determines whether the clear link shows on the page or not --> 
			 <a href = "food" class = "btn btn-secondary">Clear</a>
			 
			 </c:if>
			 
		</form>
		<table class="table">
			<thead>
				<th>Name</th>
				<th>Category</th>
				<th>Description</th>
			</thead>
			<tbody>
				<c:forEach items="${food}" var="p">
					<tr>
						<td>${p.name}</td>
						<td>${p.category}</td>
						<td>${p.description}</td>
					</tr>

				</c:forEach>
			</tbody>
		</table>


		<a href = "/form" class ="btn btn-primary">Add</a>
		
			</div>
</body>

	
</html>