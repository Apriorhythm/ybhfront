<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
 <%@ include file="/commons/taglibs.jsp" %>
 <%@ include file="/commons/meta.jsp" %>
 <%@ include file="/commons/tooltip.jsp" %>
 
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	
	
	<link type="text/css" rel="stylesheet" href="${ctx}/css/jsp/header.css">
		
    <script src="${ctx}/js/tools/base64.js"></script>
    <script src="${ctx}/js/jsp/header.js"></script>


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

                <ul id="loginAndRegister" class="nav navbar-nav navbar-right">
                    <li><a href="#" data-toggle="modal" data-target="#login-modal">登录</a></li>
                    
                    <li><a  href="${ctx}/user/register">注册</a></li>
                    
                </ul>

            </nav>
        </div>
    </header>



	<!-- 模态框（Modal） -->
	<div class="modal fade" id="login-modal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display: none;">
		<div class="modal-dialog">
		      <div class="loginmodal-container">
		        <h1>登录</h1><br>
		        <form>
		          <input type="text" id="username" name="username" placeholder="用户名">
		          <input type="password" id="password" name="password" placeholder="密码">
		          <input type="button" id="loginSubmit" name="login" class="login loginmodal-submit" value="登录">
		        </form>
		          
		        <div class="login-help">
		          <a href="#">注册</a> - <a href="#">忘记密码</a>
		        </div>
		      </div>
		  </div>
	</div>







</body>
</html>