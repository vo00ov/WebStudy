<%@page import="org.project.dto.MemberDto"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	ArrayList<MemberDto> mem = (ArrayList<MemberDto>)request.getAttribute("mem");
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>List</h1>
<%
	for(MemberDto m : mem){
		out.print("아이디 : " + m.getUserId() + " ");	
		out.print("비밀번호 : " + m.getUserPw() + " ");	
		out.print("이메일 : " + m.getEmail() + "<br>");	
	}
%>

</body>
</html>