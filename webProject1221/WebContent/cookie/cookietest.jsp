<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>cookietest.jsp</title>
</head>
<body>

<%
	Cookie[] cookies = request.getCookies();
	// 모든 쿠키값을 조회
	if(cookies!=null){
		for(int i=0; i<cookies.length; i++){
			out.println(cookies[i].getName() + "<br />");
			out.println(cookies[i].getValue() + "<br />");
		}
	}


%>

</body>
</html>