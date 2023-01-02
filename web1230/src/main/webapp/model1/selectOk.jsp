<%@page import="java.sql.ResultSet"%>
<%@page import="org.project.dto.Member1228Dto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<%


String driver="com.mysql.cj.jdbc.Driver";
String url="jdbc:mysql://localhost:3306/mysqltest";
String user="root";
String password="1234";

Connection conn = null;
PreparedStatement pstm = null;
String sql = "";
ResultSet rs;
ArrayList<Member1228Dto> list = new ArrayList<Member1228Dto>();

try{
Class.forName(driver);
conn = DriverManager.getConnection(url, user, password);
sql = "select * from member1228";
pstm = conn.prepareStatement(sql);

rs = pstm.executeQuery();

if(rs!=null){
	while(rs.next()){
		list.add(new Member1228Dto(rs.getString(1),rs.getString(2),rs.getString(3)));
	}
}


} catch(Exception e) {
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

if(list.size() != 0){
	url2 = "selectView.jsp";
	request.setAttribute("list", list);
}else{
	url2 = "index.jsp";
}


RequestDispatcher dispatcher = request.getRequestDispatcher(url2);
dispatcher.forward(request, response);

%>