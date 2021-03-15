package com.saltlux.mysite.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.saltlux.mysite.vo.BoardVo;

public class BoardDao {
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
	
	public List<BoardVo> findAll(){
		List<BoardVo> list = new ArrayList<>();
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;

		try {
			conn = getConnection();
			
			//3. SQL 준비
			String sql = "select no, title, writer, email, password, hit ,date_format(regDate, '%Y-%m-%d %H:%i:%s') from board order by no desc";
			pstmt = conn.prepareStatement(sql);

			//4. 바인딩
			//여기선 지금 필요없음!!!

			//5. SQL문 실행
			rs = pstmt.executeQuery();

			//6. 데이터 가져오기
			while(rs.next()) {
				Long no = rs.getLong(1);
				String title = rs.getString(2);
				String writer = rs.getString(3);
				String email = rs.getString(4);
				String password = rs.getString(5);
				String hit = rs.getString(6);
				String regDate = rs.getString(7);

				BoardVo vo = new BoardVo();
				vo.setNo(no);
				vo.setTitle(title);
				vo.setWriter(writer);
				vo.setEmail(email);
				vo.setPassword(password);
				vo.setHit(hit);
				vo.setRegDate(regDate);
				
				list.add(vo);
			}

		}catch (SQLException  e) {
			System.out.println("error : "+e);
		}finally {
			try {
				if(rs==null) {
					rs.close();
				}
				if(pstmt!=null) {
					pstmt.close();//없어도 되지만 명시적으로 등록
				}
				if(conn!=null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}		

		return list;
	}
	
	
}
