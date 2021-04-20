package com.saltlux.mysite.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;

import com.saltlux.mysite.dao.JDBCTest;
import com.saltlux.web.mvc.WebUtil;


public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		JSONObject name= new JDBCTest().getJson();		
		request.setAttribute("name", name);
		
		WebUtil.forward("/WEB-INF/views/test/test-employee.jsp", request, response);
	}

}
