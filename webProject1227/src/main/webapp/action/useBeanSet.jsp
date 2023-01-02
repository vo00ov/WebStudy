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
<h1>setProperty</h1>
사용자 번호 : <%=myBean.getNo() %>
사용자 아이디 : <%=myBean.getUserId() %>
사용자 비밀번호 : <%=myBean.getUserPw() %>
사용자 이름 : <%=myBean.getUserName() %>
사용자 나이 : <%=myBean.getUserAge() %>


</body>
</html>