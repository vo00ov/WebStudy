package org.project.commend;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.project.dao.MemberDao;

public class MemberLogin implements MemberService{

	@Override
	public void excuteQueryService(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		String userId = request.getParameter("userId");
		String userPw = request.getParameter("userPw");
		
		MemberDao dao = MemberDao.getInstance();
		
		int result = dao.MemberLogin(userId,userPw);
	
		String forwardURL = "";
		
		if(result == 1) {
			System.out.println("로그인 성공");
			
			session.setAttribute("sessionId", userId);
			if(userId.equals("admin")) {
				session.setAttribute("USER_ROLE", "ROLE_ADMIN");
			} else {
				session.setAttribute("USER_ROLE", "ROLE_USER");				
			}
			session.setMaxInactiveInterval(60*60);
			forwardURL="/model2/index.jsp";
		} else {
			System.out.println("로그인 실패");
			
			forwardURL="/model2/login.jsp";
		}
		
		
		request.setAttribute("forwardURL", forwardURL);
	}

}
