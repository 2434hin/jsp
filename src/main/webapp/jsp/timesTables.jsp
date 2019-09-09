<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<title>jsp 구구단</title>
<style>
	table{
		border-collapse:collapse;
		width:700px;
		height:350px;
		text-align : center;
	}
</style>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border=1>
		<%for(int i = 1; i < 10; i++){ %>
			<tr>
			<%for(int j = 2; j < 10; j++){ %>
				<td><%=j %> * <%=i %> = <%=j*i %></td>
			<%} %>
			</tr>
		<%} %>
	</table>
</body>
</html>