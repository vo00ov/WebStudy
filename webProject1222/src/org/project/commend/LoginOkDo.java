package org.project.commend;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.project.dao.MemberDao;

public class LoginOkDo implements MemberCommnend {

	@Override
	public void excuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("로그인성공");
		int result = 0;
		HttpSession session = request.getSession();
		
		String userId = request.getParameter("userId");
		String userPw = request.getParameter("userPw");
		
		MemberDao dao = MemberDao.getInstance();
		
		String forwardURL = "";
		result = dao.loginDo(userId, userPw);
		
		if(result == 1) {
			System.out.println("로그인이 되었습니다");
			session.setAttribute(userId, "userId");
			session.setMaxInactiveInterval(60*60);
			forwardURL = "/index.do";
		}else {
			System.out.println("다시 로그인해주세요");
			forwardURL = "/login.do";
		}
		
		request.setAttribute("result", result);
		request.setAttribute("forwardURL", forwardURL);
	}

}
