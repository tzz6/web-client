<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/commons/common.jsp"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>订单信息列表</title>
</head>
<body>
	<table>
		<tr>
			<td>
				<font size="6">
				<center>CXF订单信息列表</center>
				</font>
			</td>
		<tr>
		<tr>
			<td>订单id</td>
			<td>订单号</td>
			<td>订单类型</td>
		<tr>
		<c:forEach items="${ordersList }" var="orders">
			<tr>
				<td>${orders.id }</td>
				<td>${orders.orderNum }</td>
				<td>${orders.orderType.orderType }</td>
			<tr>
		</c:forEach>
	</table>
</body>
</html>