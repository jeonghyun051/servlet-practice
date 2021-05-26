package com.douzone.emaillist.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.douzone.emaillist.dao.EmaillistDao;
import com.douzone.emaillist.vo.EmaillistVo;

public class EmaillistController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");	// post 방식으로 전달받는 파라미터 값의 encoding 처리
		
		String action = request.getParameter("a");
	
		if("form".equals(action)) {
			System.out.println("form!");
		} else if("add".equals(action)) {
			System.out.println("add!");
		} else {
			/* default request(action) */
			
			// 1. 요청처리
			List<EmaillistVo> list = new EmaillistDao().findAll();
			
			// 2. request범위에 데이터(객체) 저장
			request.setAttribute("list", list);
			
			// 3. view로 포워딩
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/index.jsp");
			rd.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}
}