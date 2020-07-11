<%@page import="org.nuc.entity.Employee"%>
<%@page import="java.util.*"%>
<%@page import="org.nuc.dao.impl.EmployeeDaoImpl"%>
<%@page import="org.nuc.dao.IEmployeeDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>户口信息展示页面</title>
</head>
<body>
<%
	String type = (String)session.getAttribute("type");
		request.setCharacterEncoding("utf-8");
		int id =Integer.parseInt(request.getParameter("id"));
		IEmployeeDao employeeselectid = new EmployeeDaoImpl();
		Employee employee = new Employee();
		employee = employeeselectid.queryEmployeeByID(id);
		%>	
	<div align="right" ><br><br>
			<a href="personal.jsp" target="show"><font size="4">退出</font></a>
	</div>
	<table  width="400px" border='1' align="center"cellpadding="5"cellspacing="0">
	 <caption><h3>户口信息</h3></caption>
	 <tr>
	 	<th width="140px">姓名：</th>
	 	<td><%=employee.getName() %></td>
	 </tr>
	 <tr>
	 	<th>性别：</th>
	 	<td><%=employee.getSex() %></td>
	 </tr>
	 <tr>
	 	<th>电话：</th>
	 	<td><%=employee.getContect() %></td>
	 </tr>
	 <tr>
	 	<th>政治面貌：</th>
	 	<td><%=employee.getIdentity() %></td>
	 </tr>
	 <tr>
	 	<th>学历：</th>
	 	<td><%=employee.getEducation() %></td>
	 </tr>
	 <tr>
	 	<th>住址：</th>
	 	<td><%=employee.getAddress() %></td>
	 </tr>	  
	</table>
</body>
</html>