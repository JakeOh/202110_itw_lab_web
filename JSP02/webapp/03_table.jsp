<%@page import="edu.web.model.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>JSP</title>
    </head>
    <body>
        <h1>JSP Scriptlet을 사용한 테이블 작성</h1>
        <h2>Model class 테스트</h2>
        
        <%
        Member m = new Member("admin", "1234", "admin@itwill.co.kr");
        %>
        <div><%= m %> <%-- m.toString() 호출 --%>
        </div>
        
    </body>
</html>