<%@page import="org.project.dto.MemberDto2"%>
<%@page import="java.util.ArrayList"%>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@page  %>
<%
	ArrayList<MemberDto2> members = new ArrayList<MemberDto2>();

	members.add(new MemberDto2("m1","1111","m1Name",31,"남자"));
	members.add(new MemberDto2("m2","2121","m2Name",21,"여자"));
	members.add(new MemberDto2("m3","3131","m3Name",44,"여자"));
	members.add(new MemberDto2("m4","1441","m4Name",16,"남자"));
	members.add(new MemberDto2("m5","5515","m5Name",25,"여자"));
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>expression</title>
</head>
<body>

	<div>
		<ul>
			<%
			for(MemberDto2 member : members){
			%>
				<li>
					<span>아이디:<%=member.getUserId() %></span>
					<span>비밀번호:<%=member.getUserPw() %></span>
					<span>이름:<%=member.getUserName() %></span>
					<span>나이:<%=member.getAge() %></span>
					<span>성별:<%=member.getGender() %></span>
				</li>				
			<%
			}
			%>
		</ul>
	</div>
	<table>
		<%
		for(MemberDto2 member : members){
		%>
			<tr>
				<td>아이디:<%=member.getUserId() %></td>
				<td>비밀번호:<%=member.getUserPw() %></td>
				<td>이름:<%=member.getUserName() %></td>
				<td>나이:<%=member.getAge() %></td>
				<td>성별:<%=member.getGender() %></td>
			</tr>
		<%
		}
		%>
	</table>

</body>
</html>