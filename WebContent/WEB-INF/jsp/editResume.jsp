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
<form action="${pageContext.request.contextPath }/User/updateResume" method="post">
<table width="100%" border=1>
<tr><td><input type="hidden" name="id" value="${resume.id}"></td></tr>
<tr><td><input type="hidden" name="userId" value="${resume.userId}"></td></tr>
<tr><td>姓名：<input type="text" name="name" value="${resume.name}"></td></tr>
<tr><td>手机号：<input type="text" name="phone" value="${resume.phone}"></td></tr>
<tr><td>学院：<input type="text" name="department" value="${resume.department}"></td></tr>
<tr><td>班级：<input type="text" name="studentclass" value="${resume.studentclass}"></td></tr>
<tr><td>性别：<input type="text" name="sex" value="${resume.sex}"></td></tr>
<tr><td>邮箱：<input type="text" name="email" value="${resume.email}"></td></tr>
<tr><td>技能：<input type="text" name="skill" value="${resume.skill}"></td></tr>
<tr><td>经历：<input type="text" name="experience" value="${resume.experience}"></td></tr>
<tr><td><input name="" value="修改" type="submit"/></td></tr>


</table>
</form>
</body>

</html>