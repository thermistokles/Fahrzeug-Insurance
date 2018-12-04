<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="ResetPass">
		<table>
			<tr>
			<th>Password</th>
					<td><input type="password" name="password" required /></td><br>
					<td><input type="text" value="${username}" name="username" readonly="readonly"/></td>
				</tr>
				<tr>
					<th>Confirm Password</th>
						<td><input type="password" name="conpassword" required /></td>
				</tr>
				<tr>
					<td colspan=2><input type="submit" Value="Submit" />
			</tr>
		</table>
	</form>
</body>
</html>