
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
	<%@ page errorPage="Errorpage.jsp" %>
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
  </head>
  <body>
      <header class="main-header">
          <div class="main_navbar">
            <!-- MAIN NAVBAR -->
            <nav class="navbar navbar-expand-lg navbar-dark">
              <div class="container">
                <a class="navbar-brand logo-sticky" href="index.html"
                  >Fahrzeug</a
                >
                  <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarNav">
                  <ul class="navbar-nav mr-auto">
                    <li class="nav-item">
                      <a href="index.html" class="nav-link">Home</a>
                    </li>
                    <li class="nav-item dropdown">
                      <a
                        href="#"
                        class="nav-link dropdown-toggle"
                        data-toggle="dropdown"
                        >Insurance</a
                      >
                      <div class="dropdown-menu">
                        <a href="BuyInsurance.html" class="dropdown-item"
                          >Buy Insurance</a
                        >
                        <a href="RenewInsurance.html" class="dropdown-item"
                          >Renew Insurance</a
                        >
                        <a href="ClaimInsurance.html" class="dropdown-item"
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
                     
                      <form action="logout">
       	<input type="submit" value=" Logout" class="link-outline"> 
       </form>
                    </li>
                  </ul>
                </div>
              </div>
            </nav>
          </div>
        </header>
   
    <!-- ***** Premium Calculation ***** -->
    <div id="member-login">
      <div class="container">
        <div class="login_content p-5 bg-white">
          <div class="section-heading">
            <h1 class="text-capitalize">Calculate Premium Estimation</h1>
          </div>
          <form action="VehicleRegister" >
            <select class="custom-select custom-select-sm mb-3"  name="user_vehicle_type">
              <option selected>Select Vehicle Type</option>
              <option value="2W">2-Wheeler</option>
              <option value="4W">4-Wheeler</option>
            </select>
            
            <select class="custom-select custom-select-sm mb-3" name="user_vehicle_company">
            <option selected>Select Company</option>
		<c:forEach var="r" items="${company_list}">
		   
 		<option value="${r}">${r}</option>  
  		 </c:forEach>
  		 </select>
  		 
  		<select class="custom-select custom-select-sm mb-3" name="user_vehicle_model">
		<c:forEach var="m" items="${model_list}">  
		<option selected> Vehicle Model</option> 
 		<option value="${m}">${m}</option>  
  		 </c:forEach>
  		 </select>
  		 
  		 <select class="custom-select custom-select-sm mb-3" name="user_zone">
  		 <option selected> Zone/Location</option>
		<option value="1">ZONE A-Ahmedabad, Bangalore, Chennai,  Hyderabad , Kolkata, Mumbai, New Delhi and Pune</option>
		<option value="2">ZONE B-Rest of India</option>
		</select>
    
    <select class="custom-select custom-select-sm mb-3" name="policy">
    	<option selected>	Policy Type</option>
	<option value="3PL">Thrid Party Liability Policy</option>
	<option value="COMP">Comprehensive Policy</option>
  </select>
  
  <input
              type="text"
              name="purchase_date" 
              placeholder="Purchase Date" 
              class="textbox-n"
              type="text"
              onfocus="(this.type='date')"
              onblur="(this.type='text')"
              required
            />

<input type="text" name="user_vehicle_reg_no"  placeholder="Enter Proper Vehicle Registration Number" 
pattern="[A-Z]{2}[0-9]{2}[A-Z]{2}[0-9]{4}"
title="Enter valid Vehicle Registration Number(e. MH04VH9800)"
required />	

<input type="text" name="user_vehicle_chasis_no"    placeholder="Vehicle Chasis Number"
pattern="[0-9]{7}"
title="Enter valid 6 digit Chasis Number"
 required />	
 
<input type="text" name="user_vehicle_engine_no"    placeholder="Vehicle Engine Number" 
pattern="[0-9]{8}"
title="Enter 8 digit Engine Number"
required />	


<input type="hidden" name="user_id" value="${user}">

           <div id="submit"><input type="submit"  Value="Submit" class="link-outline"  />

          </form>
        </div>
      </div>
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

  <!--
    Mirrored from site.codeglamour.com/html/18/enegix/registration_page.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 25 Nov 2018 12:57:48 GMT
  -->
</html>
