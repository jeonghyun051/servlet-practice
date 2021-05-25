<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	String param = request.getParameter("no");
	int no = Integer.parseInt(param);
	
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>방명록</title>
</head>
<body>
	<form method="post" action="<%=request.getContextPath() %>/delete.jsp">
	<input type='hidden' name="no" value="<%=no %>">
	<table>
		<tr>
			<td>비밀번호</td>
			<td><input type="password" name="password"></td>
			<td><input type="submit" value="확인"></td>
			
		</tr>
	</table>
	<br/>
	<a href="<%=request.getContextPath() %>">메인으로 돌아가기</a>
	</form>
	<button onclick="fb()">asd</button>
	
	<script>
		function fb(){
			alert('12');
		}
	</script>
</body>
</html>