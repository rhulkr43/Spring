<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
<h1>This Is Home Page</h1>
<%
String name=(String)request.getAttribute("name");
List<String> list=(List<String>)request.getAttribute("list");
for(String s:list){
	%>
	<h1><%=s%></h1>
	<% 
}
%>

</body>
</html>