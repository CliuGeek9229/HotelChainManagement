<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.List"%>
<%@ page import="com.zlgl.ssh.beans.Employee" %>
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
            <li ><a href="ModifyRoom.jsp">修改房间</a></li>
            <li ><a href="PublishNotice.jsp">发布公告</a></li>
            <li ><a href="ModifyEmployee.jsp">修改员工</a></li>
            <li ><a href="StatisticsBusiness.jsp">统计营业</a></li>
            <li ><a href="StatisticsEvaluate.jsp">统计评价</a></li>
        </ul>

       

    </div>
    

    
    <div class="content">
        
        <div class="header">
            
            <h1 class="page-title">修改员工</h1>
        </div>
        
                <ul class="breadcrumb">
            <li><a href="AdminHome.jsp">管理人员业务</a> <span class="divider">/</span></li>
            <li class="active">修改员工</li>
        </ul>

        <div class="container-fluid">
            <div class="row-fluid">
   
   <div class="block">
            <p class="block-heading">查找房间</p>
            <div class="block-body">
                <form action="employee!SearchEmployee.action">
                    <label class="control-label" for="num">请输入员工工号</label>
                    <input type="text" class="" name="employee.num" id="num">
                    <button type="submit" class="btn btn-primary pull-right">查找</button>
                    <div class="clearfix"></div>
                </form>
            </div>
        </div>
                    
  <div class="btn-toolbar">
    <button class="btn btn-primary"><i class="icon-plus"></i>添加</button>
    
  <div class="btn-group">
  </div>
</div>
<div class="well">
    <table class="table">
      <thead>
        <tr>
          <th>工号</th>
          <th>姓名</th>
          <th>性别</th>
          <th>联系方式</th>
          <th>所属部门</th>
          <th>级别</th>
          <th>操作</th>
          <th style="width: 26px;"></th>
        </tr>
      </thead>
      <tbody>
      <%
      List<Employee> es = (List<Employee>)request.getSession().getAttribute("elist");
      		if(es.size()!=0){
      			for(int i=0;i<es.size();i++){
      				pageContext.setAttribute("emp", es.get(i));	
      %>
        <tr>
          <td>${ emp.num }</td>
          <td>${ emp.name }</td>
          <td>${ emp.gender }</td>
          <td>${ emp.phonenum }</td>
          <td>${ emp.department }</td>
          <td>${ emp.level }</td>
          <td>
              <a href="employee!JumpModifyEmployee.action?employee.num=${ emp.num }"><i class="icon-pencil"></i></a>
              <a href="Fail.jsp" role="button" data-toggle="modal"><i class="icon-remove"></i></a>
          </td>
        </tr>
        <%
      			}
      		}else{
      			
        %>
        <tr><td colspan="6">当前尚无可匹配的员工信息！</td></tr>
        <%
      		}
        %>
        <div class="clearfix"></div>
        
      </tbody>
    </table>
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


