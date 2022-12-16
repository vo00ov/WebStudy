package org.project.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Front extends HttpServlet{
	
	// get방식으로 요청 -> 브라우저 주소에 입력하는 경우
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String path = request.getContextPath();		// 프로젝트 기본 경로(path)
		//web1216
		
		String uri = request.getRequestURI();		// 프로젝트 +파일(요청) 경로
		//web1216/insert.do
		
		String bUrl = uri.substring(path.length());	// 문자열에서 시작번지부터 ~나머지 문자열 get
		
		
		System.out.println(path);
		System.out.println(uri);
		System.out.println(bUrl);

		System.out.println("=======================================");
		
		String host = request.getRemoteHost();		// 요청 host
		System.out.println(host);
		StringBuffer URL = request.getRequestURL();	// 요청 전체경로
		System.out.println(URL);
		
		//insert.do -> 콘솔에 회원가입 
		//update.do -> 콘솔에 회원수정 
		//select.do -> 콘솔에 회원조회 
		//delete.do -> 콘솔에 회원탈퇴 
		
		String url="";
		if(bUrl.equals("/insert.do")) {
			System.out.println("회원가입");
		}else if(bUrl.equals("/update.do")) {
			System.out.println("회원수정");
		}else if(bUrl.equals("/select.do")) {
			System.out.println("회원조회");
		}else if(bUrl.equals("/delete.do")) {
			System.out.println("회원삭제");
		}
		
		//서버 -> 클라이언트 응답 -> HTML로 응답
		PrintWriter out = response.getWriter();
		
		out.println("<!doctype html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>servlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Servlet -> Response</h1>");
		
		out.println("path1216 : " + path);
		out.println("uri : " + uri);
		out.println("bUrl : " + bUrl);
		out.println("host : " + host);
		out.println("URL : " + URL);
		
		out.println("</body>");
		
		out.println("</html>");

		
		out.close();
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("POST");
	}

}
