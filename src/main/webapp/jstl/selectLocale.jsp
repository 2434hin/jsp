<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script src="${cp }/js/jquery-3.4.1.min.js"></script>
<script src="${pageContext.request.contextPath }/bootstrap/js/bootstrap.min.js"></script>

<script>
	$(document).ready(function () {

// 		// 혜인
// 		$('#locale option').each(function(){

// 		  if($(this).val()=="${locale}"){
// 		    $(this).prop("selected", true);
// 		  }

// 		});

		// 선생님
		//$("select[name=locale]").val('${locale}');

		// select option의 값이 변경되었을 때
		$('#locale').on('change', function () {
			$("#frm").submit();
		})
	})

</script>
</head>
<body>
	<form id="frm" action="${cp }/selectLocale" method="get">
		<select id="locale" name="locale">
			<option value="ko" <c:if test="${locale == 'ko'}">selected</c:if>>한국어</option>
			<option value="en" <c:if test="${locale == 'en'}">selected</c:if>>english</option>
			<option value="zh" <c:if test="${locale == 'zh'}">selected</c:if>>中国话</option>
		</select>
	</form>

	<fmt:setLocale value="${locale }"/>
	<fmt:setBundle basename="kr.or.ddit.msg.message" var="msg"/>
	<fmt:message key="GREETING" bundle="${msg }"/><br>

</body>
</html>