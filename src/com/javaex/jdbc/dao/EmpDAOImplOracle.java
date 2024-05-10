package com.javaex.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmpDAOImplOracle implements HREmpDAO {
	private Connection getConnection() throws SQLException {
		Connection conn = null;
		
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		
		conn = DriverManager.getConnection(dburl,DatabaseConfig.DB_USER,DatabaseConfig.DB_PASS);
		
		} catch(ClassNotFoundException e) {
			System.err.println("드라이버를 찾을수없습니다");
		} 
		return conn;
	}

		public List<HREmpVO> getList() {
			List<HREmpVO> list = new ArrayList<>();
			Connection conn = null;
			Statement stmt = null;
			ResultSet rs = null;
			
			try {
			// 1. Connection
				conn = getConnection();
			// 2. Statement
				stmt = conn.createStatement();
			// 3. SQL query 전송 > ResultSet 
				String sql = "SELECT first_name || '' || last_name, email,phone_number,hire_date  FROM employees  WHERE lower(first_name) Like '&' or lower(last_name) Like '%'";
				rs = stmt.executeQuery(sql);
			// 4. ResultSet 순회 > 레코드를 AuthorVO로 변경 >LIST에 추가
				while(rs.next()) {
					String Name = rs.getString(1); //  = rs.getLong("author_Id")
					String email = rs.getString(2); // = rs.getString("author_name")
					String phone = rs.getString(3); // = rs.getString("author_desc")
					String hiredate = rs.getString(4);
					
					HREmpVO hvo = new HREmpVO(Name,email,phone,hiredate);
					list.add(hvo);
				}
			// 5. LIST를 반환
				
			} catch(SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					if(rs != null) rs.close();
					if(stmt != null)stmt.close();
					if(conn != null)conn.close();
				}catch(Exception e) {}
			}
			return list;
	}
		
		@Override
		public HREmpVO get(String name) {
			Connection conn = null;
			PreparedStatement pstmt =null;
			ResultSet rs = null;
			HREmpVO hvo = null;
			
			try {
				conn = getConnection();
				
				String sql = "SELECT first_name || '' || last_name, email,phone_number,hire_date  FROM employees  WHERE lower(first_name) Like '&' or lower(last_name) Like '%'";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1,sql);
				
				rs = pstmt.executeQuery();
				
				if(rs.next()) {
					String Name = rs.getString(1);
					String email = rs.getString(2);
					String phone = rs.getString(3);
					String hiredate = rs.getString(4);
					
					hvo = new HREmpVO(Name,email, phone,hiredate);
				}
			} catch(SQLException e) {
				e.printStackTrace(); 
				
			} finally {
				try {
					if(rs != null)rs.close();
					if(pstmt != null)pstmt.close();
					if(conn != null)conn.close();
				} catch(Exception e) {}
			} 
			
			return hvo;
		}
}
