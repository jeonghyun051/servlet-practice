<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello world</h1>
	<h2>Hello world</h2>
	
	<table border="1" cellspacing="0" cellpadding="10">
		<tr>
			<th>글번호</th>
			<th>글제목</th>
			<th>작성자</th>
		</tr>
		
		<tr>
			<td>1</td>
			<td>안녕</td>
			<td>둘리</td>
		</tr>
		
		<tr>
			<td>2</td>
			<td>안녕</td>
			<td>마이콜</td>
		</tr>
	
		<tr>
			<td>3</td>
			<td>안녕</td>
			<td>또치</td>
		</tr>
	</table>
	<br/>
	
	<!-- 상대경로 -->
	<img src='images/dolly.png' style='width:100px; border:1px solid' />
	
	<!-- 절대경로 -->
	<img src='/helloweb/images/dolly.png' style='width:80px'/> 
	
	<br/>
	<a href="form.jsp">폼으로 가기</a>
	<br/>
	<a href="hello.jsp?name=peaq12&email=p@naver.com">Hello</a>
	<p>2112<br/>
		123asd
	</p>
	
</body>
</html>