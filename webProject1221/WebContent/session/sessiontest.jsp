<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sessiontest.jsp</title>
</head>
<body>

<%
	Enumeration enumeration =  session.getAttributeNames();

	int i = 0;
	while(enumeration.hasMoreElements()){
		// 세션이 있을 때 (로그인)
		i++;
		String sName = enumeration.nextElement().toString();
		String sValue = (String)session.getAttribute(sName);
		out.println("sName : " + sName + "<br/>");
		out.println("sValue : " + sValue + "<br/>");
		
	}
		// 세션이 없을 때 (로그아웃)
		if(i==0) out.println("해당 세션이 삭제 되었습니다");

%>
	<a href="login.html">로그인페이지</a>
</body>
</html>