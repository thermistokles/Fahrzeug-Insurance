<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Admin Panel</title>
<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/style.css"/>">
</head>
<body bgcolor=#F5EEF8>
	<h1><u>Users List</u></h1>  
	<table class="table table-striped table-dark" border="2" width="70%" cellpadding="2">  
	<tr>
	<th>Name</th>
	<th>Email</th>
	<th>Contact</th>
	<th>Delete</th>
	</tr>  
   <c:forEach var="usr" items="${usrList}">   
   <tr>  
   
   <td>${usr.username}</td>  
   <td>${usr.email}</td> 
   <td>${usr.phone}</td>  
   <td><a href="deleteusr/${usr.username}">Delete</a></td>  
   </tr>  
   </c:forEach>  
   </table>  <br>
   	<h1><u>Policy List</u></h1>  
   <table class="table table-striped table-dark" border="2" width="70%" cellpadding="2">  
	<tr>
	<th>Policy_Id</th>
	<th>User_id</th>
	<th>Registration_no</th>
	<th>Policy_status</th>
	<th>Claim_amount</th>
	
	<th>Disapprove</th>
	<th>Claim</th>
	</tr>  
   <c:forEach var="u" items="${PolicyList}">   
   <tr>  
   <td>${u.policyId}</td>  
   <td>${u.userId}</td>  
   <td>${u.userVehicleRegNo}</td>  
   <td>${u.policyStatus}</td> 
   <td>${u.claimAmount}</td>
   <td><a href="deletepolicy/${u.policyId}">Disapprove</a></td>  
   <td><a href="claimAmount/${u.claimAmount},${u.policyId}">Claim</a></td> 
   </tr>  
   </c:forEach>  
   </table>  <br>
   <h1><u>Tickets for Policies</u></h1>  
   <table class="table table-striped table-dark" border="2" width="70%" cellpadding="2">  
	<tr>
	<th>Ticket_no</th>
	<th>Policy_no</th>
	<th>Policy_status</th>
	<th>Approve</th>
	<th>Disapprove</th>
	</tr>  
   <c:forEach var="t" items="${tickets}">   
   <tr>  
   <td>${t.ticketNo}</td>  
   <td>${t.policyNo}</td>  
   <td>${t.status}</td> 
   <td><a href="approvetickets/${t.ticketNo}">Approve</a></td>
   <td><a href="deletetickets/${t.ticketNo}">Disapprove</a></td>
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
</body>
</html>