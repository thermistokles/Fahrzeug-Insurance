<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
<%@ page errorPage="ErrorPage.jsp" %><%-- <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
<tr>
<td colspan="2">Your policy expires on ${r.endDate }</td>
</tr>
<form action="claim" method="POST">
<input type="hidden" value="${user }" name="username">
<input type="hidden" value="${policy.getPolicyId() }">
<td> <input type="submit" value="claim" name="claim">Claim</div></td>
</form>
<td>  <div><a href="renew/${r.policyId }" >Renew</a></div></td>
</c:forEach> 
</table>
</body>
</html> --%>

<!DOCTYPE html>
<html lang="en">
  <!--
    Mirrored from site.codeglamour.com/html/18/enegix/login_page.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 25 Nov 2018 12:57:48 GMT
  -->
  <head>
    <meta charset="utf-8" />
    <meta name="description" content="Fitness HTML Template" />
    <meta name="author" content="CodeGlamour" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta
      name="viewport"
      content="width=device-width, initial-scale=1, shrink-to-fit=no"
    />
    <title>
      Welcome Page
    </title>
    <!-- Favicon -->
    <link rel="shortcut icon" href="images/favicon.ico" type="image/x-icon" />
    <link rel="icon" href="images/favicon.ico" type="image/x-icon" />
    <!-- Google Font -->
    <link
      href="../../../../fonts.googleapis.com/css2f99?family=Nunito"
      rel="stylesheet"
    />
    <link
      href="../../../../fonts.googleapis.com/css3403.css?family=Acme"
      rel="stylesheet"
    />
    <!-- Bootstrap Css -->
    <link rel="stylesheet" type="text/css" href="css/bootstrap.css" />
    <!-- Icons Css -->
    <link rel="stylesheet" type="text/css" href="css/themify-icons.css" />
    <!-- Font Awesome Css -->
    <link rel="stylesheet" type="text/css" href="css/fontawesome-all.min.css" />
    <!-- OWL Carousel Css -->
    <link rel="stylesheet" type="text/css" href="css/owl.carousel.min.css" />
    <!-- Slick Css -->
    <link rel="stylesheet" type="text/css" href="css/slick.css" />
    <!-- Magnific Popup Css -->
    <link rel="stylesheet" type="text/css" href="css/magnific-popup.css" />
    <!-- Custom Css -->
    <link rel="stylesheet" type="text/css" href="css/style.css" />
  </head>
  <body>
        
    <div width="100%">
    <table>
		<tr>
			<td>Welcome ${user}</td>
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
<tr>
<td colspan="2">Your policy expires on ${r.endDate }</td>
</tr>
<form action="claim" method="POST">
<input type="hidden" value="${user }" name="username">
<input type="hidden" value="${policy.getPolicyId() }">
<td> <input type="submit" value="claim" name="claim">Claim</div></td>
</form>
<td>  <div><a href="renew/${r.policyId }" >Renew</a></div></td>
</c:forEach> 
</table>
</div>
    <!-- ***** End Main Wrapper ***** -->

    <!-- Jquery-2.2.4 JS -->
    <script src="js/jquery-2.2.4.min.js"></script>
    <!-- login JS -->
    <script src="js/login.js"></script>
    <!-- Bootstrap-4 Beta JS -->
    <script src="js/bootstrap.min.js"></script>
    <!-- Touch Swipe JS File Version - 1.6.18 -->
    <script src="js/jquery.touchSwipe.min.js"></script>
    <!-- Paradise Slider Main JS File -->
    <script src="js/paradise_slider_min.js"></script>
    <!-- Jquery Easing Js -->
    <script src="../../../../cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.4.1/jquery.easing.js"></script>
    <!-- Slick Js -->
    <script src="js/slick.min.js"></script>
    <!-- Magnific Popup Js -->
    <script src="js/magnific-popup.js"></script>
    <!-- OWL Carousel Js -->
    <script src="js/owl-carousel.min.js"></script>
    <!-- Custom JS -->
    <script src="js/custom.js"></script>
  </body>
</html>