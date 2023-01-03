package org.project.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.commend.MemberDelete;
import org.project.commend.MemberInsert;
import org.project.commend.MemberList;
import org.project.commend.MemberLogin;
import org.project.commend.MemberLogout;
import org.project.commend.MemberService;
import org.project.commend.MemberUpdate;
import org.project.commend.MemberView;

@WebServlet("*.do")
public class MemberController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		System.out.println("GET");
		doWeb(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		System.out.println("POST");
		doWeb(request, response);
	}

	private void doWeb(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String path =  request.getContextPath();
		String uri = request.getRequestURI();
		String basic = uri.substring(path.length());
		
		MemberService ms = null;
		String forwardURL = "";
		
		if(basic.equals("/index.do")) {
			forwardURL = "/model2/index.jsp";
		}else if(basic.equals("/joinView.do")) {
			forwardURL = "/model2/join.jsp";
		}else if(basic.equals("/loginView.do")) {
			forwardURL = "/model2/login.jsp";
		}else if(basic.equals("/memberList.do")) {
			ms = new MemberList();
			ms.excuteQueryService(request, response);
			forwardURL = "/model2/memberList.jsp";
		}else if(basic.equals("/*.do")) {
			forwardURL = "/model2/index.jsp";
		}else if(basic.equals("/joinOk.do")) {
			ms = new MemberInsert();
			ms.excuteQueryService(request, response);
			forwardURL = (String) request.getAttribute("forwardURL");
		}else if(basic.equals("/loginOk.do")) {
			ms = new MemberLogin();
			ms.excuteQueryService(request, response);
			forwardURL = (String) request.getAttribute("forwardURL");	
		}else if(basic.equals("/logout.do")) {
			ms = new MemberLogout();
			ms.excuteQueryService(request, response);
			forwardURL = (String) request.getAttribute("forwardURL");
		}else if(basic.equals("/memberView.do")) {
			ms = new MemberView();
			ms.excuteQueryService(request, response);
			forwardURL =  (String) request.getAttribute("forwardURL");
		}else if(basic.equals("/memberUpdate.do")) {
			ms = new MemberUpdate();
			ms.excuteQueryService(request, response);
			forwardURL = (String) request.getAttribute("forwardURL");
		}else if(basic.equals("/memberDelete.do")) {
			ms = new MemberDelete();
			ms.excuteQueryService(request, response);
			forwardURL = (String) request.getAttribute("forwardURL");
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(forwardURL);
		dispatcher.forward(request, response);
		
	}
}
