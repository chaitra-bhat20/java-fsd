<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.work.*" %>
    <%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>	
		<a href="adminPage.jsp">Go back</a>
		<h1>Quiz Details</h1>
		<% 
			QuizOperations qo=new QuizOperations();
			List<Quiz> list=qo.getQuiz();%>
			
			<% for(Quiz a:list){%>		
			<h3><%= a.question %></h3>	
				<tr><td><%=a.id %></td><td><%=a.title %></td><td><%=a.category %></td>
				</tr>		
			<%}%>
			</table>
			
</body>
</html>