<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
<%@include file="header.jsp" %>
<form action="joinOk.do" method="post">
	id : <input type="text" name="userId" id="userId" /> <br />
	pw : <input type="password" name="userPw" id="userPw" /> <br />
	name : <input type="text" name="userName" id="userName" /> <br />
	<input type="submit" value="생성" />
	<input type="reset" value="초기화" />
</form>

</body>
</html>