<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>主页</title>
</head>
<body> 

<table>
	<tr><td><input name="resume" type="button" value="我的简历"
	onclick="javascript:location.href='${pageContext.request.contextPath }/User/resume/${userId}'"/></td></tr>
	<tr><td><input name="pwd" type="button" value="我的课题"
	onclick="javascript:location.href='${pageContext.request.contextPath }/User/activity/${userId}'"/></td></tr>

	<tr><td><input name="pwd" type="button" value="我的邀请"
	onclick="javascript:location.href='${pageContext.request.contextPath }/Login/reg'"/></td></tr>
	<tr><td><input name="pwd" type="button" value="加入课题"
	onclick="javascript:location.href='${pageContext.request.contextPath }/Login/reg'"/></td></tr>
	
</table>
	

</body>

</html>