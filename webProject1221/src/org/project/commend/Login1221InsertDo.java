package org.project.commend;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.dao.MemberDao;

public class Login1221InsertDo implements MemberCommend {

	@Override
	public void excuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("login");
		
		String userId = request.getParameter("userId");
		String userPw = request.getParameter("userPw");
		String gender = request.getParameter("gender");
		String[] hobbysArr = request.getParameterValues("hobbys");
		
		String hobbys = "";
		for(String hobby : hobbysArr) {
			hobbys += hobby+" ";
		}
		
		String city = request.getParameter("city");
		String memo = request.getParameter("memo");
		
		MemberDao dao = MemberDao.getInstance();
		int result = dao.login1221InsertDo(userId, userPw, gender, hobbys, city, memo);
		
		String forwardURL="";
		if(result!=0) {
			System.out.println("로그인 성공");
			forwardURL = "index1221.jsp";
		}else {
			System.out.println("로그인 실패");
			forwardURL = "login1221.jsp";
		}
		
		request.setAttribute("result", result);
		request.setAttribute("forwardURL", forwardURL);
		
	}

}
