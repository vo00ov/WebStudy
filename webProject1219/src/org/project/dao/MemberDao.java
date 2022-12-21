package org.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.project.dbconnect.DBConnect;
import org.project.dto.MemberDto;

public class MemberDao {
	// 싱글톤 -> 객체를 한번만 생성 1
//	private static final MemberDao INSTANCE = new MemberDao();
//	
//	private MemberDao() {
//		System.out.println("MemberDao");
//	}
//	
//	public static MemberDao getInstance() {
//		return INSTANCE;
//	}

// 싱글톤 -> 객체를 한번만 생성 2
	private static class SingleTon {
		// 객체를 한번만 생성
		private static final MemberDao INSTANCE = new MemberDao();
	}

	private MemberDao() {
		System.out.println("MemberDao");
	}

	public static MemberDao getInstance() {
		return SingleTon.INSTANCE;
	}

	
	
//	public MemberDao() {
//		System.out.println("MemberDao");
//	}
	
	Connection conn;
	PreparedStatement pstm;
	String sql = "";
	
	
	public int insertDo(String userId, String userPw, String email) {
		int result = 0;
		
		try {
			conn = DBConnect.getConnection();
			sql = "insert into member1219(userId, userPw, email) VALUES(?,?,?)";
			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, userId);
			pstm.setString(2, userPw);
			pstm.setString(3, email);
			
			result = pstm.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn != null) conn.close();
				if(pstm != null) pstm.close();
			}catch (Exception e) {
				e.printStackTrace();
			} finally {
				
			}
		}
		
		return result;
	}

	public ArrayList<MemberDto> selectDo() {
		ArrayList<MemberDto> list = new ArrayList<MemberDto>();
		ResultSet rs;
		
		
		try {
			conn = DBConnect.getConnection();
			sql = "select*from member1219";
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			
			if(rs != null) {
				while(rs.next()) {
					list.add(new MemberDto(rs.getString(1), rs.getString(2), rs.getString(3)));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn != null) conn.close();
				if(pstm != null) pstm.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		return list;
	}

	public int joinOkDo(String userId, String userPw, String userName, String gender, String hArr, String pArr,
			String memo) {
		int result = 0;
		
		try {
			conn = DBConnect.getConnection();
			sql = "insert into test_tb_1219(userId,userPw,userName,gender,hobbys,phone,memo) values(?,?,?,?,?,?,?)";
			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, userId);
			pstm.setString(2, userPw);
			pstm.setString(3, userName);
			pstm.setString(4, gender);
			pstm.setString(5, hArr);
			pstm.setString(6, pArr);
			pstm.setString(7, memo);
			
			result = pstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn!=null)conn.close();
				if(pstm!=null)pstm.close();
			}catch (Exception e) {
				e.printStackTrace();
			}finally {
				
			}
		}
		
		
		
		return result;
	}

	public int deleteDo(String userId) {
		int result = 0;
		
		conn = DBConnect.getConnection();
		sql = "delete from test_tb_1219 where userId=?";
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, userId);
			
			result = pstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn!=null)conn.close();
				if(pstm!=null)pstm.close();
			}catch (Exception e) {
				e.printStackTrace();
			}finally {
				
			}
		}
		
		return result;
	}

	
}
