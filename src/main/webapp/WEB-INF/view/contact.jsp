<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contact Us page</title>
</head>
<body>
<h1> This Contact Us page</h1>
<form action="contact2" method="post">
<table>
<tr>
<td>Name</td>
<td><input type="text" name="name" /></td>
</tr>
<tr>
<td>Email</td>
<td><input type="email" name="email" /></td>
</tr>
<tr>
<td>Password</td>
<td><input type="password" name="pass" /></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="SignUp"/></td>
</tr>
</table>
</form>
</body>
</html>