<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@ page errorPage="ErrorPage.jsp" %>

<!DOCTYPE html>
<html lang="en">
  
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
      <header class="main-header">
          <div class="main_navbar">
            <!-- MAIN NAVBAR -->
            <nav class="navbar navbar-expand-lg navbar-dark">
              <div class="container">
                <a class="navbar-brand logo-sticky" href="index.jsp"
                  >Fahrzeug Insurance</a
                >
                </button>
                <div class="collapse navbar-collapse" id="navbarNav">
                  <ul class="navbar-nav mr-auto">
                    <li class="nav-item">
                      <a href="#" class="nav-link">  </a>
                    </li>
                  </ul>
                </div>
              </div>
            </nav>
          </div>
        </header>

    <!-- ***** login section start ***** -->
    <div id="member-login">
      <div class="container">
        <div class="login_content p-5 bg-white">
          <div class="section-heading">
            <h1 class="text-capitalize">Create your Account</h1>
          </div>
          <form action="registerProcess" method="post">
         <input
              type="text"
              id="username"
              name="fName"
              placeholder="Enter Your First Name"
              pattern=[A-Za-z]+
        
			 title="Enter Valid Name"
              required  
            />
            <input
            type="text"
            id="username"
            name="lName"
            placeholder="Enter Your Last Name"
               pattern=[A-Za-z]+
            maxlength="15"
            	 title="Enter Valid Name"
            required            
          />
            <input
              type="email"
              name="email"
              placeholder="Enter Your Email Id"
              title="e.g. abc@gmail.com,xyz@yahoo.com etc."
              required
            />

            <input
              type="tel"
              name="phone"
              placeholder="Enter Your Contact Number"
             pattern="[6-9]{1}[0-9]{9}" 
             title="Please enter a valid 10 digit mobile number" 
              required
            />
            <input
              type="textarea"  rows="4" 
              name="address"
              placeholder="Enter Your Address"
              maxlength="150"
              title="Enter proper Address"
              required
            />

             <input
            type="text"
            id="username"
            name="username"
            placeholder="Enter User Name"
            title="eg. Insurance12"
             pattern="[A-Za-z0-9]+"
          
            required
          />

            <input
              type="password"
              name="password"
              placeholder="Enter Your Password"
              pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"
              title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters"  
              class="form-control" 
              required
            />
            
    
          
			<input type="submit" value="register"  class="link-outline">
           
          </form>
          <form action="login">
       	<input type="submit" value=" Already have an account? Login" class="link-outline"> 
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