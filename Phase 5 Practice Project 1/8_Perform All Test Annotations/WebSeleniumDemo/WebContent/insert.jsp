<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="webselenium.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String name=request.getParameter("user");
User user=new User();
user.setUsername(name);
UserDAO dao=new UserDAO();
int i=dao.insert(user);
if(i>0){
	response.sendRedirect("success.jsp");
	
}
else{
	response.sendRedirect("fail.jsp");
}
%>
</body>
</html>
