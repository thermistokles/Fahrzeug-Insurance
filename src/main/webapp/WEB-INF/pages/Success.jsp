<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"
%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
   
   <%@ page errorPage="ErrorPage.jsp" %> 
   <head>
   <title>Your Policies</title></head>  
   
 <c:forEach var="r" items="${list}">
 <table border="2" width="70%" cellpadding="2">

<tr>
<th>Policy Number</th>
<td>${r.policy_id}</td>
</tr>  
<tr>
<th>Registration Number</th>
<td>${r.registration_no}</td>
</tr>
 <tr>
<th>Claim</th>
<td>${r.claim_amount}</td>
</tr>
<tr>
<th>User Id</th>
<td>${r.user_id}</td>
</tr>    
<style>
div{
    width:60px;
   height:30px;
   background:green;
   border:2px solid black;
   border-radius:2px;}
   a{
   color:white;
   text-decoration:none;
   align:center;}
   
   </style>
   <table>
   <tr>
 <td> <div> <a href="claim" >Claim</a></div></td>
 <td>  <div><a href="renew" >Renew</a></div></td>
   </tr>
   </table>
   </c:forEach>  
   </table>  
   <br/>  
   </html>
   