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
<form action="${pageContext.request.contextPath }/User/updateActivity" method="post">
<table width="100%" border=1>
<tr><td><input type="hidden" name="id" value="${activity.id}"></td></tr>
<tr><td><input type="hidden" name="status" value="${activity.status}"></td></tr>
<tr><td>课题名称：<input type="text" name="activityname" value="${activity.activityname}"></td></tr>
<tr><td>课题信息：<input type="text" name="summary" value="${activity.summary}"></td></tr>
<tr><td>课题需求：<input type="text" name="request" value="${activity.request}"></td></tr>


<tr><td><input name="" value="修改" type="submit"/></td></tr>


</table>
</form>
</body>

</html>