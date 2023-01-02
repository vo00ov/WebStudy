<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstlSql3.jsp</title>
</head>
<body>
<!-- 커넥션, DB연결 -->
<sql:setDataSource
	var = "conName"
	driver = "oracle.jdbc.driver.OracleDriver"
	url = "jdbc:oracle:thin:@//localhost:1521/xe"
	user = "system"
	password = "1234" />
	
<!-- 추가 -->
<sql:update var="resultInt" dataSource="${conName }">
	insert into member1227(userId,userPw,userName) values(?,?,?)
	<sql:param>${param.userId }</sql:param>
	<sql:param>${param.userPw }</sql:param>
	<sql:param>${param.userName }</sql:param>
</sql:update>

<!-- 출력 -->
<sql:query var="result" dataSource="${conName }">
	select * from member1227
</sql:query>

<table border="1">
	<tr>
		<th>글번호</th>
		<th>아이디</th>
		<th>비밀번호</th>
		<th>이름</th>
	</tr>
	<c:forEach var="row" items="${result.rows }" varStatus="status">
		<tr>
			<td>${status.count }</td>
			<td>${row.userId }</td>
			<td>${row.userPw }</td>
			<td>${row.userName }</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>