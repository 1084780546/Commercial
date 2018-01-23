<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>购票平台</title>
<link rel="stylesheet" href="<%=request.getContextPath() %>/webjars/bootstrap/3.3.7-1/css/bootstrap.min.css"/>
<link rel="stylesheet" href="<%=request.getContextPath() %>/webjars/bootstrap-datetimepicker/2.4.2/css/bootstrap-datetimepicker.min.css"/>
</head>
<body class="container">
	<!-- 注册窗口 -->
     <div id="register" class="modal fade" tabindex="-1" >
         <div class="modal-dialog" >
             <div class="modal-content">
                 <div class="modal-body">
                     <button class="close" data-dismiss="modal">
                         <span>&times;</span>
                     </button>
                 </div>
                 <div class="modal-title">
                     <h1 class="text-center">注册</h1>
                 </div>
                 <div class="modal-body">
                     <form class="form-group" action="<%=request.getContextPath() %>/sign" method="get">
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
                             <div class="text-right">
                                 <button class="btn btn-primary" type="submit">提交</button>
                                 <button class="btn btn-danger" data-dismiss="modal">取消</button>
                             </div>
                             <a href="" data-toggle="modal" data-dismiss="modal" data-target="#login">已有账号？点我登录</a>
                     </form>
                 </div>
             </div>
         </div>
     </div>
     <!-- 登录窗口 -->
     <div id="login" class="modal fade" >
         <div class="modal-dialog">
             <div class="modal-content">
                 <div class="modal-body">
                     <button class="close" data-dismiss="modal">
                         <span>&times;</span>
                     </button>
                 </div>
                 <div class="modal-title">
                     <h1 class="text-center">登录</h1>
                 </div>
                 <div class="modal-body">
                     <form class="form-group" action="<%=request.getContextPath() %>/login">
                             <div class="form-group">
                                 <label for="">账户</label>
                                 <input class="form-control" type="text" name="uid" placeholder="">
                             </div>
                             <div class="form-group">
                                 <label for="">密码</label>
                                 <input class="form-control" type="password" name="password" placeholder="">
                             </div>
                             <div class="text-right">
                                 <button class="btn btn-primary" type="submit">登录</button>
                                 <button class="btn btn-danger" data-dismiss="modal">取消</button>
                             </div>
                             <a href="" data-toggle="modal" data-dismiss="modal" data-target="#register">还没有账号？点我注册</a>
                     </form>
                 </div>
             </div>
        </div>
     </div>
	<nav class="navbar navbar-inverse" role="navigation">
	    <div class="navbar-header">
	        <button type="button" class="navbar-toggle" data-toggle="collapse"
	                data-target="#example-navbar-collapse">
	            <span class="sr-only">切换导航</span>
	            <span class="icon-bar"></span>
	            <span class="icon-bar"></span>
	            <span class="icon-bar"></span>
	        </button>
	        <a class="navbar-brand" href="#">电子商务平台</a>
	    </div>
	    <div class="collapse navbar-collapse" id="example-navbar-collapse">
	        <ul class="nav navbar-nav navbar-right">
	            <c:if test="${sessionScope.user==null }">
	            	<li><a href="#" data-toggle="modal"  data-target="#register" ><span class="glyphicon glyphicon-user"></span> 注册</a></li> 
           			<li><a href="#" data-toggle="modal"  data-target="#login" ><span class="glyphicon glyphicon-log-in"></span> 登录</a></li> 
	            </c:if>
	            <c:if test="${sessionScope.user!=null }">
	            	<li><a href="#"><span class="glyphicon glyphicon-user"></span> ${sessionScope.user.username },欢迎您!</a></li> 
           			<li><a href="<%=request.getContextPath() %>/loginOff"><span class="glyphicon glyphicon-off"></span> 退出</a></li> 
	            </c:if>
	        </ul>
	    </div>
	</nav>
	<div class="row">
		<div class="col-md-2">
			<ul class="nav nav-pills nav-stacked" style="width: 150px">
				<li><a href="<%=request.getContextPath() %>/main">首页</a></li>   
				<li class="active"><a href="<%=request.getContextPath() %>/getAllTicket">实时订票</a></li>
				<li><a href="<%=request.getContextPath() %>/myOrder">我的订单 </a></li> 
				<li><a href="<%=request.getContextPath() %>/myInfo">会员信息</a></li> 
				<li><a href="<%=request.getContextPath() %>/payMoney">会员充值</a></li> 
			</ul>
		</div>
		<div class="col-md-10">
			<div class="table-responsive">
			  	<table class="table table-hover">
			 		<thead>
			 			<tr>
			 				<td>序号</td>
			 				<td>票名</td>
			 				<td>单价(元)</td>
			 				<td>购票数</td>
			 				<td>总金额(元)</td>
			 				<td>操作</td>
			 			</tr>
			 		</thead>
			 		<tbody>
			 			<c:forEach items="${tickets }" var="t">
			 			<tr>
			 				<td>${t.tid }</td>
			 				<td>${t.tname }</td>
			 				<td>${t.price }</td>
			 				<td>
								<div class="input-group input-group-sm" style="width: 100px;margin: 0 auto;">
							      <span class="input-group-btn">
							        <button class="btn btn-default" id="minus${t.tid }" name="minus" type="button">-</button>
							      </span>
							      <input type="text" class="form-control" id="num${t.tid }" value="${t.tnum }">
							      <span class="input-group-btn">
							        <button class="btn btn-default" id="add${t.tid }" name="add" type="button">+</button>
							      </span>
							    </div><!-- /input-group -->
							</td>
			 				<td>${t.tnum*t.price }</td>
			 				<td>
			 					<button type="button" class="btn btn-primary btn-sm" name="delete">删除</button>
			 				</td>
			 			</tr>
			 			</c:forEach>
			 		</tbody>
			 		<tfoot>
			 			<tr>
			 				<td>总计</td>
			 				<td></td>
			 				<td></td>
			 				<td>${totalnum }</td>
			 				<td>${totalprice }</td>
			 				<td></td>
			 			</tr>
			 		</tfoot>
				</table>
			</div>
			<div class="pull-right" style="margin-right: 40px">
                <button class="btn btn-default" onclick="location.href='<%=request.getContextPath() %>/getAllTicket'">继续购票</button>
				<button class="btn btn-primary" type="button" name="buyClose">结账</button>
			</div>
		</div>
	</div>
	<div id="paySuccess" class="modal fade bs-example-modal-sm" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel">
	  <div class="modal-dialog modal-sm" role="document">
	  	<div class="modal-content">
		  	<div class="modal-header">
		        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
		        <h4 class="modal-title">付款成功</h4>
		    </div>
		    <div class="modal-footer">
		        <button type="button" class="btn btn-default" name="close" >关闭</button>
		        <button type="button" class="btn btn-primary" name="lookOrder">查看订单</button>
		    </div>
		</div>
	  </div>
	</div>
	<div id="payFiled" class="modal fade bs-example-modal-sm" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel">
	  <div class="modal-dialog modal-sm" role="document">
	  	<div class="modal-content">
		  	<div class="modal-header">
		        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
		        <h4 class="modal-title">支付失败,您的余额不足!</h4>
		    </div>
		    <div class="modal-footer">
		        <button type="button" class="btn btn-default" name="close" >关闭</button>
		        <button type="button" class="btn btn-primary" name="payMoney">去充值</button>
		    </div>
		</div>
	  </div>
	</div>
