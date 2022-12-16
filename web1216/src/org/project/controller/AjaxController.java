package org.project.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 주석, 코드 자동화, 실행시 특정기능 실행
@WebServlet("*.ax")
public class AjaxController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("GET");
		
		String id = req.getParameter("userId");
		String pw = req.getParameter("userPw");
		String name = req.getParameter("userName");
		
		System.out.println("id:" + id);
		System.out.println("pw:" + pw);
		System.out.println("name:" + name);
		
		PrintWriter out = resp.getWriter();
		out.println("ID:" + id);
		out.println("PW:" + pw);
		out.println("NAME:" + name);
		
		out.close();
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("POST");
	}
}
