<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Start값과 end값 입력</h2>
	<form action="${pageContext.request.contextPath }/sumCalculation" method="get">
		start : <input type="text" name="start"><br>
		end : <input type="text" name="end"><br><br>
		
		<input type="submit" value="전송"/>
	</form>
</body>
</html>