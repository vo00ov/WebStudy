<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>loginOk.jsp</title>
</head>
<body>

	<%
		String id = request.getParameter("id");	// login.html id
		String pw = request.getParameter("pw");	// login.html pw
		// 입력된 id pw 쿠키값으로 설정
		if(id.equals("admin") && pw.equals("1111")){	// 로그인 정보가 true면 쿠키 생성
			
			Cookie cookie = new Cookie("cookieId", id);		// 쿠키 생성
			cookie.setMaxAge(60);						// 쿠키 시간
			
			response.addCookie(cookie);					// 쿠키 전송
				// 바로 서블릿, JSP전달
			response.sendRedirect("cookieMain.jsp");	// cookieMain.jsp 전달(쿠키 정보)
		} else {
			response.sendRedirect("login.html");
		}
	%>

</body>
</html>