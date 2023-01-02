<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String userId = request.getParameter("userId");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="updateOk.jsp" method="post">
ID : <%=userId %><input type="hidden" name="userId" value=<%=userId %> /> <br />
PW : <input type="password" name="userPw" id="userPw" /><br />
NAME : <input type="text" name="userName" id="userName" /><br />
<input type="submit" value="수정" /><br />
</form>
</body>
</html>