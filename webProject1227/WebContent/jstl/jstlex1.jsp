<%@page import="org.project.dto.MemberDto2"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>변수 설정</h3>
<%
	String name1;
%>
<%
	name1 = "s1";
%>
이름
<%=name1 %>
<br />
<!-- 변수 name 선언 -->
<c:set var="name">m1</c:set>

<!-- 변수 age 선언 33로 초기화 -->
<c:set var="age" value="33"></c:set>

이름은 ${name }입니다.
<br> 나이
<c:out value="${age }" />살 입니다
<br />

<h3>변수 삭제</h3>
<c:remove var="name" />

<c:set var="age" value="25"/>
	이름은 ${name }입니다.
<br> 나이는
<c:out value="${age }" />
살 입니다.
<br>

<!-- DB 데이터 출력 **** -->
<h3>forEach</h3>
	<!--  var(변수명) begin(시작) end(끝) step(증감) -->
<c:forEach var="i" begin="1" end="10" step="1">
	${i }&nbsp;
</c:forEach>
<br>
<br>
<!-- 1~10까지 합 구하기 -->
<c:forEach var="i" begin="1" end="10" step="1">
	<c:set var="sum" value="${sum+i }" /> <!-- sum = sum + i -->
</c:forEach>
1~10까지의 합 = ${sum }
<br>
<br>

<h3>List</h3>
<%
	ArrayList<String> lists = new ArrayList<String>();
	lists.add("m1");
	lists.add("m2");
	lists.add("m3");
	lists.add("m4");
	lists.add("m5");
	request.setAttribute("lists", lists);
%>
<%
	ArrayList<String> lists2 = (ArrayList<String>)request.getAttribute("lists");
	for(String a : lists2){
%>
	<%=a %>
<%	
	}
%>

<c:forEach var="list" items="lists2">
	${list } &nbsp;
</c:forEach>

<%
	ArrayList<MemberDto2> members = new ArrayList<MemberDto2>();
	members.add(new MemberDto2("m1","11","s1",11,"남"));
	members.add(new MemberDto2("m2","21","s2",21,"여"));
	members.add(new MemberDto2("m3","31","s3",31,"여"));
	members.add(new MemberDto2("m4","41","s4",15,"남"));
	members.add(new MemberDto2("m5","51","s5",12,"여"));
	request.setAttribute("members", members);
%>

<table>
	<tr>
		<th>status</th>
		<th>아이디</th>
		<th>비밀번호</th>
		<th>이름</th>
		<th>나이</th>
		<th>성별</th>
	</tr>
	<c:forEach var="member" items="${members }" varStatus="status">
		<tr>
			<td>${status.count }</td>
			<td>${member.userId }</td>
			<td>${member.userPw }</td>
			<td>${member.userName }</td>
			<td>${member.age }</td>
			<td>${member.gender }</td>
		</tr>
	</c:forEach>
</table>


<!-- 문자열 분리 문자열, 문자열 -->
<h2>문자열 분리</h2>
	<c:forTokens  var="JavaStudy" items="java,jsp,html,css,javascript,jquery,spring" delims=",">
		${JavaStudy }
	</c:forTokens>

</body>
</html>