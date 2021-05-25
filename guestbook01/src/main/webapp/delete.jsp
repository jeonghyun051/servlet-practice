<%@page import="javax.tools.DocumentationTool.Location"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="com.douzone.guestbook01.vo.GuestBookVo"%>
<%@page import="com.douzone.guestbook01.dao.GuestBookDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String param = request.getParameter("no");
	int no = Integer.parseInt(param);
	
	String password = request.getParameter("password");
	
	GuestBookVo vo = new GuestBookDao().findById(no);
	String bookPassword = vo.getPassword();
	
	if(password.equals(bookPassword)){
		new GuestBookDao().deleteById(no);
		response.sendRedirect(request.getContextPath());
	} else {
		PrintWriter pw =response.getWriter();		
		pw.print("<script>alert('틀림');history.go(-1);</script>");
		
	}
	
%>