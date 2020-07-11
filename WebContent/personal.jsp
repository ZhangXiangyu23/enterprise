<%@page import="org.nuc.entity.Employee"%>
<%@page import="java.util.*"%>
<%@page import="org.nuc.dao.impl.EmployeeDaoImpl"%>
<%@page import="org.nuc.dao.IEmployeeDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>信息展示</title>
</head>
<body>
<%
	String type = (String)session.getAttribute("type");
	int id = (int)session.getAttribute("id");
	if(type.equals("employee")){
		%>
		<jsp:include page="personal-household.jsp">
			<jsp:param value="<%=id %>" name="id"/>	
		</jsp:include>
		<%
	}else{//操作员
		request.setCharacterEncoding("utf-8");
		IEmployeeDao employeeselect = new EmployeeDaoImpl();	
		List<Employee> list_employees= new ArrayList<Employee>();
		list_employees=employeeselect.queryAllEmployee();
		Iterator<Employee> ite_em =list_employees.iterator();
		%><br><br><br><br>
	<div align="right" >
		<a href="adduser.jsp" target="show"><font size="5">增加用户</font></a>&nbsp&nbsp&nbsp&nbsp&nbsp
			<a href="user.jsp" target="show"><font size="4">退出</font></a>
	</div>
		 <table  width="550px" border='1' align="center"cellpadding="5"cellspacing="0">
		 <caption><h3>员工档案管理</h3></caption>
		   	<tr><th>工号</th><th>姓名</th><th>性别</th><th>户口状况</th><th>合同管理</th><th colspan="2">操作</th></tr>	   	
			   <%
		   		while(ite_em.hasNext()){
		   			Employee employee=ite_em.next();
			   %>   	
		    <tr align="center">	
		    	<td><%=employee.getId()%></td>
		    	<td><%=employee.getName()%></td>
		    	<td><%=employee.getSex()%></td>
		    	<td><a href="personal-household.jsp?id=<%=employee.getId() %>" target="show">查看</a></td>
		    	<td><a href="personal-agreement.jsp?id=<%=employee.getId() %>" target="show">查看</a></td>
		    	<td><a href="UpdateAgreement.jsp?id=<%=employee.getId() %>" target="show">修改</a></td>
		    	<td><a href="DeleteAgreement?id=<%=employee.getId() %>" target="show">删除</a></td>
		    </tr>
			   <%}%>
		   </table>
<%}%>
</body>
</html>