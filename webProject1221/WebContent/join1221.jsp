<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="Login1221Insert.do" method="post" id="joinform">
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
				<td><input type="radio" name="gender" id="gender" value="남"checked>남
					<input type="radio" name="gender" id="gender" value="여">여</td>
			</tr>

			<tr>
				<td><label for="hobby">취미</label></td>
				<td><input type="checkbox" name="hobbys" id="hobbys" value="여행">여행 <input
					type="checkbox" name="hobbys" id="hobbys" value="독서">독서 <input
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
				<td><label for="memo">자기소개</label></td>
				<td><textarea name="memo" id="memo" cols="30" rows="10"
						style="" placeholder="자기소개 입력란"></textarea></td>
			</tr>

			<tr class="btnZone">
				<th colspan="2"><input type="submit" value="생성" class="btn1">
					<input type="reset" value="취소" class="btn1"></th>
			</tr>

		</table>
	</form>
</body>
</html>