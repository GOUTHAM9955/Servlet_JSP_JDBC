<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>IFailure</title>
</head>
<body>
<h1> Failed to register </h1>

<% String name = (String) session.getAttribute("name"); %>
<h2> Hello <%= name %>, your registration failed</h2>

</body>
</html>