<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link rel="stylesheet" href="css/login.css" />
</head>
<body>
	<div id="wrap">
	
	
	
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
						<li><a href="join.do">회원가입</a></li>
						<li><a href="login.do">로그인</a></li>
					</ul>
				</div>
			</div>
		</div>
		
		
		
		
		
		
		
		<div class="container">
			<div class="login">
				<div class="login-con">
					<form action="LoginOk.do" method="post" id="loginForm">
					
					<table>
						<tr>
							<th colspan="2" class="banner">로그인</th>
						</tr>
						
						<tr>
							<td><label for="userId">아이디</label></td>
							<td><input type="text" name="userId" id="userId"></td>
						</tr>
						
						<tr>
							<td><label for="userPw">비밀번호</label></td>
							<td><input type="password" name="userPw" id="userPw"></td>
						</tr>
						
						<tr class="btnZone">
							<td id = "btn" colspan="2">
								<input type="submit" value="생성" class="btn1"> 
								<input type="reset" value="취소" class="btn1">
							</td>
						</tr>
					</table>
					</form>
				</div>
			</div>
		</div>
		
		
		
		
		
		
		
		<div class="footer">
			<div class="footer-con">FOOTER</div>
		</div>
		
		
		
	</div>
</body>
</html>