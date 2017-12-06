<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
  <head>
    <meta charset="utf-8">
    <title>连锁酒店管理系统</title>
    <meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <link rel="stylesheet" type="text/css" href="lib/bootstrap/css/bootstrap.css">
    
    <link rel="stylesheet" type="text/css" href="stylesheets/theme.css">
    <link rel="stylesheet" href="lib/font-awesome/css/font-awesome.css">

    <script src="lib/jquery-1.7.2.min.js" type="text/javascript"></script>

    <!-- Demo page code -->

    <style type="text/css">
        #line-chart {
            height:300px;
            width:800px;
            margin: 0px auto;
            margin-top: 1em;
        }
        .brand { font-family: georgia, serif; }
        .brand .first {
            color: #ccc;
            font-style: italic;
        }
        .brand .second {
            color: #fff;
            font-weight: bold;
        }
    </style>

    <!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

    <!-- Le fav and touch icons -->
    <link rel="shortcut icon" href="../assets/ico/favicon.ico">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="../assets/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="../assets/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="../assets/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="../assets/ico/apple-touch-icon-57-precomposed.png">
  </head>
  
  <script language="JavaScript">
function mycheck(){
	   if(isNull(form1.type.value)){  
	   alert("请输入房间类型！"); 
	   return false;
	   }
	   if(isNull(form1.price.value)){
	   alert("请输入房间价格！");
	   return false;
	   }
	   if(isNull(form1.status.value)){
	   alert("请输入房间状态！");
	   return false;
	   }
	   if(isNull(form1.description.value)){
		   alert("请输入房间状态！");
		   return false;
	}
	}

	function isNull(str){
	if ( str == "" ) return true;
	var regu = "^[ ]+$";
	var re = new RegExp(regu);
	return re.test(str);
	}
	   
	   
	</script>

  <!--[if lt IE 7 ]> <body class="ie ie6"> <![endif]-->
  <!--[if IE 7 ]> <body class="ie ie7 "> <![endif]-->
  <!--[if IE 8 ]> <body class="ie ie8 "> <![endif]-->
  <!--[if IE 9 ]> <body class="ie ie9 "> <![endif]-->
  <!--[if (gt IE 9)|!(IE)]><!--> 
  <body class=""> 
  <!--<![endif]-->
    
    <div class="navbar">
        <div class="navbar-inner">
                <ul class="nav pull-right">
                    
                    <li id="fat-menu" class="dropdown">
                        <a href="#" role="button" class="dropdown-toggle" data-toggle="dropdown">
                            <i class="icon-user"></i> ${uname }
                            <i class="icon-caret-down"></i>
                        </a>

                        <ul class="dropdown-menu">
                            <li><a tabindex="-1" href="#">我的账户</a></li>
                            <li class="divider"></li>
                            <li><a tabindex="-1" class="visible-phone" href="#">Settings</a></li>
                            <li class="divider visible-phone"></li>
                            <li><a tabindex="-1" href="sign-in.html">退出系统</a></li>
                        </ul>
                    </li>
                    
                </ul>
                <a class="brand" href="index.html"><span class="first">连锁酒店</span> <span class="second">管理系统</span></a>
        </div>
    </div>
    


    
    <div class="sidebar-nav">

        <a href="#accounts-menu" class="nav-header" data-toggle="collapse"><i class="icon-briefcase"></i>管理人员业务<i class="icon-chevron-up"></i></a>
        <ul id="accounts-menu" class="nav nav-list collapse">
            <li ><a href="sign-in.html">修改房间</a></li>
            <li ><a href="sign-up.html">发布公告</a></li>
            <li ><a href="reset-password.html">修改员工</a></li>
            <li ><a href="sign-up.html">统计营业</a></li>
            <li ><a href="reset-password.html">统计评价</a></li>
        </ul>


    </div>
    

    
    <div class="content">
        
        <div class="header">
            
            <h1 class="page-title">修改房间</h1>
        </div>
        
                <ul class="breadcrumb">
            <li><a href="index.html">管理人员业务</a> <span class="divider">/</span></li>
            <li class="active">修改员工</li>
        </ul>

        <div class="container-fluid">
            <div class="row-fluid">
  
  <div class="block">
            <p class="block-heading">修改员工信息</p>
            <div class="block-body">
                <form action="<c:url value="employee!UpdateEmployee.action"/>" method="post" name="form1" onsubmit="return mycheck()">
                <fieldset>
                	<div>
                	<label for="eid">员工序号</label>
                	<input id="eid" name="employee.id" type="text" value="${ employeeform.id }">
                	</div>
                	<div>
                    <label for="enum">员工工号</label>
                    <input type="text" class="" id="enum" name="employee.num" value="${ employeeform.num }">
                    </div>
                    <div>
                    <label for="ename">员工姓名</label>
                    <input type="text" class="" id="ename" name="employee.name" value="${ employeeform.name }">
                    </div>
                    <div>
                    <label for="egender">员工性别</label>
                    <input type="text" class="" id="egender" name="employee.gender" value="${ employeeform.gender }">
                    </div>
                    <div>
                    <label for="ephonenum">员工联系方式</label>
                    <input type="text" class="" id="ephonenum" name="employee.phonenum" value="${ employeeform.phonenum }"> 
                    </div>
                    <div>
                    <label for="ecard">员工身份证号</label>
                    <input type="text" class="" id="ecard" name="employee.cardnum" value="${ employeeform.cardnum }">
                    </div>
                    <div>
                    <label for="edepartment">员工所属部门</label>
                    <input type="text" class="" id="edepartment" name="employee.department" value="${ employeeform.department }">
                    </div>
                    <div>
                    <label for="elevel">员工等级</label>
                    <input type="text" class="" id="elevel" name="employee.level" value="${ employeeform.level }">
                    </div>
                    </fieldset>
                    <div>
                    <button type="submit" class="btn btn-warning btn-large" style="margin-right: 10px">修改</button>
                    <button type="button" class="btn btn-warning btn-large" onClick="javascript:history.back(-1);">放弃修改</button>
                    </div>
                    <div class="clearfix"></div>
                </form>
            </div>
        </div>                 
  
  </div>
</div>

<div class="modal small hide fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
        <h3 id="myModalLabel">Delete Confirmation</h3>
    </div>
    <div class="modal-body">
        <p class="error-text"><i class="icon-warning-sign modal-icon"></i>Are you sure you want to delete the user?</p>
    </div>
    <div class="modal-footer">
        <button class="btn" data-dismiss="modal" aria-hidden="true">Cancel</button>
        <button class="btn btn-danger" data-dismiss="modal">Delete</button>
    </div>
</div>


                    
                    <footer>
                        <hr>
                        <p class="pull-right">连锁酒店管理系统</p>              
                    </footer>
                    
            </div>
        </div>
    </div>
    


    <script src="lib/bootstrap/js/bootstrap.js"></script>
    <script type="text/javascript">
        $("[rel=tooltip]").tooltip();
        $(function() {
            $('.demo-cancel-click').click(function(){return false;});
        });
    </script>
    
  </body>
</html>


