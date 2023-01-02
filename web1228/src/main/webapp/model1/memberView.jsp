<%@page import="org.project.dto.Member1228Dto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
Member1228Dto list = (Member1228Dto) request.getAttribute("member");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 상세정보</title>
</head>
<body>
	<h1>상세정보</h1>
	<table border="1">
		<tr>
			<th>아이디</th>
			<th>비밀번호</th>
			<th>이름</th>
		</tr>

		<tr>
			<td><%=list.getUserId()%></td>
			<td><%=list.getUserPw()%></td>
			<td><%=list.getUserName()%></td>
		</tr>
		
		<tr>
			<td colspan="3">
			<a href="selectOk.jsp">목록조회</a>
			<a href="index.jsp">회원가입</a>
			<a href="updateView.jsp?userId=<%=list.getUserId()%>">회원수정</a>
			<a href="deleteView.jsp?userId=<%=list.getUserId()%>">탈퇴</a>
			</td>
		</tr>



	</table>
</body>
</html>