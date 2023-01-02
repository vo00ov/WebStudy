<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>useBean Test</title>
</head>
<body>

<jsp:useBean id="member" class="org.project.dto.MemberBean" scope="page">
	<%-- setter 		고유이름				필드				form parameter--%>
	<jsp:setProperty name="member" property="no" param="no"/>
	<jsp:setProperty name="member" property="userId" param="userId"/>
	<jsp:setProperty name="member" property="userPw" param="userPw"/>
	<jsp:setProperty name="member" property="userName" param="userName"/>
	<jsp:setProperty name="member" property="userAge" param="userAge"/>
</jsp:useBean>

<jsp:useBean id="member2" class="org.project.dto.MemberBean">
	<jsp:setProperty name="member2" property="*" />
</jsp:useBean>

	<%-- bean 출력, getter --%>
	번호:<jsp:getProperty name="member" property="no"/>
	아이디:<jsp:getProperty name="member" property="userId"/>
	비밀번호:<jsp:getProperty name="member" property="userPw"/>
	이름:<jsp:getProperty name="member" property="userName"/>
	나이:<jsp:getProperty name="member" property="userAge"/>
	
		<%-- bean 출력, getter --%>
	번호:<jsp:getProperty name="member2" property="no"/>
	아이디:<jsp:getProperty name="member2" property="userId"/>
	비밀번호:<jsp:getProperty name="member2" property="userPw"/>
	이름:<jsp:getProperty name="member2" property="userName"/>
	나이:<jsp:getProperty name="member2" property="userAge"/>
	
	<jsp:setProperty property="" name=""/>

</body>
</html>