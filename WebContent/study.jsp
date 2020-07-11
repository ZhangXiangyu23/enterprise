<%@page import="org.nuc.dao.impl.StudyDaoImpl"%>
<%@page import="org.nuc.dao.IStudyDao"%>
<%@page import="org.nuc.dao.impl.StudyDaoImpl"%>
<%@page import="org.nuc.dao.IStudyDao"%>
<%@page import="org.nuc.entity.Study"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>培训信息</title>
</head>
<body>
<%
	request.setCharacterEncoding("utf-8");
	IStudyDao selectStudy = new StudyDaoImpl();	
	String type = (String)session.getAttribute("type");
	int id = (int)session.getAttribute("id");
	if(type.equals("operater")){
		List<Study> list_studys= new ArrayList<Study>();
		list_studys=selectStudy.queryAllStudy();
		Iterator<Study> ite_Study =list_studys.iterator();
	%><br><br><br><br>
		<div align="right" >
			<a href="addstudy.jsp" target="show"><font size="5">增加培训</font></a>&nbsp&nbsp&nbsp&nbsp&nbsp
				<a href="user.jsp" target="show"><font size="4">退出</font></a>
		</div>
			 <table  width="550px" border='1' align="center"cellpadding="5"cellspacing="0">
			 <caption><h3>培训信息</h3></caption>
			   	<tr><th>工号</th><th>培训开始时间</th><th>培训内容</th><th>培训结束时间</th></tr>			   	
				   <%
			   		while(ite_Study.hasNext()){
			   			Study Study=ite_Study.next();
			   	 %>   	
			    <tr align="center">	
			    	<td><%=Study.getId()%></td>
			    	<td><%=Study.getStarttime()%></td>
			    	<td><%=Study.getContent()%></td>
			    	<td><%=Study.getEndtime()%></td>
			    </tr>
				   <%}%>
			   </table>
	<%}else{
		Study study = new Study();
		study = selectStudy.queryStudyByID(id);
	%>
	<div align="right" ><br><br>
			<a href="user.jsp" target="show"><font size="4">退出</font></a>
	</div><br>
	<table  width="400px" border='1' align="center"cellpadding="5"cellspacing="0">
	 <caption><h3>培训信息</h3></caption>
	 <tr>
	 	<th width="140px">工号</th>
	 	<td><%=study.getId()%> </td>
	 </tr>
	 <tr>
	 	<th>培训开始时间</th>
	 	<td><%=study.getStarttime()%></td>
	 </tr>
	 <tr>
	 	<th>培训内容</th>
	 	<td><%=study.getContent()%></td>
	 </tr>
	 <tr>
	 	<th>培训结束时间</th>
	 	<td><%=study.getEndtime()%></td>
	 </tr>  
</table>
	<%}%>
</body>
</html>