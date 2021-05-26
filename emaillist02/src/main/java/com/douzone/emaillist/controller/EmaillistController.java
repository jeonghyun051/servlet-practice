package com.douzone.emaillist.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.douzone.emaillist.dao.EmaillistDao2;
import com.douzone.emaillist.vo.EmaillistVo2;

public class EmaillistController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8"); // post 방식으로 전달받는 파라미터 값의 encoding 처리

		String action = request.getParameter("a");

		if ("form".equals(action)) {
			// 3. view로 포워딩
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/form.jsp");
			rd.forward(request, response);
		} else if ("add".equals(action)) {
			String firstName = request.getParameter("fn");
			String lastName = request.getParameter("ln");
			String email = request.getParameter("email");
			
			EmaillistVo2 vo = new EmaillistVo2();
			vo.setFirstName(firstName);
			vo.setLastName(lastName);
			vo.setEmail(email);
						
			new EmaillistDao2().insert(vo);
			
			// 2. redirect 응답
			response.sendRedirect(request.getContextPath() + "/el");
			
			
		} else {
			/* default request(action) */

			// 1. 요청처리
			List<EmaillistVo2> list = new EmaillistDao2().findAll();

			// 2. request범위에 데이터(객체) 저장
			request.setAttribute("list", list);

			// 3. view로 포워딩
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/index.jsp");
			rd.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}
}