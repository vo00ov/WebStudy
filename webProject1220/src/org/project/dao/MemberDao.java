package org.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.project.dbconnect.DBConnect;
import org.project.dto.MemberDto;

public class MemberDao {

	private static class SingleTon{
		
		private static final MemberDao INSTANCE = new MemberDao();
	}
	
	private MemberDao() {
		System.out.println("MemberDao");
	}
	
	public static MemberDao getInstance() {
		return SingleTon.INSTANCE;
	}

//================================================================================	
	
	Connection conn;
	String sql;
	PreparedStatement pstm;
	
	
	public int mInsert(String userId, String userPw, String email) {
		int result = 0;
		
		try {
			conn = DBConnect.getConnection();
			sql = "insert into member1219(userId,userPw,email) values(?,?,?)";
			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, userId);
			pstm.setString(2, userPw);
			pstm.setString(3, email);
			
			result = pstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn!=null)conn.close();
				if(pstm!=null)pstm.close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				
			}
		}
		
		return result;
	}

	public ArrayList<MemberDto> mSelect() {
		ArrayList<MemberDto> mem = new ArrayList<MemberDto>();
		ResultSet rs;
		
		try {
			conn = DBConnect.getConnection();
			sql = "select * from member1219";
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			
			if(rs!=null) {
				while(rs.next()) {
					mem.add(new MemberDto(rs.getString(1), rs.getString(2), rs.getString(3)));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn!=null)conn.close();
				if(pstm!=null)pstm.close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				
			}
		}
		
		return mem;
	}

	public int mUpdate(String userId, String userPw, String email) {
		int result = 0;
		
		try {
			conn=DBConnect.getConnection();
			sql="update member1219 set userPw=?, email=? where userId=?";
			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, userPw);
			pstm.setString(2, email);
			pstm.setString(3, userId);
			
			result = pstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn!=null)conn.close();
				if(pstm!=null)pstm.close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				
			}
		}
		
		return result;
	}

	public int mDel(String userId, String userPw) {
		int result = 0;
		
		try {
			conn = DBConnect.getConnection();
			sql = "delete from member1219 where userId=? and userPw=?";
			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, userId);
			pstm.setString(2, userPw);
			
			result = pstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn!=null)conn.close();
				if(pstm!=null)pstm.close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				
			}
		}
		
		
		return result;
	}
	
	
}
