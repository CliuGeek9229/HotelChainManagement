<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
  <head>
    <meta charset="utf-8" />
    <title>登录</title>
    
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <meta name="apple-mobile-web-app-capable" content="yes" />    
    <!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
	
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" /></head>

<body>
	
<div class="navbar navbar-fixed-top">
	
	<div class="navbar-inner">
		
		<div class="container" align="center">

			<a class="brand" href="./">欢迎使用</a>

		</div> <!-- /container -->
		
	</div> <!-- /navbar-inner -->
	
</div> <!-- /navbar -->


<div id="login-container">
	
	
	<div id="login-header">
		
		<h3 align="center">登录</h3>
		
	</div> <!-- /login-header -->
	
	<div id="login-content" class="clearfix" align="center">
	
	       <form action="login!login.action">
				<fieldset>
					<div>
						<label class="control-label" for="username">用户名</label>
							<input type="text" name="user.username" class="" id="username" />
					</div>
					<br>
					<div>
						<label class="control-label" for="password">密&nbsp码</label>
							<input type="password" name="user.password" class="" id="password" />
					</div>
				</fieldset>
				
				<div class="pull-right">
					<button type="submit" class="btn btn-warning btn-large">登录</button>
				</div>
			</form>
			
		</div> <!-- /login-content -->
		
		
		<div id="login-extra" align="center">
			
			<p>没有账号? <a href="Register.jsp">注册</a>&nbsp&nbsp&nbsp&nbsp忘记密码请拨打电话：<font color="green">15184727063</font></p>
			
		</div> <!-- /login-extra -->
	
</div> <!-- /login-wrapper -->

    

<!-- Le javascript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="./js/jquery-1.7.2.min.js"></script>


<script src="./js/bootstrap.js"></script>

  </body>
</html>
