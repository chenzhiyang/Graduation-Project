<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>我的简历</title>
</head>
<body> 
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

<tr>
	<td>${resume.name }</td>
	<td>${resume.phone }</td>
	<td>${resume.department }</td>
	<td>${resume.studentclass }</td>
	<td>${resume.sex }</td>
	<td>${resume.email }</td>
	<td>${resume.skill }</td>
	<td>${resume.experience }</td>
	<td><a href="${pageContext.request.contextPath }/User/editResume/${resume.userId}">修改</a></td>

</tr>


</table>

</body>

</html>