<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
    <%@ page errorPage="ErrorPage.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
policy info
<table border="2">
	<c:forEach var="r" items="${policy}">
		<tr>
				<th colspan="3">Policy number: ${r.policyId}</th>
		</tr>
		
		<tr>
			<td>Registration number: ${r.userVehicleRegNo}</td>
			<td>Claim amount: ${r.claimAmount }</td>
			<td>Policy Type: ${r.policyType }</td>
		</tr>
		<tr>
			<td>Policy purchased on:${r.startDate}</td>
			<td>Policy valid till: ${r.endDate}</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>