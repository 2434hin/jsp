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
		 
		 int sum = 0;
		 
		 for(int i = number; i <= number2; i++){
			 sum += i;
		 }
	 %>
	 
	 <h2>두개의 숫자 파라미터를 받아 두 숫자 사이의 모든 숫자의 합을 구하는 jsp</h2>
	 parameter number : <%=number %> <br>
	 parameter number2 : <%=number2 %> <br><br>
	 result : <%=sum %> <br>
	 
</body>
</html>