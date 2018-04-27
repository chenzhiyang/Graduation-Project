<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>邀请</title>
</head>
<body> 
<form action="${pageContext.request.contextPath }/User/inviteSearch" method="post">
<table width="100%" border=1>
<tr>
<td><input  type="hidden" name="ActivityId" value="${ActivityId}"></td>
<td>关键技能：<input type="text" name="skill"></td>
<td>学院：<input type="text" name="department"></td>
<td><input type="submit" value="查询"/></td>
</tr>
</table>
匹配的用户：
<table width="100%" border=1>
<tr>
	<td>姓名</td>
	<td>手机号</td>
	<td>学院</td>
	<td>班级</td>
	<td>性别</td>
	<td>邮箱</td>
	<td>技能</td>
	<td>经历</td>
</tr>

<c:forEach items="${resumeList}" var="resume" varStatus="status">
<tr>
	<td>${resume.name }</td>
	<td>${resume.phone }</td>
	<td>${resume.department }</td>
	<td>${resume.studentclass }</td>
	<td>${resume.sex }</td>
	<td>${resume.email }</td>
	<td>${resume.skill }</td>
	<td>${resume.experience }</td>
	<td><a href="${pageContext.request.contextPath }/User/invite/${activity.id}">邀请</a></td>
</tr>
</c:forEach>
</table>
</form>
</body>

</html>