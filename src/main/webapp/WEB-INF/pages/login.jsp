<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
<%@ page errorPage="ErrorPage.jsp" %>
<%-- <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
<h1>Login</h1>
	<form:form id="loginForm" modelAttribute="login" action="loginProcess"
		method="post">
		<table align="center">
			<tr>
				<td><form:label path="username">Username: </form:label></td>
				<td><form:input path="username" name="username" id="username" /></td>
			</tr>
			<tr>
				<td><form:label path="password">Password:</form:label></td>
				<td><form:password path="password" name="password"
						id="password" /></td>
			</tr>
			<tr>
				<td></td>
				<td align="left"><form:button id="login" name="login">Login</form:button></td>
			</tr>
			<tr>
				<td>${message }</td>
				<td><a href="home.jsp">Home</a></td>
				<td><a href="forgotpass.jsp">Forgot Password?</a></td>
			</tr>
		</table>
	</form:form>

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
      Enegix - Login Business Multipurpose Bootstrap 4 Html Template
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
                        <a href="login.jsp" class="dropdown-item"
                          >Calculate Premium</a
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
                      <a class="link-outline" href="login_page.html"
                        ><i class="icon fas fa-sign-in-alt"></i>&nbsp;Login</a
                      >
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
          <div class="section-heading"><h1>Members login</h1></div>
          <form id="loginForm" modelAttribute="login" action="loginProcess"
		method="post">

            <input type="text" name="username" id="username" placeholder="Username" />
            <input
              type="password"
              name="password"
              id="password"
              placeholder="Password"
              title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters"
            />

            <input type="submit" value=" Login" class="link-outline"> 
          </form>
          </br>
          <form action="register">
         <p>  Don't have an account?Sign Up</p>
       	<input type="submit" value=" Register" class="link-outline"> 
       </form>

			<td><form action="ForgotPass">
       			<input type="submit" value="Forgot Password"> 
       			</form></td>
      
          <p class="mt-3 text-center login_content form-check-label">
            <a href="Forgot.html">Forgot Password?</a>
          </p>
          <p class="mt-3 text-center login_content form-check-label">
            <a href="Reset.html">Reset Password?</a>
          </p>
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
</html>
