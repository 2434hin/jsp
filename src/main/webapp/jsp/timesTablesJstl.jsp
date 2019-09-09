<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--스크립틀릿, 표현식 --> jstl, el --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<title>jsp 구구단</title>
<style>
	table{
		border-collapse:collapse;
		width:800px;
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
		<c:forEach begin="1" end="9" var="i" varStatus="loop">
			<tr>
			<c:forEach begin="2" end="9" var="j" varStatus="loop">
				<td>${j } * ${1 } = ${i*j }</td>
			</c:forEach>
			</tr>
		</c:forEach>
	</table>
</body>
</html>