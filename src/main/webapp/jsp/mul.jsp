<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	 <%
		 int number = Integer.parseInt(request.getParameter("number"));
		 int number2 = Integer.parseInt(request.getParameter("number2"));
	 %>
	 
	 <h2>두개의 숫자 파라미터의 곱 구하기</h2>
	 parameter number : <%=number %> <br>
	 parameter number2 : <%=number2 %> <br><br>
	 result : <%=number*number2 %> <br>

</body>
</html>