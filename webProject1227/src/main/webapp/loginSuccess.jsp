<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String sessionId = (String)session.getAttribute("sessionId");

	if(sessionId==null){
		out.write("<script>");
		out.write("alert('다시 로그인 해주세요');");
		out.write("location.href='login.do';");
		out.write("</script>");
	}

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 성공</title>
</head>
<body>
	<div>
		<%=sessionId %>님 환영
		<a href="Logout.do">로그아웃</a>
	</div>
</body>
</html>