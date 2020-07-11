<%@page import="org.nuc.dao.impl.AgreementDaoImpl"%>
<%@page import="org.nuc.dao.IAgreementDao"%>
<%@page import="org.nuc.entity.Agreement"%>
<%@page import="java.util.*"%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>合同详情</title>
</head>
<body>
<%
	String type = (String)session.getAttribute("type");
		request.setCharacterEncoding("utf-8");
		int id =Integer.parseInt(request.getParameter("id"));
		IAgreementDao agreementselectid = new AgreementDaoImpl();
		Agreement agreement = new Agreement();
		agreement = agreementselectid.queryAgreementByID(id);
		%><br><br>
	<div align="right" >
			<a href="personal.jsp" target="show"><font size="4">退出</font></a>
	</div><br>
	<table  width="400px" border='1' align="center"cellpadding="5"cellspacing="0">
	 <caption><h3>合同详情</h3></caption>
	 <tr>
	 	<th width="140px">工号</th>
	 	<td><%=id %> </td>
	 </tr>
	 <tr>
	 	<th>入职日期：</th>
	 	<td><%=agreement.getJoins() %></td>
	 </tr>
	 <tr>
	 	<th>工龄：</th>
	 	<td><%=agreement.getYears() %></td>
	 </tr>
	 <tr>
	 	<th>退休日期：</th>
	 	<td><%=agreement.getRetire() %></td>
	 </tr>
	 <tr>
	 	<th>是否在职：</th>
	 	<td><%=agreement.getIsworkString()%></td>
	 </tr>	  
</table>
</body>
</html>