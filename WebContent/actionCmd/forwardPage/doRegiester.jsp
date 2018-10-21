<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="user" class="com.jsp.bean.LoginBean"></jsp:useBean>
<jsp:setProperty property="name" name="user"/>
<jsp:setProperty property="password" name="user"/>

<%
	String username = request.getParameter("name");
	String password = request.getParameter("password");
	
	out.print(username + "<br>");
	out.print(password);
%>
<h3>使用useBean获取请求参数</h3>
<jsp:getProperty property="name" name="user"/><br>
<jsp:getProperty property="password" name="user"/>


</body>
</html>