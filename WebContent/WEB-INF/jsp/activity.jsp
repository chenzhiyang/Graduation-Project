<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>我的课题</title>
</head>
<body> 
<a href="${pageContext.request.contextPath }/User/addActivity">添加</a>
我发布的课题
<table width="100%" border=1>
<tr>
	<td>课题名称</td>
	<td>课题信息</td>
	<td>需求信息</td>
	<td>审核状态</td><!-- 0审核未通过，1通过  -->
	<td>操作</td>

</tr>

<c:forEach items="${activity1}" var="activity" varStatus="status">
<tr>
	<td>${activity.activityname }</td>
	<td>${activity.summary }</td>
	<td>${activity.request }</td>
	<td>${activity.status }</td>
	
	<td><a href="${pageContext.request.contextPath }/User/editActivity/${activity.id}">修改</a></td>
	<td><a href="${pageContext.request.contextPath }/User/deleteActivity/${activity.id}">删除</a></td>
	<td><a href="${pageContext.request.contextPath }/User/findActivityJoiner/${activity.id}">查看课题成员</a></td>
	<td><a href="${pageContext.request.contextPath }/User/invite/${activity.id}">邀请</a></td>
	<td><a href="${pageContext.request.contextPath }/User/inviteAlready/${activity.id}">已邀请</a></td>
</tr>
</c:forEach>
</table>
我参与的课题
<table width="100%" border=1>
<tr>
	<td>课题名称</td>
	<td>课题信息</td>
	<td>需求信息</td>
	<td>审核状态</td>   <!-- 0审核未通过，1通过  -->
	<td>操作</td>

</tr>

<c:forEach items="${activity2}" var="activity" varStatus="status">
<tr>
	<td>${activity.activityname }</td>
	<td>${activity.summary }</td>
	<td>${activity.request }</td>
	<td>${activity.status }</td>
	
	<td><a href="${pageContext.request.contextPath }/User/exitActivity/${activity.id}">退出该课题</a></td>
	<td><a href="${pageContext.request.contextPath }/User/findActivityJoiner/${activity.id}">查看课题成员</a></td>

</tr>
</c:forEach>
</table>
</body>

</html>