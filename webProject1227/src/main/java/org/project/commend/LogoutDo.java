package org.project.commend;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutDo implements MemberCommnend {

	@Override
	public void excuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("로그아웃");
		
		String forwardURL = "";
		
		HttpSession session = request.getSession();
		if(session != null) {
			session.invalidate();
			forwardURL = "/index.do";
		}
		
		request.setAttribute("forwardURL", forwardURL);
	}

}
