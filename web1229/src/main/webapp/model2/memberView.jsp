<%@page import="org.project.dto.Member1228Dto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%Member1228Dto user = (Member1228Dto)request.getAttribute("info"); 
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상세정보</title>
</head>
<body>
<%@include file="header.jsp" %>
<h1>상세정보</h1>

<form action="memberUpdate.do" method="post">
	id : <input type="hidden" name="userId" value="<%=user.getUserId() %>" id="userId" readonly="readonly"/>
	<span><%=user.getUserId() %></span> <br />
	pw : <input type="password" name="userPw" value="<%=user.getUserPw() %>" id="userPw" /> <br />
	name : <input type="text" name="userName" value="<%=user.getUserName() %>" id="userName" /> <br />
	<input type="submit" value="회원수정" />
<%
	if(userRole != null && userRole.equals("ROLE_ADMIN")){
%>
	<a href="memberDelete.do?userId=<%=user.getUserId() %>">회원탈퇴</a>
<%	
	}
%>
</form>
	
</body>
</html>