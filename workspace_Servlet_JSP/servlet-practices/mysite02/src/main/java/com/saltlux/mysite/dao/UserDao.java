package com.saltlux.mysite.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.saltlux.mysite.vo.UserVo;

public class UserDao {
	
	public UserVo findByEmailAndPassword(UserVo vo) {
		UserVo userVo = null;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = getConnection();
			String sql = "select no,name from user where email=? and password=?";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, vo.getEmail());
			pstmt.setString(2, vo.getPassword());
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {//값은 하나!
				userVo = new UserVo();
				
				userVo.setNo(rs.getLong(1));
				userVo.setName(rs.getString(2));
			}
			
			
		} catch (SQLException e) {
			System.out.println("error : "+e);
		}finally {
			try {
				if(rs!=null) {
					rs.close();
				}
				if(pstmt!=null) {
					pstmt.close();
				}
				if(conn!=null) {
					conn.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return userVo;
	}
	
	public boolean insert(UserVo vo) {
		boolean result = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = getConnection();
			String sql = "insert into user values(null,?,?,?,?,now())";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getEmail());
			pstmt.setString(3, vo.getPassword());
			pstmt.setString(4, vo.getGender());
			
			int count = pstmt.executeUpdate();
			result = count==1;
			
		} catch (SQLException e) {
			System.out.println("error : "+e);
		}finally {
			try {
				if(pstmt!=null) {
					pstmt.close();
				}
				if(conn!=null) {
					conn.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	
	private Connection getConnection() throws SQLException {
		//이 함수를 받는 곳에서 sqlException을 처리함으로 throw시킴
		Connection conn = null;
		
		try {
			//1. JDBC Driver 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");

			//2. 연결하기
			String url ="jdbc:mysql://localhost:3306/webdb?characterEncoding=utf8&serverTimezone=UTC";
			conn =DriverManager.getConnection(url,"webdb","webdb");
			
		} catch (ClassNotFoundException e) {
			System.out.println("error-"+e);
		}

		return conn;
	}
}
