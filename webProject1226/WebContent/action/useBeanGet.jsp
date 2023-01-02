<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<jsp:useBean id="myBean" class="org.project.dto.MemberBean" />

<jsp:setProperty name="myBean" property="no" value="11" />
<jsp:setProperty name="myBean" property="userId" value="root" />
<jsp:setProperty name="myBean" property="userPw" value="1234" />
<jsp:setProperty name="myBean" property="userName" value="ss1" />
<jsp:setProperty name="myBean" property="userAge" value="10" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>getProperty 실습</h1>
사용자 번호 : <jsp:getProperty property="myBean" name="no"/> <br>
사용자 아이디 : <jsp:getProperty property="myBean" name="userId"/> <br>
사용자 비밀번호 : <jsp:getProperty property="myBean" name="userPw"/> <br>
사용자 이름 : <jsp:getProperty property="myBean" name="userName"/> <br>
사용자 나이 : <jsp:getProperty property="myBean" name="userAge"/> <br>
</body>
</html>