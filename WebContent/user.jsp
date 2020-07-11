<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页默认界面</title>
</head>
<body>
<%
	int id = (int)session.getAttribute("id");
	String type = (String)session.getAttribute("type");
	String name = (String)session.getAttribute("name");
	if(type.equals("employee")){
%><br><br><br><br><br><br><br>
<center><h1>欢迎用户<br>(ID:<%=id%>&nbsp<%=name %>)</h1></center>
<%
	}else{
%><br><br><br><br><br><br><br>
<center><h1>欢迎操作员<br>(ID:<%=id%>&nbsp<%=name %>)</h1></center>
<%}%>
</body>
</html>