<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page errorPage="ErrorPage.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<title>Your Ticket</title>
</head>
<body>
<h1>Your Ticket number is ${ticket }</h1>

<p>
<ol>
<li>Kindly note down the above policy number.</li>
<li>An agent will be sent to your address to verify your ticket.</li>
<li>The verification process will require the following:</li>
<ul>
<li>Aadhar card</li>
<li>Insurance policy</li>
<li>Insured vehicle</li>
</ul>
<li>Please keep the original documents as well as a copy of each document as it is necessary for verification process.</li>
</ol>
</p>
</body>
</html>