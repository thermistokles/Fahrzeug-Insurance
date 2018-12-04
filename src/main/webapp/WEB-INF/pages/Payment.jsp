<%@ page errorPage="Errorpage.jsp" %> <%@ page language="java"
contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
isELIgnored="false"%> <%@ taglib uri="http://www.springframework.org/tags/form"
prefix="form"%> <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
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
    <!-- Paradise Slider Main Style Sheet -->
    <link
      href="css/full_width_animated_layers_002.css"
      rel="stylesheet"
      media="all"
    />

    
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
    <title>Payment Page</title>
  </head>
  <body bgcolor=#F5EEF8>
    <center >
      <div class="card text-white bg-secondary " style="max-width: 36rem;height: 80%;margin-top: 4em">
        <div class="card-header"><h3>Your Ticket number is ${ticketNo }</h3><br>
        <h3>Your Policy number is ${pid }</h3>
        </h1></div>
        <div class="card-body ">
          <h5 class="card-title">Kindly note down the above policy number.</h5>
          <p class="card-text">
               An agent will be sent to your address to verify your ticket.
               The verification process will require the following Documents:
               <font color="blue">
               <ul>
<li><h6>Aadhar card</h6></li>
<li><h6>Insurance policy</h6></li>
<li><h6>Insured vehicle</h6></li>
</ul></font>
Please keep the original documents as well as a copy of each document as it is necessary for verification process.
          </p>
        </div>
        <a href="logout" class="btn btn-info" role="button">Logout</a>
      </div>
    </center>
  </body>
</html>
