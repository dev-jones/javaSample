package com.devJones.web.db.dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	public static Connection initConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			System.out.println("오라클 드라이버 연결 성공");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			
			System.out.println("오라클 드라이버 연결 실패");
		}
		
		return null;
	}
	
	public static Connection getConnection() {
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/ORCL", "C##YONGHO", "highland");
			
			System.out.println("오라클 데이터베이스 연결 성공");
			
		} catch (SQLException e) {
			e.printStackTrace();
			
			System.out.println("오라클 데이터베이스 연결 실패");
		}
		
		return conn;
	}
}
