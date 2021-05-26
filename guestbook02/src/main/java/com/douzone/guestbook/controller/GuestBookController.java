package com.douzone.guestbook.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.douzone.guestbook.dao.GuestBookDao;
import com.douzone.guestbook.vo.GuestBookVo;

public class GuestBookController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public GuestBookController() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=UTF-8");

		String action = request.getParameter("a");
		
		if("deleteForm".equals(action)) {
			String param = request.getParameter("no");
			int no = Integer.parseInt(param);
			request.setAttribute("no", no);
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/deleteform.jsp");
			rd.forward(request, response);
		} 
		else if("delete".equals(action)) {
			
			String param = request.getParameter("no");
			int no = Integer.parseInt(param);
			
			String password = request.getParameter("password");
			
			GuestBookVo vo = new GuestBookDao().findById(no);
			String bookPassword = vo.getPassword();
			
			if(password.equals(bookPassword)){
				new GuestBookDao().deleteById(no);
				response.sendRedirect(request.getContextPath()+ "/gb");
			} else {
				PrintWriter pw =response.getWriter();		
				pw.print("<script>alert('틀림');history.go(-1);</script>");
			}
		} 
		else if("add".equals(action)) {
			
			String name = request.getParameter("name");
			String password = request.getParameter("password");
			String message = request.getParameter("message");
					
			GuestBookVo vo = new GuestBookVo();
			vo.setName(name);
			vo.setPassword(password);
			vo.setMessage(message);
			
			new GuestBookDao().insert(vo);
			
			response.sendRedirect(request.getContextPath() + "/gb");
		
		} else {
			/* default request(action) */
			
			// 1. 요청처리
			List<GuestBookVo> list = new GuestBookDao().findAll();
			int size = list.size();
			
			// 2. request범위에 데이터(객체) 저장
			request.setAttribute("list", list);
			request.setAttribute("size", size);
			
			// 3. view로 포워딩
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/index.jsp");
			rd.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
		
		
	}

}
