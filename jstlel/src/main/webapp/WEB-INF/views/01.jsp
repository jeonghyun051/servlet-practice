<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% pageContext.setAttribute("newline", "\n");%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>값 받아보기</h1>
	${iVal } <br/>
	${lVal } <br/>
	${bVal } <br/>
	${sVal } <br/>
	${fVal } <br/>
	<p style="border:1px solid #00f; padding:10px">
		${fn:replace(sVal,newline,"<br/>") } <br/>
	</p>
		
		
	<h1>객체 출력</h1>
	${vo.no } <br/>
	${vo.name } <br/>
	
	<h1>산술 연산</h1>
	${3*10+20 } <br/>
	${iVal+10} <br/>
	
	<h1>관계 연산</h1>
	${iVal > 10 } <br/>
	${iVal < 5 } <br/>
	${obj == null } <br/>
	${obj != null }<br/>
	
	${empty obj }<br/>
	${not empty obj }<br/>
	
	<h1>논리 연산</h1>
	
	<h1>map의 값</h1>
	${m.ival }<br/>
	${m.lval }<br/>
	${m.fval }<br/>
	${m.bval }<br/>
	
	<h1>요청 파라미터의 값</h1>
	--${param.a }-- <br/>
	--${param.email }--	<br/>
	
	
	
	
</body>
</html>