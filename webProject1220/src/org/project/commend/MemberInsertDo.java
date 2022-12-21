package org.project.commend;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.dao.MemberDao;

public class MemberInsertDo implements SQLCommend{

	@Override
	public void excuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			System.out.println("회원가입");
			
			String userId = request.getParameter("userId");
			String userPw = request.getParameter("userPw");
			String email = request.getParameter("email");
			
			
			
			MemberDao dao = MemberDao.getInstance();
			
			int result = dao.mInsert(userId,userPw,email);
			
			String forwardURL;
			
			if(result == 1) {
				System.out.println("회원가입 완료");
				forwardURL="/Login.jsp";
			}else {
				System.out.println("회원가입 실패");
				forwardURL="/index.jsp";				
			}
			
			request.setAttribute("result", result);
			request.setAttribute("forwardURL", forwardURL);
	}

}
