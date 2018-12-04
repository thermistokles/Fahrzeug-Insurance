<%@ page errorPage="Errorpage.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html>
<html lang="en">
  <!--
    Mirrored from site.codeglamour.com/html/18/enegix/registration_page.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 25 Nov 2018 12:57:48 GMT
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
     Fahrzeug Insurance
    </title>
    <!-- Favicon -->
    <link rel="shortcut icon" href="images/favicon.ico" type="image/x-icon" />
    <link rel="icon" href="images/favicon.ico" type="image/x-icon" />
    <!-- Google Font -->
    <linkBuyInsurance hreBuyInsurancents.googleapis.com/css2f99?family=Nunito"
    relBuyInsurance /> <linkBuyInsurance
    hreBuyInsurancents.googleapis.com/css3403.css?family=Acme" relBuyInsurance
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
  </head>
  <body>
      <header class="main-header">
          <div class="main_navbar">
            <!-- MAIN NAVBAR -->
            <nav class="navbar navbar-expand-lg navbar-dark">
              <div class="container">
                <a class="navbar-brand logo-sticky" href="index.jsp"
                  >Fahrzeug</a
                >
                  <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarNav">
                  <ul class="navbar-nav mr-auto">
                    <li class="nav-item">
                      <a href="index.jsp" class="nav-link">Home</a>
                    </li>
                    <li class="nav-item dropdown">
                      <a
                        href="#"
                        class="nav-link dropdown-toggle"
                        data-toggle="dropdown"
                        >Insurance</a
                      >
                      <div class="dropdown-menu">
                        <a href="login.jsp" class="dropdown-item"
                          >Buy Insurance</a
                        >
                        <a href="login.jsp" class="dropdown-item"
                          >Renew Insurance</a
                        >
                        <a href="login.jsp" class="dropdown-item"
                          >Claim Insurance</a
                        >
                        <a href="calculate_premium_estimate" class="dropdown-item"
                        >Calculate Estimate Premium</a
                      >
                      </div>
                    </li>
                    <li class="nav-item">
                      <a href="#" class="nav-link">Help</a>
                    </li>
                    <li class="nav-item">
                      <a href="#" class="nav-link">Contact</a>
                    </li>
                  </ul>
  
                  <ul class="navbar-nav ml-auto">
                    <li class="nav-item mt-4 mb-4">
                      <a class="link-outline" href="login.jsp"
                        ><i class="icon fas fa-sign-in-alt"></i>&nbsp;Login</a
                      >
                    </li>
                  </ul>
                </div>
              </div>
            </nav>
          </div>
        </header>

    <!-- *****Success Page***** -->
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
<table>
   <tr>
 <td> <div> <a href="claim" >Claim</a></div></td>
 <td>  <div><a href="renew" >Renew</a></div></td>
   </tr>
   </table>
   </c:forEach>  
   </table>  
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

  <!--
    Mirrored from site.codeglamour.com/html/18/enegix/registration_page.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 25 Nov 2018 12:57:48 GMT
  -->
</html>
