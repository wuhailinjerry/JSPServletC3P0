<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>XX会员管理系统</title>
    <!-- Bootstrap -->
    <link rel="stylesheet" href="http://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

    <style type="text/css">
        body {
            padding: 70px;
        }

        .table {
            width: 50%;
            margin: 0px auto;
            margin-top: 30px;
        }

        input[type='text'], input[type='password'], select {
            width: 250px;
            border: 1px solid #eee;
            height: 40px;
            line-height: 40px;
            border-radius: 3px;
            padding-left: 10px;
        }
    </style>
</head>
<body>

<!-- 引入我们的头部文件 -->
<%@ include file="header.jsp" %>
<div class="container-fluid ">
    <form action="<%=path%>/save.do" method="post">
        <table class="table table-hover table-bordered">
            <tr>
                <td align="right">登录账号：</td>
                <td>${user.user_id }</td>
            </tr>
            <tr>
                <td align="right">创建者：</td>
                <td>${user.user_creator }</td>
            </tr>
            <tr>
                <td align="right" style="vertical-align: middle;">真实姓名：</td>
                <td><input type="text" name="user_name" value="${user.user_name }"/></td>
            </tr>
            <tr>
                <td align="right" style="vertical-align: middle;">出生日期：</td>
                <td><input type="text" name="user_birthday" value="${user.user_birthday }" onclick="WdatePicker()"/>
                </td>
            </tr>
            <tr>
                <td align="right" style="vertical-align: middle;">手机号码：</td>
                <td><input type="text" name="user_telephone" value="${user.user_telephone }"/></td>
            </tr>
            <tr>
                <td align="right" style="vertical-align: middle;">所在城市：</td>
                <td><input type="text" name="user_city" value="${user.user_city }"/></td>
            </tr>

            <tr>
                <td align="right" style="vertical-align: middle;">修改密码：</td>
                <td><input type="password" name="user_pass"/>
                    <!-- 隐藏域，保存密码 -->
                    <input type="hidden" name="hf_pass" value="${user.user_pass }"/></td>
            </tr>
            <tr>
                <td align="right" style="vertical-align: middle;">确认密码：</td>
                <td><input type="password"/></td>
            </tr>
            <tr>
                <td align="right" style="vertical-align: middle;">密保问题：</td>
                <td>
                    <select name="user_faq">
                        <!-- 使用jstl标签进行判断 -->
                        <option value="0" <c:if test="${user.user_faq==0 }">selected='selected'</c:if>>密保问题0？</option>
                        <option value="1" <c:if test="${user.user_faq==1 }">selected='selected'</c:if>>密保问题1？</option>
                        <option value="2" <c:if test="${user.user_faq==2 }">selected='selected'</c:if>>密保问题2？</option>
                        <option value="3" <c:if test="${user.user_faq==3 }">selected='selected'</c:if>>密保问题3？</option>
                        <option value="4" <c:if test="${user.user_faq==4 }">selected='selected'</c:if>>密保问题4？</option>
                        <option value="5" <c:if test="${user.user_faq==5 }">selected='selected'</c:if>>密保问题5？</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td align="right" style="vertical-align: middle;">密保答案：</td>
                <td><input type="text" name="user_answer" value="${user.user_answer}"/></td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <button class="btn  btn-primary" type="submit">提交保存</button>
                </td>
            </tr>
        </table>
    </form>
</div>
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="http://cdn.staticfile.org/jquery/3.1.1/jquery.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="http://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
<!-- 日期控件 -->
<script type="text/javascript" src="resource/scripts/My97DatePicker/WdatePicker.js"></script>
</body>
</html>