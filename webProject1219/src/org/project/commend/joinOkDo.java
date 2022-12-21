package org.project.commend;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.dao.MemberDao;

public class joinOkDo implements MemberCommend {

	@Override
	public void excuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		
		String userId = request.getParameter("userId");
		String userPw = request.getParameter("userPw");
		String userName = request.getParameter("userName");
		String gender = request.getParameter("gender");
		// 다중 데이터 -> 취미
		String[] hobbys = request.getParameterValues("hobbys");
		String hArr = "";
		for(String h : hobbys) {
			hArr += h + " ";
		}
		
		// 다중 데이터 -> 전화번호
		String[] phone = request.getParameterValues("phone");
		String pArr = "";
		for(String p : phone) {
			pArr += p + " ";
		}
		
		String memo = request.getParameter("memo");
		
//		System.out.println("userId : " + userId);
//		System.out.println("userPw : " + userPw);
//		System.out.println("userName : " + userName);
//		System.out.println("gender : " + gender);
//		System.out.println("hobbys : " + hArr);
//		System.out.println("phone : " + pArr);
//		System.out.println("memo : " + memo);
		
		
		MemberDao dao = MemberDao.getInstance();
		int result = dao.joinOkDo(userId,userPw,userName,gender,hArr,pArr,memo);
	}

}
