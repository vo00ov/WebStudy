<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String sessionId = (String) session.getAttribute("sessionId");
String userRole = (String) session.getAttribute("USER_ROLE");
%>

	<a href="index.do">HOME</a>

<%
	if (sessionId == null) {
%>
	<a href="memberList.do">회원목록</a>
	<a href="joinView.do">회원가입</a>
	<a href="loginView.do">로그인</a>
	
<%
	} else {
%>
	<a href="memberList.do">회원목록</a>
	<a href="updateView.do?userId=<%=sessionId%>">회원수정</a>
	<a href="logout.do">로그아웃</a>
	<a href="memberView.do?userId=<%=sessionId%>"><%=sessionId%>님</a>
<%
	if(userRole.equals("ROLE_ADMIN")){
%>
	<a href="admin_index.do">관리자페이지</a>
<%		
		}
	}
%>


