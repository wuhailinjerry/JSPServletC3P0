/*
 * 用户登录的js基本验证
 */

$(function() {

	$(".admin_login_btn").click(function() {
		//alert("点击我了");
		var account = $("#account");//获取
		var password = $("#password");
		if (account.val() == "") {
			account.focus();//jQuery事件，元素获得焦点
			//account.css("border","1px solid red");//显示边框
			return false;
		}
		if (password.val() == "") {
			password.focus();
			return false;
		}
		//Ajax请求
		$.ajax({
			url : "login.do",//请求URL，在web.xml中配置
			type : "POST",//请求方式
			//请求参数
			data : {
				"account" : account.val(),
				"password" : password.val(),
				"time" : new Date().getTime()
			},
			dataType : "json",
			//返回结果
			success : function(msg) {
				if (msg == 1) {
					$(".link_pwd").html("用户名错误");
					return false;
				} else if (msg == 2) {
					$(".link_pwd").html("密码错误");
					return false;
				} else if (msg == 3) {
					//正确
					location.href = 'main.do';
				}
			},
			error : function(er) {
				console.log(er);
			}
		});

	});

});