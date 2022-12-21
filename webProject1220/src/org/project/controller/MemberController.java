package org.project.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.commend.MemberDeleteDo;
import org.project.commend.MemberInsertDo;
import org.project.commend.MemberSelectDo;
import org.project.commend.MemberUpdateDo;
import org.project.commend.SQLCommend;

@WebServlet("*.do")
public class MemberController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		System.out.println("GET");
//		doPost(request, response);
		doWeb(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		System.out.println("POST");
		doWeb(request, response);
	}
	
	private void doWeb(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = request.getContextPath();
		String uri = request.getRequestURI();
		String basic = uri.substring(path.length());	// "/*.do"
		
		String forwardURL="";	// 컨트롤러에서 View로 연결
		
		SQLCommend sc;
		
		if(basic.equals("/memberInsert.do")) {
			sc = new MemberInsertDo();
			sc.excuteQueryCommend(request, response);
			forwardURL=(String) request.getAttribute("forwardURL");
		}else if(basic.equals("/memberSelect.do")) {
			sc = new MemberSelectDo();
			sc.excuteQueryCommend(request, response);
			forwardURL = (String) request.getAttribute("forwardURL");
		}else if(basic.equals("/memberUpdate.do")) {
			sc = new MemberUpdateDo();
			sc.excuteQueryCommend(request, response);
			forwardURL = (String) request.getAttribute("forwardURL");
		}else if(basic.equals("/memberDelete.do")) {
			sc = new MemberDeleteDo();
			sc.excuteQueryCommend(request, response);
			forwardURL = (String) request.getAttribute("forwardURL");
		}else if(basic.equals("/test1220.do")) {
			forwardURL = "/test1220.jsp";
		}else if(basic.equals("/index.do")) {
			forwardURL = "/index.jsp";
		}else if(basic.equals("/SignUp.do")) {
			forwardURL = "/SignUp.jsp";
		}else if(basic.equals("/Login.do")) {
			forwardURL = "/Login.jsp";
		}else if(basic.equals("/del.do")) {
			forwardURL = "/del.jsp";
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(forwardURL);
		dispatcher.forward(request, response);
		
		
		
		
		
		
		
		

	}
}
