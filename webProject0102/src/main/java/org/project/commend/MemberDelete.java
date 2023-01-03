package org.project.commend;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.dao.MemberDao;

public class MemberDelete implements MemberService {
	
	@Override
	public void excuteQueryService(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String userId = request.getParameter("userId");
		
		MemberDao dao = MemberDao.getInstance();
		
		int result = dao.memberDelete(userId);
		
		String forwardURL = "";
		
		if(result == 1) {
			System.out.println("삭제완료");
			forwardURL = "/model2/index.jsp";
		}else {
			System.out.println("취소");
			forwardURL = "/model2/index.jsp";
		}
		
		request.setAttribute("forwardURL", forwardURL);
	}

}
