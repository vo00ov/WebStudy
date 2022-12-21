package org.project.commend;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.dao.MemberDao;

public class MemberUpdateDo implements SQLCommend{

	@Override
	public void excuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			System.out.println("회원수정");
			
			String userId = request.getParameter("userId");
			String userPw = request.getParameter("userPw");
			String email = request.getParameter("email");
			
			MemberDao dao = MemberDao.getInstance();
			
			int result = dao.mUpdate(userId,userPw,email);
			
			String forwardURL;
			
			if(result==1) {
				System.out.println("수정 완료");
				forwardURL = "/test1220.jsp";
			}else {
				System.out.println("실패!!!!!!!");
				forwardURL = "/index.jsp";
			}
			
			request.setAttribute("result", result);
			request.setAttribute("forwardURL", forwardURL);
			
	}

}
