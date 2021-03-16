package com.saltlux.mysite.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.saltlux.mysite.dao.BoardDao;
import com.saltlux.mysite.vo.BoardVo;
import com.saltlux.mysite.vo.UserVo;
import com.saltlux.web.mvc.WebUtil;

public class BoardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String action = request.getParameter("a");
		if("writeform".equals(action)) {
			HttpSession session = request.getSession();	
			UserVo authUser = (UserVo)session.getAttribute("authUser");	
			session.setAttribute("authUser", authUser);//로그인정보
			
			WebUtil.forward("/WEB-INF/views/board/writeform.jsp", request, response);
			
		}else if("write".equals(action)){
			//로그인확인 - Access Control(접근 제어)
			HttpSession session = request.getSession();	
			UserVo authUser = (UserVo)session.getAttribute("authUser");	
			
			String title = request.getParameter("title");
			String contents = request.getParameter("contents");

			BoardVo vo = new BoardVo();

			vo.setTitle(title);
			vo.setWriter(authUser.getName());
			vo.setEmail(authUser.getEmail());
			vo.setPassword(authUser.getPassword());
			vo.setContents(contents);

			System.out.println(vo);
			//new BoardDao().insert(vo);

			WebUtil.redirect(request.getContextPath() + "/board", request, response);
			
		}else if("look".equals(action)){
			//로그인확인 - Access Control(접근 제어)
			HttpSession session = request.getSession();	
			UserVo authUser = (UserVo)session.getAttribute("authUser");	
			
			String no = request.getParameter("no");
			BoardVo vo = new BoardDao().findByNo(no);
			
			//hit늘리기
			new BoardDao().updateHit(no);
			System.out.println("vo의 이메일 : "+vo.getEmail()+",유저의 이메일 : "+authUser.getEmail());
			
			session.setAttribute("authUser", authUser);//로그인정보
			request.setAttribute("vo", vo);
			request.setAttribute("no", no);
			
			WebUtil.forward("WEB-INF/views/board/look.jsp", request, response);
		}else if("updateform".equals(action)){
			
			String no = request.getParameter("no");
			BoardVo vo = new BoardDao().findByNo(no);
			
			request.setAttribute("vo", vo);
			request.setAttribute("no", no);
			
			WebUtil.forward("WEB-INF/views/board/updateform.jsp", request, response);
		}else if("update".equals(action)){//글수정
			
			String no = request.getParameter("no");
			String title = request.getParameter("title");
			String contents = request.getParameter("contents");
			
			new BoardDao().update(no,title,contents);
			
			
			WebUtil.redirect(request.getContextPath()+"/board", request, response);
			
		}else {//index들어가기
			
			//로그인확인 - Access Control(접근 제어)
			HttpSession session = request.getSession();	
			UserVo authUser = (UserVo)session.getAttribute("authUser");	
			
			if(authUser==null) {//비로그인상태
				request.setAttribute("authResult", "fail");				
			}
			
			List<BoardVo> list = new BoardDao().findAll(); 
			request.setAttribute("list", list);
			session.setAttribute("authUser", authUser);//로그인정보
	
			WebUtil.forward("/WEB-INF/views/board/index.jsp", request, response);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
