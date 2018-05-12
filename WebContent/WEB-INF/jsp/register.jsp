<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
 
 
 <%@ include file="/commons/taglibs.jsp" %>
 <%@ include file="/commons/meta.jsp" %>
 <%@ include file="/commons/tooltip.jsp" %>
  
  
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>注册</title>
	

    <link type="text/css" rel="stylesheet" href="${ctx}/css/jsp/register.css">


	<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">

    <script type="text/javascript" src="${ctx}/js/jsp/register.js"></script>

</head>
<body>

<div class="container">
  <div class="row">
    <div id="mainDiv" class="Absolute-Center is-Responsive">

      <div class="col-sm-12 col-md-10 ">
 

		<form class="form-horizontal" role="form">
		    <div class="form-group">
		        <label for="firstname" class="col-sm-2 control-label">账号</label>
		        <div class="col-sm-10">
		            <input type="text" class="form-control" id="username">
		        </div>
		    </div>
		    
		    <div class="form-group">
		        <label for="lastname" class="col-sm-2 control-label">密码</label>
		        <div class="col-sm-10">
		            <input type="password" class="form-control" id="password">
		        </div>
		    </div>

            <div class="form-group">
                <label for="lastname" class="col-sm-2 control-label">密码</label>
                <div class="col-sm-10">
		            <select name="prv">
		                <option value="北京">北京</option>
		                <option selected="广东" value="广东">广东</option>
		                <option value="上海">上海</option>
		                <option value="广西">广西</option>
		                <option value="天津">天津</option>
		                <option value="重庆">重庆</option>
		                <option value="河北">河北</option>
		                <option value="河南">河南</option>
		                <option value="黑龙江">黑龙江</option>
		                <option value="吉林">吉林</option>
		                <option value="辽宁">辽宁</option>
		                <option value="内蒙古">内蒙古</option>
		                <option value="海南">海南</option>
		                <option value="山西">山西</option>
		                <option value="陕西">陕西</option>
		                <option value="山东">山东</option>
		                <option value="江苏">江苏</option>
		                <option value="浙江">浙江</option>
		                <option value="安徽">安徽</option>
		                <option value="江西">江西</option>
		                <option value="福建">福建</option>
		                <option value="甘肃">甘肃</option>
		                <option value="宁夏">宁夏</option>
		                <option value="青海">青海</option>
		                <option value="新疆">新疆</option>
		                <option value="湖北">湖北</option>
		                <option value="湖南">湖南</option>
		                <option value="四川">四川</option>
		                <option value="贵州">贵州</option>
		                <option value="云南">云南</option>
		                <option value="西藏">西藏</option>
		                <option value="香港">香港</option>
		                <option value="澳门">澳门</option>
		                <option value="台湾">台湾</option>
		                <option value="其它">其它</option>  
		            </select>

                </div>
            </div>



            <div class="form-group">
                <label for="address" class="col-sm-2 control-label">地址</label>
                <div class="col-sm-10">
                    <input type="text" name="address" id="address" required>
			    </div>
			</div>
			
            <div class="form-group">
                <label for="postid" class="col-sm-2 control-label">邮政编码</label>
                <div class="col-sm-10">
                    <input type="text" name="postid" id="postid" required>
                </div>
            </div>

            <div class="form-group">
                <label for="perid" class="col-sm-2 control-label">身份证号码(或营业执照)</label>
                <div class="col-sm-10">
                    <input type="text" name="perid" id="perid"  required>
                </div>
            </div>

            <div class="form-group">
                <label for="tel" class="col-sm-2 control-label">联系电话</label>
                <div class="col-sm-10">
                    <input type="text" name="tel" id="tel" required>
                </div>
            </div>
            
            <div class="form-group">
                <label for="fax" class="col-sm-2 control-label">传真</label>
                <div class="col-sm-10">
                    <input type="text" name="fax" id="fax" required>
                </div>
            </div>

            <div class="form-group">
                <label for="qq" class="col-sm-2 control-label">QQ或MSN</label>
                <div class="col-sm-10">
                    <input type="text" name="qq" id="qq"  required>
                </div>
            </div>
                                 	




		    <div class="form-group">
		        <div class="col-sm-offset-2 col-sm-10">
		            <button type="submit" class="btn btn-default">注册</button>
		        </div>
		    </div>
		</form>
		    
      </div>  
    </div>    
  </div>
</div>



</body>
</html>