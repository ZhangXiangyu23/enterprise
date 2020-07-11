<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>增加培训界面</title>
</head>
<body><br><br>
	<div align="right" >
			<a href="study.jsp" target="show"><font size="4">退出</font></a>
	</div>
<form action="DoAddStudy" method="post">
<table  width="400px" border='1' align="center"cellpadding="5"cellspacing="0">
	 <caption><h3>增加培训</h3></caption>
	 <tr>
	 	<th width="140px">工号</th>
	 	<td><input type="text" name="id" size="30"> </td>
	 </tr>
	 <tr>
	 	<th>培训开始时间</th>
	 	<td><input type="text" name="starttime" size="30"> </td>
	 </tr>
	 <tr>
	 	<th>培训内容</th>
	 	<td><input type="text" name="content" size="30"> </td>
	 </tr>
	 <tr>
	 	<th>培训结束时间</th>
	 	<td><input type="text" name="endtime" size="30"> </td>
	 </tr>
	<tr>
	 	<td colspan="2" align="center">
			<input type="submit" value="提交" style="width:200px; height:30px;">
		</td>
	 </tr>	  
</table>
</form>

</body>
</html>