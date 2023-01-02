<%@page import="org.project.dto.Member1228Dto"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	ArrayList<Member1228Dto> list = (ArrayList<Member1228Dto>)request.getAttribute("list");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원목록</title>
</head>
<body>
<h1>회원목록</h1>
<table border="1">
	<tr>
		<th>번호</th>
		<th>아이디</th>
		<th>비밀번호</th>
		<th>이름</th>
	</tr>
	
	<%
	int i = 1;
		for(Member1228Dto mem : list){
			%>
				<tr>
					<td><%=i %></td>
					<td><%=mem.getUserId() %></td>
					<td><%=mem.getUserPw() %></td>
					<td><a href="memberViewOk.jsp?userId=<%=mem.getUserId() %>"><%=mem.getUserId() %></a></td>
				</tr>
			<%
			i++;
		}
		
		
	%>
	
</table>
</body>
</html>