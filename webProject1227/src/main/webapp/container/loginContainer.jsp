<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
								<td id="btn" colspan="2"><input type="submit" value="로그인"
									class="btn1"> <input type="reset" value="취소"
									class="btn1"></td>
							</tr>
						</table>
					</form>
				</div>
			</div>
		</div>