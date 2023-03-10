package org.project.commend;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.dao.MemberDao;
import org.project.dto.MemberDto;

public class MemberSelectDo implements SQLCommend{

	@Override
	public void excuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			System.out.println("ํ์์กฐํ");
			
			MemberDao dao = MemberDao.getInstance();
			ArrayList<MemberDto> mem = dao.mSelect();
			
			String forwardURL = "";
			
			if(mem.size()!=0) {
				forwardURL = "/memberList.jsp";
			}else {
				forwardURL = "/index.jsp";
			}
			
			request.setAttribute("mem", mem);
			request.setAttribute("forwardURL", forwardURL);
	}

}
