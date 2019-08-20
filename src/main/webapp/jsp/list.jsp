<%@page import="kr.or.ddit.user.service.UserService"%>
<%@page import="kr.or.ddit.user.service.IUserService"%>
<%@page import="kr.or.ddit.user.model.User"%>
<%@page import="java.util.List"%>
<%@page import="kr.or.ddit.user.repository.UserDao"%>
<%@page import="kr.or.ddit.user.repository.IUserDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!public IUserService service = new UserService();%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table{
		border-collapse:collapse;
		width:300px;
		height:350px;
		text-align : center;
	}
</style>
</head>
<body>
	<%-- 1. userdao 선언
		 2. getUserList() 호출
		 3. 호출결과(List<UserVo>)를 for loop를 통해 tr태그를 반복 생성--%>
	<%
		List<User> userList = service.getUserList();
	%>
	<table border=1>
		<tr>
			<th>이름</th>
		</tr>
<%-- 		<%for(int i = 0; i < userList.size(); i++){ %> --%>
<!-- 			<tr> -->
<%-- 				<td><%=userList.get(i).getUserNm() %></td> --%>
<!-- 			</tr> -->
<%-- 		<%} %> --%>

		<%
			for(User userVo : userList){
		%>
			<tr>
				<td><%=userVo.getUserNm() %></td>
			</tr>
		<%} %>
	</table>
</body>
</html>