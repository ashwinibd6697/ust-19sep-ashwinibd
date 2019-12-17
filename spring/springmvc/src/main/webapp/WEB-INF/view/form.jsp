<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<fieldset>
<legend>Login</legend>
<form action="./form" method="post">
<table>
<tr>
  <td>id</th>
<td><input type="number" name="id"></td>
  </tr>
  <tr>
  <td>name</td>
  <td><input type="text" name="name"></td>
   <td>
  </tr>
  <tr>
   <th>password</th>
   <td><input type="password" name="password"></td>
</tr>
<tr>
<td> gender</td>
<td><input type="text" name="gender"></td>
</tr>

<tr>
<td> DOJ</td>
<td><input type="date" name="doj"></td>
</tr>

<tr>
<td> </td>
<td><input type="reset" value="Reset"></td>
<td><input type="submit" value="Register">
</tr>
</table>
</form>
</fieldset>
</body>
</html>