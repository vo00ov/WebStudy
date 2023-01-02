package org.project.commend;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.dao.MemberDao;
import org.project.dto.Member1228Dto;

public class MemberView implements MemberService{

	@Override
	public void excuteQueryService(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("내 정보 조회");
		
		String userId = request.getParameter("userId");
		
		MemberDao dao = MemberDao.getInstance();
		
		Member1228Dto info = dao.myInfo(userId);
		
		String forwardURL ="";
		if(info!=null) {
			System.out.println("조회성공");
			request.setAttribute("info", info);
			forwardURL = "/model2/memberView.jsp";
		}
		
		request.setAttribute("forwardURL", forwardURL);
	}
}
