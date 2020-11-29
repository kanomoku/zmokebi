<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
	
		<c:forEach items="${list }" var="goods">
			<tr>
				<td>${goods_num}</td>
				<td>${goods_name}</td>
				<td>${goods_flavor }</td>
				<td>${goods_category}</td>
				<td>${goods_specification}</td>
				<td>${goods_expiration_date}</td>
				<td>${goods_plant}</td>
				<td>${goods_legal_person}</td>
				<td>${goods_mill_price}</td>
				<td>${goods_first_class_agent_price}</td>
				<td>${goods_second_class_agent_price}</td>
				<td>${goods_third_class_agent_price}</td>
				<td>${goods_store_purchase_price}</td>
				<td>${goods_sale_price}</td>
				<td>${goods_remark}</td>
			</tr>
		</c:forEach>
	</table>
</body>
<a href="/show">查询用户</a>
</html>