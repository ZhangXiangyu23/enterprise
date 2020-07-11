<%@ page language="java" import="org.nuc.entity.User" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>导航页</title>
<style type="text/css">
	ul li{
	list-style: none;
	font-family:"瀹嬩綋"; 
	font-size:25px;
	line-height: 50px;
	text-align: center;
	}
	a{
	TEXT-DECORATION:none;
	color: red;
	}
</style>
</head>
<body><br>
<center><h1>&nbsp&nbsp&nbsp&nbsp导航栏</h1></center>
<%
	String type = (String)session.getAttribute("type");
	int id = (int)session.getAttribute("id");
	//System.out.print(type);
	if(type.equals("employee")){
%>
<ul>
	<li><a href="personal.jsp" target="show">个人信息</a></li><br>
	<li><a href="attendance.jsp" target="show">考勤情况</a></li><br>
	<li><a href="study.jsp" target="show">培训信息</a></li><br>
	<li><a href="UpdateAgreement.jsp?id=<%=id%>" target="show">账户维护</a></li>
</ul>
<%}else{%>
<br>
<ul>
	<li><a href="personal.jsp" target="show">员工档案管理</a></li><br>
	<li><a href="attendance.jsp" target="show">考核管理</a></li><br>
	<li><a href="study.jsp" target="show">培训信息</a></li>
</ul>
<%}%>
</body>
</html>