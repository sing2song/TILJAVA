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

	public BoardVo findByNo(String no) {
		BoardVo vo=null;
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		try {
			conn = getConnection();
			
			//3. SQL 준비
			String sql = "select title, email, contents from board where no=?";
			pstmt = conn.prepareStatement(sql);

			//4. 바인딩
			pstmt.setString(1,no);
			
			//5. SQL문 실행
			rs = pstmt.executeQuery();

			//6. 데이터 가져오기
			if(rs.next()) {
				String title = rs.getString(1);
				String email = rs.getString(2);
				String contents = rs.getString(3);
				

				vo = new BoardVo();
				vo.setTitle(title);
				vo.setEmail(email);
				vo.setContents(contents);
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
		
		return vo;
	}

	//조회수 늘리기
	public boolean updateHit(String no) {
		boolean result = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = getConnection();
			
			//3. SQL 준비
			String sql = "update board set hit=hit+1 where no=?";
			pstmt = conn.prepareStatement(sql);

			//4. 바인딩
			pstmt.setString(1,no);
			
			//5. SQL문 실행
			int count = pstmt.executeUpdate();

			//6. 결과
			result = count==1;//맞으면 true 아니면 false
			
		}catch (SQLException  e) {
			System.out.println("error : "+e);
		}finally {
			try {				
				if(pstmt!=null) {
					pstmt.close();//없어도 되지만 명시적으로 등록
				}
				if(conn!=null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}		

		return result;
	}

	public boolean update(String no, String title, String contents) {
		boolean result = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = getConnection();
			
			//3. SQL 준비
			String sql = "update board set title=?, contents=? where no=?";
			pstmt = conn.prepareStatement(sql);

			//4. 바인딩
			pstmt.setString(1,title);
			pstmt.setString(2, contents);
			pstmt.setString(3, no);
			
			//5. SQL문 실행
			int count = pstmt.executeUpdate();

			//6. 결과
			result = count==1;//맞으면 true 아니면 false
			
		}catch (SQLException  e) {
			System.out.println("error : "+e);
		}finally {
			try {				
				if(pstmt!=null) {
					pstmt.close();//없어도 되지만 명시적으로 등록
				}
				if(conn!=null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}		

		return result;
		
	}
	
	
}
