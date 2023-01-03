package org.project.dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

	public static Connection getConnection() {
		
		Connection conn = null;
		
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/mysqltest";
		String user="root";
		String password="1234";
		
		try {
			Class.forName(driver);
			System.out.println("Driver OK");
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("DB연동 Ok");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Driver X");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("DB연동 실패");
			
		} finally {
			
		}

		
				
		return conn;
	}
}
