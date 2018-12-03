<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<html>
<head>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>
	<form action="VehicleRegister" method="post">

<br><br>
Vehicle Type&nbsp<select name="user_vehicle_type">
<option value="2W">2-Wheeler</option>
<option value="4W">4-Wheeler</option>
</select><br><br>


Company/Manufactutrer&nbsp<select name="user_vehicle_company">
<h1>${company_list}</h1>
<c:forEach var="r" items="${company_list}">   
 <option value="${r}">${r}</option>  
   </c:forEach>
</select><br><br>

Vehicle Model&nbsp<select name="user_vehicle_model">
<c:forEach var="m" items="${model_list}">   
 <option value="${m}">${m}</option>  
   </c:forEach>
</select><br><br>



Zone/Location &nbsp<select name="user_zone">
<option value="1">ZONE A-Ahmedabad, Bangalore, Chennai,  Hyderabad , Kolkata, Mumbai, New Delhi and Pune</option>
<option value="2">ZONE B-Rest of India</option>
</select><br><br>

Purchase Date:&nbsp<input type="date" name="purchase_date"  required /><br><br>

Policy Type &nbsp<select name="policy">
<option value="3PL">Thrid Party Liability Policy</option>
<option value="COMP">Comprehensive Policy</option>
</select><br><br>

Vehicle Registration Number &nbsp<input type="text" name="user_vehicle_reg_no" required>

Vehicle Chasis Number &nbsp<input type="text" name="user_vehicle_chasis_no" required>

Vehicle Engine Number &nbsp<input type="text" name="user_vehicle_engine_no" required>


<input type="hidden" name="user_id" value="${user}">


<div id="submit"><input type="submit" Value="Submit" /></div>
</div>
</center>
</form>
	</form>

</body>
</html>