<script type="text/javascript" src="<%=request.getContextPath() %>/webjars/jquery/3.2.1/dist/jquery.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/webjars/bootstrap/3.3.7-1/js/bootstrap.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/webjars/bootstrap-datetimepicker/2.4.2/js/bootstrap-datetimepicker.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/webjars/bootstrap-datetimepicker/2.4.2/js/locales/bootstrap-datetimepicker.zh-CN.js"></script>
<script type="text/javascript">
	$(function() {
		$("td,th").addClass("text-center");
		$("[name='minus']").click(function() {
			var tid = $(this).parents("tr").find("td").eq(0).html();
			var num = parseInt($("#num"+tid).val())-1;
			if(num>=0){
				window.location.href="<%=request.getContextPath() %>/updateTnum/"+tid+"/"+num;
			}
		});
		$("[name='add']").click(function() {
			var tid = $(this).parents("tr").find("td").eq(0).html();
			var num = parseInt($("#num"+tid).val())+1;
			window.location.href="<%=request.getContextPath() %>/updateTnum/"+tid+"/"+num;
		});
		$("[name='delete']").click(function() {
			var tid = $(this).parents("tr").find("td").eq(0).html();
			window.location.href="<%=request.getContextPath() %>/deleteCar/"+tid;
		});
		$("[name='close']").click(function() {
			window.location.href="<%=request.getContextPath() %>/myCar";
		});
		$("[name='lookOrder']").click(function() {
			window.location.href="<%=request.getContextPath() %>/myOrder";
		});
		$("[name='payMoney']").click(function() {
			window.location.href="<%=request.getContextPath() %>/payMoney";
		});
		$("[name='buyClose']").click(function() {
			$.ajax({
				type:'post',
				url:'<%=request.getContextPath() %>/buyClose',
				dataType:'text',
				success:function(data){
					if(data=="1"){
						$("#paySuccess").modal();
					}else if(data=="0"){
						$("#payFiled").modal();
					}else{
						alert("服务器出错,请稍后再试!");
					}
				}
			});
		});
	});
</script>
</body>
</html>