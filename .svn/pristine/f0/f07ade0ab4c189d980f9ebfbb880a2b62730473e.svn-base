<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册系统</title>
<link rel="stylesheet" href="<%=request.getContextPath() %>/webjars/bootstrap/3.3.7-1/css/bootstrap.min.css"/>
</head>
<body class="container">
<div class="col-md-6 col-md-offset-3" style="margin-top: 100px">
	<form class="form-group" action="<%=request.getContextPath() %>/sign" method="post">
         <div class="form-group">
             <label for="">用户名</label>
             <input class="form-control" type="text" name="username" placeholder="6-15位字母或数字">
         </div>
         <div class="form-group">
             <label for="">密码</label>
             <input class="form-control" type="password" name="password" placeholder="至少6位字母或数字">
         </div>
         <hr>
         <div class="form-group">
             <label for="">真实姓名</label>
             <input class="form-control" type="text" name="name" placeholder="必须是真实姓名">
         </div>
         <div class="form-group">
             <label for="">性别</label><br>
             <label class="radio-inline">
		<input type="radio" name="gender" value="男" checked="checked"> 男
		 </label>
		 <label class="radio-inline">
		 	<input type="radio" name="gender" value="女"> 女
		 </label>
         </div>
         <div class="form-group">
             <label for="">身份证号</label>
             <input class="form-control" type="text" name="idCard" placeholder="请输入18位身份证号">
         </div>
         <div class="form-group">
             <label for="">地址</label>
             <input class="form-control" type="text" name="address" placeholder="请输入您的住址">
         </div>
         <div class="form-group">
             <label for="">电话</label>
             <input class="form-control" type="text" name="teIno" placeholder="请输入您的电话号码">
         </div>
		<div class="form-group">
			<input class="form-control btn btn-primary" id="submit" value="注&nbsp;&nbsp;册" type="submit">
		</div>
		<div class="form-group">
			<input value="重置" id="reset" class="form-control btn btn-danger" type="reset">
		</div>
	</form>
	<a href="<%=request.getContextPath() %>/toLogin" >已有账号？点我登录</a>
</div>
<script type="text/javascript" src="<%=request.getContextPath() %>/webjars/jquery/3.2.1/dist/jquery.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/webjars/bootstrap/3.3.7-1/js/bootstrap.min.js"></script>
</body>
</html>