<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>cookieMain.jsp</title>
</head>
<body>

<%

	Cookie[] cookies = request.getCookies();

	for(int i=0; i<cookies.length; i++){
		
		String cookieId = cookies[i].getValue();
		
		if(cookieId.equals("admin")){
			out.println(cookieId + "님 안녕하세요." + "<br />");
		}
	}

%>

	<a href="logout.jsp">로그아웃</a>

</body>
</html>