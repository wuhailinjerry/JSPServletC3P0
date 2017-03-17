<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<nav class="navbar navbar-inverse  navbar-fixed-top">
	<div class="container">
		<div class="navbar-header">
			<a href="#" class="navbar-brand active" style="color: #fff;">XX会员管理系统</a>
		</div>
		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav">
				<li><a href="main.do">我的信息</a></li>
				<!-- 只要管理员有权限 -->
				<c:if test="${sessionScope.user eq 'admin' }">
					<li><a href="add.jsp">添加会员</a></li>
					<li><a href="sys.do">系统设置</a></li>
				</c:if>
				<li><a href="out.jsp">安全退出</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right hidden-sm">
				<!-- EL表达式 -->
				<li><a style="color: #fff;" href="main.do">欢迎您：${sessionScope.user}</a></li>
			</ul>
		</div>
	</div>
</nav>