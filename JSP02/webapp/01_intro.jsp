<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 2</title>
</head>
<body>
	<h1>JSP 소개</h1>
	
	<% 
	Date today = new Date();
	%>
	
	<h2>서버 시간: <%= today.toString() %></h2>
</body>
</html>