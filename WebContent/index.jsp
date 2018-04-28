<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
</head>
<body> 

<div style="width:500px;margin:20% auto;border:1px solid #ccc;padding:10px;">
<form action="${pageContext.request.contextPath }/Login/login" method="post" class="form-horizontal">

    <div class="form-group">
        <label class="control-label col-md-3">用户名:</label>
        <div class="col-md-6">
            <input type="text" name="username" class = "form-control"/>
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-md-3">密码:</label>
        <div class="col-md-6">
            <input type="password" name="pwd" class = "form-control"/>
        </div>
    </div>
    
    <div class="form-group">
       <div class="col-md-offset-3 col-md-3">
           <input name="" value="登录" type="submit" class="btn-info form-control"/>
       </div>
       <div class="col-md-3">
           <input name="" value="注册" type="button" class="btn-primary form-control"
	onclick="javascript:location.href='${pageContext.request.contextPath }/Login/reg'"/>
       </div>
    </div>   
	
</form>
</div>
</body>

</html>

<script>
	

</script>