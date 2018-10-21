<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>for循环测试</h3>
<%
	int i;
	for(i = 0;i < 10;i++){
%>
		<a>aaaa</a><br>
<%
	}
%>
<h3>for输出循环</h3>
<%
	for(i = 0;i < 3;i++){
		out.println("print" + i + "<br>");
	}
%>
</body>
</html>