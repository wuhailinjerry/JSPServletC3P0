<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>XX会员管理系统</title>
    <link rel="stylesheet" href="resource/styles/reset.css" type="text/css">
    <link rel="stylesheet" href="resource/styles/login.css" type="text/css">
</head>

<body>
<div class="bg"></div>
<div class="mask"></div>
<div class="content">
    <div class="admin_login_main">
        <div class="admin_login_logo">XX会员管理系统</div>
        <div class="admin_login_wrap">
            <input id="account" class="admin_login_name inputs"
                   type="text" value=""/>
            <input id="password" class="admin_login_pwd inputs"
                   type="password" value="" autocomplete="off"/>
            <div class="tips_wrap">
                <span class="tips"><a href="getpass.jsp">忘记密码？</a></span>
                <button type="submit" class="admin_login_btn"></button>
                <!-- 用来放置错误信息 -->
                <span class="link_pwd"></span>
            </div>
        </div>
    </div>
</div>
<div id="Bottom">Copyright © 2016-2017, xx tech Co., Ltd. All Rights Reserved.</div>
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="http://cdn.staticfile.org/jquery/3.1.1/jquery.min.js"></script>
<script type="text/javascript" src="resource/scripts/login.js"></script>
</body>
</html>