package org.project.commend;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.dao.MemberDao;
import org.project.dto.MemberDto;

public class MemberSelectDo implements MemberCommend{

	@Override
	public void excuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("회원조회");
		
		MemberDao dao = MemberDao.getInstance();
		ArrayList<MemberDto> list = dao.selectDo();
		
		PrintWriter out=response.getWriter();
		
		if(list.size()==0) {
			System.out.println("없다");
		}else if(list.size() != 0) {
			for(MemberDto a : list) {
//				System.out.println(a.getUserId());
//				System.out.println(a.getUserPw());
//				System.out.println(a.getEmail());
				
				out.println(a.getUserId());
				out.println(a.getUserPw());
				out.println(a.getEmail());
				
				out.close();
				
			}
		}
	}
	
}
