<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	request.setAttribute("userId", "m1");
	request.setAttribute("userPw", "1111");
%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Expression Language</title>
</head>
<body>

<h2>EL의 기본문법 1</h2>
userId : <%=request.getAttribute("userId") %> <br />
userId : ${userId} <br />
userPw : ${userpw} <br />
userAge : ${100 } <br />
userName : ${'이름' } <br />

</body>
</html>