<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>SignUp</h1>
<form action=memberUpdate.do method="post" id="updateform">
        <label for="userId">아이디</label>
        <input type="text" name="userId" id="userId" placeholder="아이디를 입력해주세요"> <br>
      
        <label for="userPw">비밀번호</label>
        <input type="password" name="userPw" id="userPw"> <br>
       
        <label for="email">이메일</label>
        <input type="text" name="email" id="email"> <br>
       
        <input type="submit" value="수정">
</form>

</body>
</html>