<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>主页</title>
</head>
<frameset cols="*,1100,*" frameborder="no" border="0" framespacing="0">
<frame src="about:blank"></frame>
	<frameset rows="190,550,80" style="width: 1100px">
	  <frame src="head.jsp" scrolling="no">
	  <frameset cols="20%,80%">
	    <frame src="left.jsp"  noresize="noresize" scrolling="no">
	    <frame src="user.jsp"  name="show" scrolling="no">
	  </frameset>
		<frame src="foot.jsp" noresize="noresize" scrolling="no">
	</frameset>
<frame src="about:blank"></frame>
</frameset>
<body>
	<noframes>当前的浏览器不兼容！</noframes>
</body>
</html>