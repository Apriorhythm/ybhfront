<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link type="text/css" rel="stylesheet" href="${ctx}/css/jsp/header.css">

<title>云保护</title>
</head>
<body>


    <header id="header" class="navbar navbar-inverse">
        <div class="container-fluid">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#topNavBar">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>

                <div class="navbar-header">
                    <a class="navbar-brand" href="/">云保护</a>
                    <a href="/" class="navbar-login btn btn-link btn-icon"></a>
                </div>
            </div>

            <!-- item -->
            <nav class="collapse navbar-collapse" id="topNavBar">
                <ul class="nav navbar-nav">
                    <li><span><a class="navbar-brand" href="/style/info/host.asp">VPS</a></span></li>
                    <li><span><a class="navbar-brand" href="/style/info/sql.asp">数据库</a></span></li>
                    <li><span><a class="navbar-brand" href="/style/info/vps.asp">云服务器</a></span></li>
                    <li><span><a class="navbar-brand" href="/style/info/juyong.asp">主机租用</a></span></li>

                    <!-- 以下功能不使用
                    <li><span><a class="navbar-brand" href="/style/info/email.asp">企业邮局</span></a></li>
                    <li><span><a class="navbar-brand" href="/style/info/ad.asp">企业推广</span></a></li>
                    <li><span><a class="navbar-brand" href="/style/info/idc.asp">主机托管</span></a></li>
                    <li><span><a class="navbar-brand" href="/style/info/webmake.asp">网站建设</span></a></li>
                    <li><span><a class="navbar-brand" href="/style/info/self1.asp">渠道专区</span></a></li>
                    -->

                </ul>

                <ul class="nav navbar-nav navbar-right">
                    <li><a href="#" data-toggle="modal" data-target="#loginModal">登录</a></li>
                    
                    <li><a  href="/FrontPages/register.asp">注册</a></li>
                    
                </ul>

            </nav>
        </div>
    </header>



	<!-- 模态框（Modal） -->
	<div class="modal fade" id="loginModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	    <div class="modal-dialog">
	        <div class="modal-content">
	            <div class="modal-header">
	                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
	                    &times;
	                </button>
	                <h4 class="modal-title" id="myModalLabel">欢迎登录</h4>
	            </div>
	            <div class="modal-body">
	            
	            
	            
	            

	            
				    <form id="gof" name="gof" onSubmit="return checklogin(this)" action="/user/userlogin.asp" method="post">
				        <div>
				            <div class="input-group">
				                <span class="input-group-addon" id="basic-addon1">账号</span>
				                <input id="username" name="username" type="text" class="form-control" placeholder="账号" aria-describedby="basic-addon1">
				            </div>
				
				            <div class="input-group">
				                <span class="input-group-addon" id="basic-addon1">密码</span>
				                <input id="password" name="password" type="password" class="form-control" placeholder="密码" aria-describedby="basic-addon1">
				            </div>
				        </div>
			
				    </form>
				    
	            </div>
	            <div class="modal-footer">
	                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
	                <button type="button" class="btn btn-primary">登录</button>
	            </div>
	        </div><!-- /.modal-content -->
	    </div><!-- /.modal -->
    </div>


</body>
</html>