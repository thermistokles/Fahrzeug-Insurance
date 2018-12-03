<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
	<%@ page errorPage="ErrorPage.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Fahrzeug Insurance</title>
</head>
<body>
<form action="../renewProcess" method="post">
<select name="policyType">
<option value="3PL">Third Party Liability Policy</option>
<option value="COMP">Comprehensive Policy</option>
</select><br><br>
<h1>${r.policyId}</h1>
<input type="submit">
</form>
</body>
</html>