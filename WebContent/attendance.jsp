<%@page import="org.nuc.dao.impl.WorkDaoImpl"%>
<%@page import="org.nuc.dao.IWorkDao"%>
<%@page import="org.nuc.entity.Work"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>考勤情况</title>
</head>
<body>
<%
	request.setCharacterEncoding("utf-8");
	IWorkDao selectwork = new WorkDaoImpl();	
	String type = (String)session.getAttribute("type");
	int id = (int)session.getAttribute("id");
	if(type.equals("operater")){
		List<Work> list_works= new ArrayList<Work>();
		list_works=selectwork.queryAllWork();
		Iterator<Work> ite_work =list_works.iterator();
	%><br><br><br><br>
		<div align="right" >
				<a href="user.jsp" target="show"><font size="4">退出</font></a>
		</div>
			 <table  width="550px" border='1' align="center"cellpadding="5"cellspacing="0">
			 <caption><h3>考勤管理</h3></caption>
			   	<tr><th>工号</th><th>出勤率</th><th>迟到情况</th><th>出差次数</th><th>加班次数</th><th>总工资</th></tr>		   	
				   <%
			   		while(ite_work.hasNext()){
			   			Work work=ite_work.next();
			   	 %>   	
			    <tr align="center">	
			    	<td><%=work.getId()%></td>
			    	<td><%=work.getAttendance()%></td>
			    	<td><%=work.getLate()%></td>
			    	<td><%=work.getBusiness()%></td>
			    	<td><%=work.getOvertime()%></td>
			    	<td><%=work.getSalary()%></td>
			    </tr>
				 <%}%>
		   </table>
	<%}else{
		Work work = new Work();
		work = selectwork.queryWorkByID(id);
		session.setAttribute("workid", work.getId());
		session.setAttribute("workattendance", work.getAttendance());
		session.setAttribute("workovertime", work.getOvertime());
		session.setAttribute("worksalary", work.getSalary());
	%>
	<div align="right" ><br><br>
			<a href="user.jsp" target="show"><font size="4">退出</font></a>
	</div><br>
	<table  width="300px" border='1' align="center"cellpadding="5"cellspacing="0">
	 <caption><h3>考勤情况</h3></caption>
	 <tr>
	 	<th width="140px">工号</th>
	 	<td align="center"><%=work.getId()%> </td>
	 </tr>
	 <tr>
	 	<th>出勤率</th>
	 	<td align="center"><%=work.getAttendance()%> </td>
	 </tr>
	 <tr>
	 	<th>迟到情况</th>
	 	<td align="center"><%=work.getLate()%> </td>
	 </tr>
	 <tr>
	 	<th>出差次数</th>
	 	<td align="center"><%=work.getBusiness()%></td>
	 </tr>
	 <tr>
	 	<th>加班次数</th>
	 	<td align="center"><%=work.getOvertime()%></td>
	 </tr>
	 <tr>
	 	<th>总工资</th>
	 	<td align="center"><%=work.getSalary()%></td>
	 </tr>	
	 <tr height="50">
	 	<td align="center"><a href="UpdateWorkAttendance"><font color="red">今日签到</font></a></td>
	 	<td align="center"><a href="UpdateWorkOvertime"><font color="red">加班确认</font></a></td>
	 </tr>  
</table>
	<%}%>
</body>
</html>