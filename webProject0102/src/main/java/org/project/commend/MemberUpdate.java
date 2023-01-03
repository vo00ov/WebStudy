package org.project.commend;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.dao.MemberDao;

public class MemberUpdate implements MemberService {
	
	@Override
	public void excuteQueryService(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		System.out.println("회원수정");
		
		String userId = request.getParameter("userId");
		String userPw = request.getParameter("userPw");
		String userName = request.getParameter("userName");
		
		MemberDao dao = MemberDao.getInstance();
		
		int result = dao.memberUpdate(userId, userPw, userName);
		
		String forwardURL = "";
		
		if(result==1) {
			System.out.println("수정완료");
			forwardURL = "/model2/index.jsp";
		} else {
			System.out.println("수정실패");
			forwardURL = "/model2/index.jsp";
		}
		
		request.setAttribute("forwardURL", forwardURL);
		
		
	}

}
