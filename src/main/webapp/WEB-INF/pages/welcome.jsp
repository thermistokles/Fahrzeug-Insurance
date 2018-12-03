<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
<%-- 	<%@ page errorPage="ErrorPage.jsp" %>
 --%><!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<meta http-equiv="Content-Type" content="text/html" charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<table>
		<tr>
			<td>Welcome ${user}</td>
		</tr>
		<tr>
			<td><a href="home.jsp">Home</a></td>
		</tr>
	</table>
	
	 <c:forEach var="r" items="${policies}">
 <table border="2" width="70%" cellpadding="2">

<tr>
<th>Policy Number</th>
<td>${r.policyId}</td>
</tr>  
<tr>
<th>Registration Number</th>
<td>${r.userVehicleRegNo}</td>
</tr>
 <tr>
<th>Claim</th>
<td>${r.claimAmount}</td>
</tr> 
<form action="claim" method="POST">
<input type="hidden" value="${user }" name="username">
<%-- <input type="hidden" value="${policy.getPolicyId() }"> --%>
<td> <input type="submit" value="claim" name="claim">Claim</div></td>
</form>
<td>  <div><a href="renew/${r.policyId }" >Renew</a></div></td>
</c:forEach> 
</table>
</body>
</html>