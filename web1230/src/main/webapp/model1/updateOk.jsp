<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%


String userId = request.getParameter("userId");
String userPw = request.getParameter("userPw");
String userName = request.getParameter("userName");


String driver="com.mysql.cj.jdbc.Driver";
String url="jdbc:mysql://localhost:3306/mysqltest";
String user="root";
String password="1234";

Connection conn = null;
PreparedStatement pstm = null;
String sql = "";
int rs = 0;

try{
	Class.forName(driver);
	conn = DriverManager.getConnection(url, user, password);
	sql = "update member1228 set userPw=?,userName=? WHERE userId=?";
	pstm = conn.prepareStatement(sql);
	
	pstm.setString(1, userPw);
	pstm.setString(2, userName);
	pstm.setString(3, userId);
	
	rs = pstm.executeUpdate();

} catch(Exception e) {
	e.printStackTrace();
} finally {
	try{
		if(conn != null)conn.close();
		if(pstm != null)pstm.close();
	} catch(Exception e) {
		e.printStackTrace();
	} finally {
		
	}
}

String url2 = "";
if(rs == 1) {
	url2 = "selectOk.jsp";
} else {
	url2 = "memberViewOk.jsp";
}

RequestDispatcher dispatcher = request.getRequestDispatcher(url2);
dispatcher.forward(request, response);

%>
    