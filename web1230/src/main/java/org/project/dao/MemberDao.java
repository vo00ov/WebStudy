package org.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.project.dbconnect.DBConnect;
import org.project.dto.Member1228Dto;

public class MemberDao {

	private static class SingleTon {
		
		private static final MemberDao INSTANCE = new MemberDao(); 
	}
	
	private MemberDao() {
		
	}
	
	public static MemberDao getInstance() {
		return SingleTon.INSTANCE;
	}
	//=========================================================

	Connection conn;
	PreparedStatement pstm;
	String sql;
	
	// 회원가입
	public int MemberInsert(String userId, String userPw, String userName) {
		int result= 0;
		
		try {
			conn = DBConnect.getConnection();
			sql = "insert into member1228(userId,userPw,userName) values(?,?,?)";
			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, userId);
			pstm.setString(2, userPw);
			pstm.setString(3, userName);
			
			result = pstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn != null) conn.close();
				if(pstm != null) pstm.close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				
			}
		}
		
		return result;
	}
	
	// 로그인
	public int MemberLogin(String userId, String userPw) {
		int result = 0;
		ResultSet rs = null;
		
		try {
			conn = DBConnect.getConnection();
			sql = "select count(*) from member1228 where userId=? and userPw=?";
			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, userId);
			pstm.setString(2, userPw);
			
			rs = pstm.executeQuery();
			
			if(rs != null) {
				while(rs.next()) {
					result = rs.getInt(1);
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn != null) conn.close();
				if(pstm != null) pstm.close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				
			}
		}
		
		
		return result;
	}

	// 회원목록 조회
	public ArrayList<Member1228Dto> MemberSelect() {
		ArrayList<Member1228Dto> list = new ArrayList<Member1228Dto>();
		ResultSet rs;
		
		try {
			conn = DBConnect.getConnection();
			sql = "select * from member1228";
			pstm = conn.prepareStatement(sql);
			
			rs = pstm.executeQuery();
			
			if(rs != null) {
				while(rs.next()) {
					list.add(new Member1228Dto(rs.getString(1), rs.getString(2), rs.getString(3)));				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn != null) conn.close();
				if(pstm != null) pstm.close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				
			}
		}
		
		return list;
	}

	// 내 정보
	public Member1228Dto myInfo(String userId) {
	ResultSet rs;
	Member1228Dto user = null;
		try {
			conn = DBConnect.getConnection();
			sql = "select * from member1228 where userId=?";
			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, userId);
			
			rs=pstm.executeQuery();
			
			if(rs!=null) {
				while(rs.next()) {
					user = new Member1228Dto(rs.getString(1), rs.getString(2), rs.getString(3));	
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn != null) conn.close();
				if(pstm != null) pstm.close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				
			}
		}
		return user;
	}

	// 회원수정
	public int memberUpdate(String userId, String userPw, String userName) {
		int result = 0;
		
		try {
			conn = DBConnect.getConnection();
			sql = "update member1228 set userPw=?,userName=? where userId =?";
			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, userPw);
			pstm.setString(2, userName);
			pstm.setString(3, userId);
			
			result = pstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn != null) conn.close();
				if(pstm != null) pstm.close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				
			}
		}
		
		return result;
	}
	// 탈퇴
	public int memberDelete(String userId) {
		int result = 0;
		
		try {
			conn = DBConnect.getConnection();
			sql = "delete from member1228 where userId=?";
			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, userId);
			
			result = pstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn != null) conn.close();
				if(pstm != null) pstm.close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				
			}
		} 
		
		return result;
	}

	
	
	
	
	
	
}
