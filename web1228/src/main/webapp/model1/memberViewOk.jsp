<%@page import="org.project.dto.Member1228Dto"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>



<%
String userId = request.getParameter("userId");

String driver="com.mysql.cj.jdbc.Driver";
String url="jdbc:mysql://localhost:3306/mysqltest";
String user="root";
String password="1234";

Connection conn = null;
PreparedStatement pstm = null;
String sql = "";
ResultSet rs;

Member1228Dto member = null;



try{
Class.forName(driver);
conn = DriverManager.getConnection(url, user, password);
sql = "select * from member1228 where userId=?";
pstm = conn.prepareStatement(sql);

pstm.setString(1, userId);

rs=pstm.executeQuery();

if(rs!=null){
	while(rs.next()){
		member = new Member1228Dto(rs.getString(1),rs.getString(2),rs.getString(3));
	}
}

}catch(Exception e){
	e.printStackTrace();
} finally {
	try{
		if(conn != null)conn.close();
		if(pstm != null)pstm.close();
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		
	}
}

String url2 = "";

if(member!=null){
	url2 = "memberView.jsp";
	request.setAttribute("member", member);
}else{
	url2 = "index.jsp";
}


RequestDispatcher dispatcher = request.getRequestDispatcher(url2);
dispatcher.forward(request, response);

%>