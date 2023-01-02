package org.project.commend;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MemberLogout implements MemberService {

	@Override
	public void excuteQueryService(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		String forwardURL = "";

		if (session != null) {
			session.invalidate();
			forwardURL = "/model2/index.jsp";
		}

		request.setAttribute("forwardURL", forwardURL);
	}

}
