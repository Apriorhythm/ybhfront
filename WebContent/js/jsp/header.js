	

$(function(){

	/* ************ 判断是否已经登录 ************ */ 
	var username = sessionStorage.getItem("username", username);
	if (null != username) {
		alert(username);
		document.getElementById('loginAndRegister').innerHTML = ""+
        "<li><a href='" + window.ctx + "/user/profile'>"+ username + "</a></li>" +
        "<li><a href='" + window.ctx + "/user/logout'>退出登录 </a></li>";
	}

	
	
	
	
	/* ************ 登陆提交按钮 ************ */ 
	$('#loginSubmit').click(function(){
		var username = $('#username').val();
		var password = $('#password').val();
		
		var validate = ("" == username) ? 0 : (("" == password) ? 1 : 5);
		var alertInformation = ["请输入用户名!", "请输入密码!"];
		if (5 != validate)
		{
			alert(alertInformation[validate]);
			return;
		}
		
		/* TO-DO
		var base64Tool = new Base64();
		var base64Password = base64Tool.encode(password); 
        */
		
		/* 数据格式: application/x-www-form-urlencoded  */
		var committedDdata = { username : username, password : password };
		
		$.post(window.ctx + '/user/validate', committedDdata, function(id){
			if ("" != id) {
				
				document.getElementById('loginAndRegister').innerHTML = ""+
	                "<li><a href='" + window.ctx + "/user/profile'>"+ username + "</a></li>" +
	                "<li><a href='" + window.ctx + "/user/logout'>退出登录 </a></li>";
				
				
				$('#login-modal').modal('hide');
				
				alert("登陆成功");
			}
			else {
				alert("账号密码输入错误");
			}

		});
	});
});


