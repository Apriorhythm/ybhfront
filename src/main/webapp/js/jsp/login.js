	$(function(){  
        $('#loginSubmit').click(function(){
            var username = $("#username").val();  
            var password = $("#password").val();  
              
			$.post('validate.yo',{username:username, password:password},function(data){
				if ("Yo" == data + "")
					window.location.href = window.ctx + "/";
				else
					alert("登录失败了");
			});

        });  
    });  		