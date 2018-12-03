<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="adminloginProcess">
		<table>
			<tr>
			<th>Username</th>
					<td><input type="text" name="username" required /></td>
				</tr>
				<tr>
					<th>Password</th>
				<td><input type="password" name="password" required /></td>
				</tr>
				<tr>
					<td colspan=2><input type="submit" Value="Submit" />
			</tr>
		</table>
	</form>
</body>
</html>