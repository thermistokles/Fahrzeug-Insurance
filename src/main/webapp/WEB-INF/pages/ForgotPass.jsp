<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="ForgotPassProcess">
		<table border=2>
			<tr>
		         	<th>Username</th>
					<td><input type="text" name="username" required /></td>
			</tr>
				<tr>
					<th>Email</th>
						<td><input type="email" name="email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" required></td>
				</tr>
				<tr>
					<td colspan=2><input type="submit" Value="Submit" />
			</tr>
		</table>
	</form>
</body>
</html>