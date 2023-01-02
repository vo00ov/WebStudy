<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%String sessionId = (String)session.getAttribute("sessionId");%>

	<div class="header">
		<div class="nav">
			<h1 class="logo">
				<a href="index.do">LOGO</a>
			</h1>
			<div class="gnb">
				<ul>
					<li><a href="index.do">HOME</a></li>
					<li><a href="#">게시판</a></li>
					<li><a href="#">INFO</a></li>
					
					<% 
					if(sessionId==null){
					%>						
					<li><a href="join.do">회원가입</a></li>
					<li><a href="login.do">로그인</a></li>
					<% 
					} else {
					%>						
					<li><a href="MemberSelect.do">내 정보</a></li>
					<li><a href="Logout.do">로그아웃</a></li>
					<% 
					}
					%>
				</ul>
			</div>
		</div>
	</div>