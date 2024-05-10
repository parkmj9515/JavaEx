package com.javaex.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class PhoneBookDAOImpl implements PhoneBookDAO {
	private Connection getConnection() throws SQLException {
		Connection conn = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String dburl = "jdbc:oracle:thin:@localhost:1521:xe";

			conn = DriverManager.getConnection(dburl, DatabaseConfig.DB_USER, DatabaseConfig.DB_PASS);
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버를 찾을 수 없습니다.");
		}

		return conn;

	}

		@Override
		public List<PhoneBookVO> getList() {
			List<PhoneBookVO> list = new ArrayList<>();
			Connection conn = null;
			Statement stmt = null;
			ResultSet rs = null;
			
			try {
			// 1. Connection
				conn = getConnection();
			// 2. Statement
				stmt = conn.createStatement();
				
			// 3. SQL query 전송 > ResultSet 
				String sql = "select name,hp,tel FROM PhoneBook";
				rs = stmt.executeQuery(sql);
				
				conn = getConnection();
			// 4. ResultSet 순회 > 레코드를 AuthorVO로 변경 >LIST에 추가
				while(rs.next()) {
					
					String name = rs.getString(1); // = rs.getString("author_name")
					String hp = rs.getString(2); // = rs.getString("author_desc")
					String tel = rs.getString(3);
					
					PhoneBookVO pvo = new PhoneBookVO(name,hp,tel);
					list.add(pvo);
				}
			// 5. LIST를 반환
				
			} catch(SQLException e) {
				e.printStackTrace();
			} catch(NullPointerException e) {
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
		public PhoneBookVO get(String name) {
			Connection conn = null;
			PreparedStatement pstmt =null;
			ResultSet rs = null;
			PhoneBookVO vo = null;
			
			try {
				conn = getConnection();
				
				String sql = "SELECT name,hp,tel FROM PhoneBook";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1,name);
				
				rs = pstmt.executeQuery();
				
				if(rs.next()) {		
					String Name = rs.getString(1);
					String hp = rs.getString(2);
					String tel = rs.getString(3);
					
					vo = new PhoneBookVO(name,hp,tel);
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
			
			return vo;
		}	
		
//-----------------------------------------------------------------------------insert
		public boolean insert(PhoneBookVO pvo) {
			Connection conn =null;
			PreparedStatement pstmt = null;
			int insertedCount = 0; // 인서트 결과 영향받은 레코드 수
			
			try {
				// 커넥션
				conn = getConnection();
				// 실행 계획 준비
				String sql = "INSERT INTO PhoneBook (name, hp,tel)" + "VALUES (seq_phone_book1.NEXTVAL,?,?)";
				pstmt = conn.prepareStatement(sql);
				
				pstmt.setString(1, pvo.getName());
				pstmt.setString(2, pvo.getHp());
				pstmt.setString(3, pvo.getTel());
				
				// 쿼리 수행
				insertedCount = pstmt.executeUpdate(); // ==1 true, != false
				
			} catch(SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					if(pstmt != null) pstmt.close();
					if(conn != null) conn.close();
				} catch (Exception e) {}
					
			}
			return insertedCount ==1;
		}
//-----------------------------------------------------------------------------delete
		public boolean delete(Long id) {
			Connection conn = null;
			PreparedStatement pstmt =null;
			int deletedCount = 0;
			
			try {
				conn = getConnection();
				String sql = "DELETE  FROM PhoneBook where id=?";
				pstmt = conn.prepareStatement(sql);
				
				pstmt.setLong(1, id);
				
				deletedCount = pstmt.executeUpdate();
			} catch(SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					if(pstmt != null)pstmt.close();
					if(conn != null)conn.close();
				} catch(Exception e) {}
			}
			return deletedCount == 1;
		}

//------------------------------------------------------------------------------UPDATE
		public boolean update(PhoneBookVO pvo) {
			Connection conn = null;
			PreparedStatement pstmt = null;
			int updatedCount =0;
			
			try {
			// Connection 맺기
				conn = getConnection();
			
			// 실행 계획 준비
				String sql = "UPDATE PhoneBook SET id=?, name=?, hp=?, tel=?  WHERE name=?";
				pstmt = conn.prepareStatement(sql);
			
			// 파라미터 바인딩
				
				pstmt.setString(1, pvo.getName());
				pstmt.setString(2, pvo.getHp());
				pstmt.setString(3, pvo.getTel());
				
			// SQL실행 > 영향 받은 레코드 카운트
				updatedCount = pstmt.executeUpdate();
				
			} catch(SQLException e) {
				e.printStackTrace();
				
			} finally {
				try {
					if(pstmt != null) pstmt.close();
					if(conn != null) conn.close();
				} catch (Exception e) { }
			}
			
			return updatedCount == 1;
		}

		@Override
		public boolean delete(String name) {
			// TODO Auto-generated method stub
			return false;
		}

	
		
		

}
