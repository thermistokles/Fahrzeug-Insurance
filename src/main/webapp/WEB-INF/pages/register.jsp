<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>
	<form action="registerProcess" method="post">

		<h3>Registration Form</h3>
					<div class="form-group">
						<div class="form-wrapper">
							<label for="">First Name</label>
							<input type="text" class="form-control" name="fName" required>
						</div>
						<div class="form-wrapper">
							<label for="">Last Name</label>
							<input type="text" class="form-control" name="lName" required>
						</div>
						<div class="form-wrapper">
						<label for="">Email</label>
						<input type="email" class="form-control" name="email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" required>
					</div>
					<div class="form-wrapper">
						<label for="">Phone No.</label>
						<input type="tel" class="form-control form-rounded" pattern="[789][0-9]{9}" name="phone" minlength="10" maxlength="10"  class="form-control"  required>
					</div>
					<div class="form-wrapper">
							<label for="">Address</label>
							<input type="textarea" class="form-control" name="address" required>
					</div>
					<div class="form-wrapper">
							<label for="">User Name</label>
							<input type="text" class="form-control" name="username" required>
					</div>
					
					<div class="form-wrapper">
						<label for="">Password</label>
						<input type="password" id="password" name="password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters"  class="form-control" required>
					</div>

					<div class="form-wrapper">
						<label for="">Confirm Password</label>
						<input type="password" id="confirm_password" class="form-control" required>
					</div>
					<div class="form-wrapper">
					<input type="submit" value="register">
					</div>
	</form>

</body>
</html>