package org.project.commend;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.dao.MemberDao;

public class MemberInsertDo implements MemberCommnend {

	@Override
	public void excuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("회원가입");
		
		String userId = request.getParameter("userId");
		String userPw = request.getParameter("userPw");
		String gender = request.getParameter("gender");
	
		String[] hobbysArr = request.getParameterValues("hobbys");
		String hobbys="";
		for(String hobby : hobbysArr) {
			hobbys += hobby + "";
		}
	
		String city = request.getParameter("city");
		String memo = request.getParameter("memo");
		
		MemberDao dao = MemberDao.getInstance();
		
		int result = dao.mInsertDo(userId, userPw, gender, hobbys, city, memo);
		
		String forwardURL = "";
		
		if(result == 1) {
			System.out.println("가입완료!");
			forwardURL = "index.jsp";
		}else {
			System.out.println("가입실패!");
			forwardURL = "join.jsp";
		}
		
		request.setAttribute("result", result);
		request.setAttribute("forwardURL", forwardURL);
	}

}
