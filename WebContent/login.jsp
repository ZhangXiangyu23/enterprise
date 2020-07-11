<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录界面</title>
<meta http-equiv="Content-Type" content= "text/html;charset=utf-8"/>
	<link rel="stylesheet" type="text/css" href="style/cs.css"></link> 
</head>
<body> 
<div id="container">	
	<jsp:include page="head.jsp"></jsp:include>	
	<div id="login" >
		<br/>
			<br>		
			<form name="form1" action="CheckUser" method="post">
				<table  align="center" border="0" cellpadding="5"cellspacing="0">
					<caption><h3>用户登录</h3></caption>
					<tr><td>账号：</td><td><input type="text" name="id"></td></tr>
					<tr><td>密码：</td><td><input type="password" name="password"></td></tr>				
						<tr> 
						<td colspan="2" align="center">
						<input type="submit" value="提交" onclick="return check()"/>
						</td></tr>
				</table>
			</form>
	</div>
</div>
</body>
</html>