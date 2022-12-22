package org.project.commend;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.project.dao.MemberDao;
import org.project.dto.Login1221Dto;

public class LoginDo implements MemberCommend {

	@Override
	public void excuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("login");
		
		String userId = request.getParameter("userId");
		String userPw = request.getParameter("userPw");
		
		MemberDao dao = MemberDao.getInstance();
		
		ArrayList<Login1221Dto> user = dao.login(userId, userPw);
		
		String forwardURL="";
		HttpSession session = null;
		
		if(user.size()==1) {
			session.setAttribute("userId", userId);
		
			forwardURL = "loginOk.jsp";
		}else {
			forwardURL = "login1221.jsp";
		}
		
		request.setAttribute("user", user);
		request.setAttribute("forwardURL", forwardURL);
	}

}
