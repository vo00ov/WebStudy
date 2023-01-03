package org.project.commend;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.dao.MemberDao;

public class MemberInsert implements MemberService{

	@Override
	public void excuteQueryService(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("회원가입");
		
		String userId = request.getParameter("userId");
		String userPw = request.getParameter("userPw");
		String userName = request.getParameter("userName");
		
		MemberDao dao = MemberDao.getInstance();
		
		int result = dao.MemberInsert(userId, userPw, userName);
		
		String forwardURL = "";
		
		if(result==1) {
			System.out.println("회원가입 되었습니다.");
			forwardURL = "/model2/login.jsp";
		} else {
			System.out.println("잘못된 입력값이 있습니다.");
			forwardURL = "/model2/index.jsp";			
		}
		
		request.setAttribute("result", result);
		request.setAttribute("forwardURL", forwardURL);
	}

}
