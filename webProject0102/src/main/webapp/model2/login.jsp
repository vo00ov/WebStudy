<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<script src="<%=request.getContextPath()%>/model2/js/loginOk.js" defer></script>
</head>
<body>
<%@include file="header.jsp" %>

<form action="loginOk.do" method="post" id="loginForm">
id : <input type="text" name="userId" id="userId" /> <br />
pw : <input type="password" name="userPw" id="userPw" /> <br />
<input type="submit" value="로그인" id="loginOk"/>
<input type="reset" value="초기화" />
</form>
</body>
</html>