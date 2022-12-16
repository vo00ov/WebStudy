package org.project.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BoardController extends HttpServlet {

	@Override
	public void init() throws ServletException {
		System.out.println("init");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("GET");
		
		String path = req.getContextPath();
		String uri = req.getRequestURI();
		String bUrl = uri.substring(path.length());
		
		if(bUrl.equals("/write.board")){
			System.out.println("게시글 작성");
		}else if(bUrl.equals("/read.board")) {
			System.out.println("게시글 조회");
		}else if(bUrl.equals("/update.board")) {
			System.out.println("게시글 수정");
		}else if(bUrl.equals("/delete.board")) {
			System.out.println("게시글 삭제");
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("POST");
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy");
	}
}
