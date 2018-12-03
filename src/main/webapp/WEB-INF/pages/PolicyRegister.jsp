<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
   <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>
	<form action="policyProcess">


		<h3>Registration Form</h3>
					<div class="form-group">
						<div class="form-wrapper">
							<label for="">Policy Type</label>
							<input type="text" value="${policy_type}" class="form-control" name="policy_type" readonly="readonly"/>
						</div>
						<div class="form-wrapper">
							<label for="">Vehicle Registration Number</label>
							<input type="text" value="${reg_no}" class="form-control" name="reg_no" readonly="readonly"/>
						</div>
						<div class="form-wrapper">
						<label for="">Premium Amount</label>
							<input type="text" value="${premium}" class="form-control" name="premium" readonly="readonly"/>
					</div>
					<input type="hidden" value="${user_id}" name="user_id">
					
					<input type="hidden" value="${idv}" name="idv">
					
				
					<div class="form-wrapper">
					<input type="submit" value="buy" name="buy_policy">
					</div>
	</form>

</body>
</html>