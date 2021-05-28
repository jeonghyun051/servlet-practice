<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	
	
</body>
</html>