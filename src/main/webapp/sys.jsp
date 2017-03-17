<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
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
    <script src="http://cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="http://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    <style type="text/css">
        body {
            padding: 70px;
        }

        .table {
            width: 70%;
            margin: 0px auto;
            margin-top: 30px;
        }

        .input {
            width: 150px;
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
    <form action="<%=path%>/sys.do?m=save" method="post">
        <table class="table table-hover table-bordered">
            <tr>
                <th colspan="2" style="text-align: center; font-size: 16px;">系统设置</th>
            </tr>
            <tr>
                <td style="vertical-align: middle;">
                    <input type="text" name="user_min_one" class=" input" placeholder="设置最小人数"
                           value="${sys_one.user_min }"/>&nbsp;&nbsp;
                    <input class=" input" type="text" placeholder="设置最大人数" name="user_max_one"
                           value="${sys_one.user_max }"/>
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
</body>
</html>