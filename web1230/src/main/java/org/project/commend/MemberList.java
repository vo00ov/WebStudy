package org.project.commend;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.dao.MemberDao;
import org.project.dto.Member1228Dto;

public class MemberList implements MemberService{

	@Override
	public void excuteQueryService(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("회원목록 조회");
		
		MemberDao dao = MemberDao.getInstance();
		
		ArrayList<Member1228Dto> list = dao.MemberSelect();
		
		String forwardURL="";
		
		if(list.size()!=0) {
			System.out.println("조회결과");
			request.setAttribute("list", list);
			forwardURL = "/model2/memberList.jsp";
		}else {
			System.out.println("조회결과가 없다");
			forwardURL = "/model2/index.jsp";
		}
		
		request.setAttribute("forwardURL", forwardURL);
	}
}
