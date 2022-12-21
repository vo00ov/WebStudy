package org.project.commend;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.dao.MemberDao;

public class MemberDeleteDo implements SQLCommend{

	@Override
	public void excuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			System.out.println("회원삭제");
			
			String userId = request.getParameter("userId");
			String userPw = request.getParameter("userPw");
			
			MemberDao dao = MemberDao.getInstance();
			
			int result = dao.mDel(userId,userPw);
			
			String forwardURL="";
			
			if(result==1) {
				System.out.println("삭제 성공");
			}else {
				System.out.println("실패에에에에ㅔ엥");
			}
			
			request.setAttribute("result", result);
			request.setAttribute("forwardURL", forwardURL);
	}

}
