<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Expression Language</title>
</head>
<body>
<h2>EL의 paramOk.jsp</h2>
id : ${param.userId },
pw : ${param["userPw"] } <br />

id : <%=request.getParameter("userId") %>,
pw : <%=request.getParameter("userPw") %> <br />
</body>
</html>