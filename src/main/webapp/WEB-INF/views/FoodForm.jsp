<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add to our items</title>

<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/sketchy/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-5cy8WdlNAGqQwyB33aLiqJoRQQxZsc3TDUkSTahHAx2gMK3o0te7Xqm+nNLe4Ou3"
	crossorigin="anonymous">
	<link href = "style.css" rel = "stylesheet">
</head>
<body>

<h1>Add Food</h1>
<form action ="/newfood" method = "post">

Name <input type = "text" name = "name"> <br>
Category<input type = "text" name = "category">  <br>
Description<input type = "text" name = "description">  <br>
<input type = "submit" value = "Submit" class ="btn btn-primary">

</form>

</body>
</html>