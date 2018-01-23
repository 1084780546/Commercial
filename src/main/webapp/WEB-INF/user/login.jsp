<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录系统</title>
<link rel="stylesheet" href="<%=request.getContextPath() %>/webjars/bootstrap/3.3.7-1/css/bootstrap.min.css"/>
</head>
<body class="container">
<div class="col-md-6 col-md-offset-3" style="margin-top: 100px">
	<form action="<%=request.getContextPath() %>/login" method="post">
		<label for="uid">账户</label>
		<div class="input-group">
			<span class="input-group-addon"><span class="glyphicon glyphicon-user"></span></span>
			<input name="uid" class="form-control" placeholder="请输入账户" maxlength="20" type="text">
		</div>
		<br>
		<label for="password">密码</label>
		<div class="input-group">
			<span class="input-group-addon"><span class="glyphicon glyphicon-lock"></span></span>
			<input name="password" class="form-control" placeholder="请输入密码" maxlength="20" type="password">
		</div>
		<br>
			<c:if test="${error!=null }">
				<div class="alert alert-warning alert-dismissible text-center" role="alert">
				  <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
				  <strong>对不起!</strong> ${error }
				</div>
			</c:if>
		<div class="form-group">
			<input class="form-control btn btn-primary" id="submit" value="登&nbsp;&nbsp;录" type="submit">
		</div>
		<div class="form-group">
			<input value="重置" id="reset" class="form-control btn btn-danger" type="reset">
		</div>
	</form>
	<a href="<%=request.getContextPath() %>/toSign" >还没有账号？点我注册</a>
</div>
<script type="text/javascript" src="<%=request.getContextPath() %>/webjars/jquery/3.2.1/dist/jquery.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/webjars/bootstrap/3.3.7-1/js/bootstrap.min.js"></script>
</body>
</html>