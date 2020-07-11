<%@page import="org.nuc.entity.Employee"%>
<%@page import="org.nuc.dao.IEmployeeDao"%>
<%@page import="org.nuc.dao.impl.EmployeeDaoImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改员工</title>
</head>
<body>
<%
	request.setCharacterEncoding("utf-8");
	int id = Integer.parseInt(request.getParameter("id"));
	session.setAttribute("updateid", id);
	Employee employee  = new Employee();
	IEmployeeDao selectemployeebyid = new EmployeeDaoImpl();
	employee = selectemployeebyid.queryEmployeeByID(id);
%>
	<div align="right" ><br>
			<a href="user.jsp" target="show"><font size="4">退出</font></a>
	</div>
<form action="DoUpdateEmplyee" method="post">
<table  width="400px" border='1' align="center"cellpadding="5"cellspacing="0">
	 <caption><h3>修改员工</h3></caption>
	 <tr>
	 	<th width="140px">姓名</th>
	 	<td><input type="text" name="name" size="30" value="<%=employee.getName()%>"> </td>
	 </tr>
	 <tr>
	 	<th>密码</th>
	 	<td><input type="password" name="password" size="30"  value="<%=employee.getPassword()%>"> </td>
	 </tr>
	 <tr>
	 	<th>性别</th>
	 	<td><input type="text" name="sex" size="30"  value="<%=employee.getSex()%>"> </td>
	 </tr>
	 <tr>
	 	<th>联系方式</th>
	 	<td><input type="text" name="contect" size="30"  value="<%=employee.getContect()%>"> </td>
	 </tr>
	 <tr>
	 	<th>政治面貌</th>
	 	<td align="center">
			<input type="radio" name="identity" value="群众">群众 &nbsp
			<input type="radio" name="identity" value="团员" checked>团员<br>
			<input type="radio" name="identity" value="党员">党员 &nbsp
			<input type="radio" name="identity" value="其他">其他 &nbsp
		</td>
	 </tr>
	 <tr>
	 <th>文化水平</th>
	 	<td align="center">
			<select name ="education">
				<option value="高中">高中</option>
				<option value="本科" selected>本科</option>
				<option value="专科">专科</option>
				<option value="硕士">硕士</option>
			</select>
		</td>
	 </tr>
	  <th>住址</th>
	 	<td>
			<input type="text" name="address" size="30"  value="<%=employee.getAddress()%>">
		</td>
	 </tr>
	 	<td colspan="2" align="center">
			<input type="submit" value="修改" style="width:200px; height:30px;">
		</td>
	 </tr>	  
</table>
</form>
</body>
</html>