<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My Login Form</title>
</head>
<body>
		<fieldset>
			<legend>Login Form</legend>
			<form action="./loginPage4" method="post">
				<table>
					<tr>
						<td>Employee ID</td>
						<td>:</td>
						<td><input  type="number" name="empId"> </td>
					</tr>
					<tr>
						<td>Employee Name</td>
						<td>:</td>
						<td><input  type="text" name="user"> </td>
					</tr>
					<tr>
						<td>Password</td>
						<td>:</td>
						<td><input  type="Password" name="passkey"> </td>
					</tr>
					<tr>
						<td><input type="submit" name="Submit"/></td>
					</tr>						
				</table>
			</form>
	</fieldset>
</body>
</html>