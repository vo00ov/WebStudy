package org.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.project.dbconnect.DBConnect;
import org.project.dto.MemberDto;

public class MemberDao {

	private static class SingleTon {

		private static final MemberDao INSTANCE = new MemberDao();

	}

	private MemberDao() {

	}

	public static MemberDao getInstance() {
		return SingleTon.INSTANCE;
	}

//======================================================================	
	
	Connection conn;
	PreparedStatement pstm;
	String sql;
	
	public int mInsertDo(String userId, String userPw, String gender, String hobbys, String city, String memo) {
		int result = 0;
		
		try {
			conn = DBConnect.getConnection();
			sql = "insert into login1222(userId,userPw,gender,hobbys,city,memo) values(?,?,?,?,?,?)";
			pstm = conn.prepareStatement(sql);

			pstm.setString(1, userId);
			pstm.setString(2, userPw);
			pstm.setString(3, gender);
			pstm.setString(4, hobbys);
			pstm.setString(5, city);
			pstm.setString(6, memo);
			
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
	public int loginDo(String userId, String userPw) {
		ResultSet rs = null;
		int result = 0;
		
		try {
			conn = DBConnect.getConnection();
			sql = "select count(*) from login1222 where userId=? and userPw=?";
			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, userId);
			pstm.setString(2, userPw);
			
			rs = pstm.executeQuery();
			
			if(rs!=null) {
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

}
