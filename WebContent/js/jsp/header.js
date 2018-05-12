	$('#login').click(function(){
		$.post(window.ctx+'/user/validate',function(result){

			$('#addusertype').empty();
			$('#addusertype').append('<option value="-1" selected>请选择用户角色</option>');

		});
		
	});