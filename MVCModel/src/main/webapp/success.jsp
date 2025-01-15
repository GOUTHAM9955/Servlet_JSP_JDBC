<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success</title>
</head>
<body>
<h1> <marquee>Registration is Successful</marquee></h1>

<% String name = (String) session.getAttribute("name"); %>
<h2> Hello <%= name %>, you are registered</h2>
</body>
</html>