<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="./home">Home</a>
	<a href="./logout" style="float:right">Logout</a>
	<fieldset>

		<legend>HOME</legend>
		<form action="./changepassword">
			<table>
				<tr>

					<td>Change Password</td>
					<td><input type="password" name="password"></td>

				</tr>
				<tr>
					<td>new Password</td>

					<td><input type="password" name="confirmpassword"></td>
				</tr>
				<tr>
					<td></td>

					<td><input type="submit" value="change"></td>
				</tr>

			</table>
		</form>
	</fieldset>

</body>
</html>