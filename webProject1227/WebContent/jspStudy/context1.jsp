<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String hostId = config.getServletContext().getInitParameter("hostId");
	String hostPw = config.getServletContext().getInitParameter("hostPw");
%>

hostId: <%=hostId %> <br/>
hostPw: <%=hostPw %>

</body>
</html>