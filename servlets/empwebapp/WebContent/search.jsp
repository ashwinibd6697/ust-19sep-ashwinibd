<%@page import="com.ustglobal.empwebapp.dto.EmployeeInfo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%
EmployeeInfo info =(EmployeeInfo)request.getAttribute("info");
%>
<body>
	<a href='./home'>Home</a>
	<a style='float: right' href='./logout'>logout</a>
	<% if(info!=null){ %>
	<fieldset align="center">
		<legend>Employeee info</legend>
		<table align="center">
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Email</th>
			</tr>
			<tr>
				<td><%=info.getId() %></td>
				<td><%=info.getName() %></td>
				<td><%=info.getEmail() %></td>
			</tr>
		</table>
	</fieldset>
	<%}else{ %>
	<h1>NO DATA FOUND</h1>
	<%} %>
</body>
</html>