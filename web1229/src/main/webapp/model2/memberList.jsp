<%@page import="org.project.dto.Member1228Dto"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%ArrayList<Member1228Dto> list = (ArrayList<Member1228Dto>)request.getAttribute("list"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원목록</title>
</head>
<body>
<%@include file="header.jsp" %>
<h1>회원목록</h1>
<table border="1">
	<tr>
		<th>번호</th>
		<th>아이디</th>
		<th>비밀번호</th>
		<th>이름</th>
		<th>상세정보</th>
	</tr>
	
	<% 
		int no = 1;
		if(list != null){
			for(Member1228Dto users : list){
	%>
		<tr>
			<td><%=no %></td>
			<td><%=users.getUserId() %></td>
			<td><%=users.getUserPw() %></td>
			<td><%=users.getUserName() %></td>
			<td><a href="memberView.do?userId=<%=users.getUserId() %>">상세보기</a></td>
		</tr>
	<%			
		no++;
			}
				
		} else {
	%>
		<tr>
			<th>결과가 없습니다.</th>
		</tr>	
	<%		
		}
	%>
</body>
</html>