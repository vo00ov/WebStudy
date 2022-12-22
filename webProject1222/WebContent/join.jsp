<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JOIN</title>
<link rel="stylesheet" href="css/join.css" />
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
			<div class="join">
				<div class="join-con">
					<div class="join-form">
						<form action="MemberInsert.do" method="post" id="joinform">
							<table>
								<tr>
									<th colspan="2" class="banner">회원가입</th>
								</tr>
								<tr>
									<td><label for="userId">아이디</label></td>
									<td><input type="text" name="userId" id="userId"></td>
								</tr>

								<tr>
									<td><label for="userPw">비밀번호</label></td>
									<td><input type="password" name="userPw" id="userPw"></td>
								</tr>

								<tr>
									<td><label for="gender">성별</label></td>
									<td><input type="radio" name="gender" id="gender" value="남" checked>남
										<input type="radio" name="gender" id="gender" value="여">여</td>
								</tr>

								<tr>
									<td><label for="hobbys">취미</label></td>
									<td><input type="checkbox" name="hobbys" id="hobbys" value="여행">여행
										<input type="checkbox" name="hobbys" id="hobbys" value="독서">독서 <input
										type="checkbox" name="hobbys" id="hobbys" value="영화감상">영화감상 <input
										type="checkbox" name="hobbys" id="hobbys" value="낚시">낚시 <input
										type="checkbox" name="hobbys" id="hobbys" value="등산">등산 <input
										type="checkbox" name="hobbys" id="hobbys" value="기타">기타</td>
								</tr>

								<tr>
									<td>지역</td>
									<td><select name="city" id="city">
											<option value="지역선택">지역선택</option>
											<option value="서울">서울</option>
											<option value="경기">경기</option>
											<option value="전주">전주</option>
											<option value="부산">부산</option>
											<option value="제주">제주</option>
									</select></td>
								</tr>

								<tr>
									<td colspan="2">
									<label for="memo">자기소개</label>
									</td>
								</tr>
								
								<tr>
									<td colspan="2">
									<textarea name="memo" id="memo" cols="30" rows="10" placeholder="자기소개 입력란">
									</textarea>
									</td>
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



		</div></body>
</html>