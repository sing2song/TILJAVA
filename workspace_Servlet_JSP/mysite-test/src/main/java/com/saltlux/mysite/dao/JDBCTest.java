package com.saltlux.mysite.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JDBCTest {
	private static Connection getConnection() throws SQLException {
		//이 함수를 받는 곳에서 sqlException을 처리함으로 throw시킴
		Connection conn = null;
		
		try {
			//1. JDBC Driver 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");

			//2. 연결하기
			String url ="jdbc:mysql://localhost:3306/employees?characterEncoding=utf8&serverTimezone=UTC";
			conn =DriverManager.getConnection(url,"root","ssong");
			
		} catch (ClassNotFoundException e) {
			System.out.println("error-"+e);
		}

		return conn;
	}
	
	
	public JSONObject getJson() {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;
		
		JSONObject jsonObject = new JSONObject();
		JSONObject data = null;
		JSONArray nameArray  = new JSONArray();
		
		System.out.println("go!");
		try {
			conn=getConnection();
			String sql = "select first_name, last_name from employees limit 30";
			pstmt = conn.prepareStatement(sql);	
			
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				String first_name=rs.getString(1);
				String last_name=rs.getString(2);
				//확인용
				System.out.println("first_name:"+first_name+", last_name:"+last_name);
				data = new JSONObject();
				data.put("first_name", first_name);
				data.put("last_name", last_name);		        
				nameArray.add(data);
			}
			jsonObject.put("name", nameArray);
			System.out.println(jsonObject);
			
			
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
		return jsonObject;	
	}
	
}
