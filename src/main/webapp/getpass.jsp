<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>XX会员管理系统</title>
    <meta http-equiv="pragma" content="no-cache"/>
    <meta http-equiv="cache-control" content="no-cache"/>
    <meta http-equiv="expires" content="0"/>
    <link rel="stylesheet" href="resource/styles/reset.css" type="text/css">
    <link rel="stylesheet" href="resource/styles/login.css" type="text/css">
</head>

<body>
<div class="wrapper">
    <form action="updatepass.jsp" method="post">
        <div class="admin_login_main">
            <div class="admin_login_logo" style="height: 130px;">XX会员管理系统</div>
            <div style="width: 384px; height: 366px; background: #fff; border-radius: 10px;">
                <div style="text-align: center; color: #3FB3E9; font-size: 20px; padding: 20px; font-family: '微软雅黑';">
                    <span>Get Password</span>
                </div>
                <div style="width: 340px; margin: 0px auto; border-bottom: 1px solid #E0E0E0;"></div>
                <div style="width: 302px; margin: 0px auto; height: 125px; border-radius: 5px; text-align: center; color: #707070; font-size: 14px; margin-top: 30px; border: 1px solid #E0E0E0;">
                    <div style="border-bottom: 1px solid #E0E0E0;">
                        <label>账号：</label>
                        <input type="text"
                               style="border: none; background-color: #fbfbfb; width: 200px; height: 40px;"/>
                    </div>
                    <div style="border-bottom: 1px solid #E0E0E0;">
                        <label>密问：</label> <select
                            style="border: none; background-color: #fbfbfb; width: 200px; height: 40px;">
                        <option value="0">密保问题0？</option>
                        <option value="1">密保问题1？</option>
                        <option value="2" selected='selected'>密保问题2？</option>
                        <option value="3">密保问题3？</option>
                        <option value="4">密保问题4？</option>
                        <option value="5">密保问题5？</option>
                    </select>
                    </div>
                    <div>
                        <label>密答：</label>
                        <input type="text"
                               style="border: none; background-color: #fbfbfb; width: 200px; height: 40px;"/>
                    </div>
                </div>
                <div style="width: 302px; margin: 0px auto; margin-top: 30px;">
                    <button type="submit"
                            style="width: 300px; height: 45px; color: #fff; background: #009CE5; display: block; border: 0px; border-radius: 5px;"
                            value="">找回密码
                    </button>
                    <span class="link_pwd"></span>
                </div>
            </div>
        </div>
    </form>
</div>
<div id="Bottom">Copyright © 2016-2017, xx tech Co., Ltd. All Rights Reserved.</div>
</body>
</html>