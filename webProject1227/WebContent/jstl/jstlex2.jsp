<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	// 조건문
	session.setAttribute("isLogin", "admin");	// 로그인 유무
	session.setMaxInactiveInterval(30);		// 세션 유지 시간
//	session.setAttribute("roll", "ROLL_ADMIN");	// 권한(일반, 관리자)
	
	String sessionId = (String)session.getAttribute("isLogin");
	
//	String name1="login";
	if(sessionId!=null){
%>
		회원수정, 로그아웃		
<%		
	}else{
%>
		회원가입, 로그인
<%		
	}
%>
<br>

<!-- if ~ test -->
<c:set var="name" value="JAVA111" />
<c:if test="${name eq 'JAVA' }">
	JAVA입니다
</c:if>
<br>
<c:if test="${name ne 'JAVA' }">
	JAVA가 아니다 <c:out value="${name }" />
</c:if>
<br>
<!-- 값이 없는지 ?  -->
<c:if test="${empty name }">
	name값은 없다
</c:if>
<br>
<c:if test="${not empty name }">
	name값이 있다
</c:if>
<br><br><br><br>

<c:set var="userId" value="m1" />
<c:set var="userPw" value="11" />
<c:if test="${(userId eq 'm1') and (userPw eq '11') }">
	로그인 성공
</c:if>
<br>
<c:if test="${(userId eq 'm1') or (userPw eq '11') }">
	아이디나 비밀번호가 일치 합니다
</c:if>
<br>
<c:if test="${(not userId eq 'm1') or (! userPw eq '11') }">
	아이디나 비밀번호가 일치 하지 않습니다.(로그인 실패)
</c:if>
<br>
<c:if test="${userId ne null }">
	NULL 이 아니다
</c:if>

</body>
</html>