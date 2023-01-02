package org.project.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.commend.LoginOkDo;
import org.project.commend.LogoutDo;
import org.project.commend.MemberCommnend;
import org.project.commend.MemberDeleteDo;
import org.project.commend.MemberInsertDo;
import org.project.commend.MemberSelectDo;
import org.project.commend.MemberUpdateDo;

@WebServlet("*.do")
public class MemberController extends HttpServlet {
	// get, post -> 메서드 webApp(); 
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		System.out.println("GET");
		webApp(request, response);
	}
	
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		System.out.println("POST");
		webApp(request, response);		
	}
	
	private void webApp(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		MemberCommnend mc = null;
		
		String path = request.getContextPath();
		String uri = request.getRequestURI();
		String basicURL = uri.substring(path.length());
		
		String forwardURL = "";
		
		if(basicURL.equals("/MemberInsert.do")) {
			// 일시키고 -> commned
			// View -> url, 값
			mc = new MemberInsertDo();
			mc.excuteQueryCommend(request, response);
			forwardURL = (String)request.getAttribute("forwardURL");
		}else if(basicURL.equals("/MemberSelect.do")){
			mc = new MemberSelectDo();
			mc.excuteQueryCommend(request, response);
			forwardURL = (String)request.getAttribute("forwardURL");
		}else if(basicURL.equals("/MemberUpdate.do")){
			mc = new MemberUpdateDo();
			mc.excuteQueryCommend(request, response);
			forwardURL = (String)request.getAttribute("forwardURL");
		}else if(basicURL.equals("/MemberDelete.do")){
			mc = new MemberDeleteDo();
			mc.excuteQueryCommend(request, response);
			forwardURL = (String)request.getAttribute("forwardURL");
		}else if(basicURL.equals("/LoginOk.do")){
			mc = new LoginOkDo();
			mc.excuteQueryCommend(request, response);
			forwardURL = (String)request.getAttribute("forwardURL");
		}else if(basicURL.equals("/Logout.do")){
			mc = new LogoutDo();
			mc.excuteQueryCommend(request, response);
			forwardURL = (String)request.getAttribute("forwardURL");
		}else if(basicURL.equals("/index.do")) {
			forwardURL = "/index.jsp";
		}else if(basicURL.equals("/join.do")) {
			forwardURL = "/join.jsp";
		}else if(basicURL.equals("/login.do")) {
			forwardURL = "/login.jsp";
		}
		
		
		// View -> url, 값
		RequestDispatcher dispatcher = request.getRequestDispatcher(forwardURL);
		dispatcher.forward(request, response);
	}
}
