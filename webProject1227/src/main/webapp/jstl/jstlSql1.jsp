<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstlSql1</title>
</head>
<body>
<h1>jstlSql1.jsp</h1>
<!-- 커넥션, DB연결 -->
<sql:setDataSource
	var = "conName"
	driver = "oracle.jdbc.driver.OracleDriver"
	url = "jdbc:oracle:thin:@//localhost:1521/xe"
	user = "system"
	password = "1234" />
<!-- DB데이터를 get "select" -->
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