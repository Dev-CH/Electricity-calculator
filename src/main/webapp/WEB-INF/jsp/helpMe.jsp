
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="<c:url value="/resources/css/stylesheet.css"/>" rel="stylesheet" />
<link href="<c:url value="/resources/bootstrap/bootstrap.min.css" />" rel="stylesheet" />
<title>Help Me</title>
</head>
<body class="background" background="<c:url value='/resources/img/abstract-ice.jpeg' />">
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12 header_bar">
				<div class="col-md-6 text-left">
					<a href="/Bill_Calculator/" class="nav_login">Log Out</a>
				</div>
				<div class="col-md-6 text-right">
					<a href="#" class="nav_login"></a>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-lg-12 text-center">
				<h1>FAQ</h1>
			</div>
		</div>
	</div>
	<div class="col-md-12 create_box">
		<ul class=" text-left ">
			<li>
				<strong>Where do I start?</strong><br>
					<p><em>The idea of the Bill Calculator is to help you accurately calculate your household electricity bills. Simply start by choosing what products you own, how many you own and how much you use them.</em></p>
			</li>
			<li>
				<strong>How do you know how much energy something uses?</strong><br>
					<p><em>The energy used which is assosiated with every product has been determined by collecting an average from the top ten most popular* products on the market</em></p>
			</li>
			<li>
				<strong>What energy tarrif do you use to calculate the cost?</strong>
					<p><em>An average price has been determined for the entirety of the UK by provider. The tarrif used to get this average was the Standard Tarrif.</em></p>
			</li>
			<li>
				<strong>How much wood would a wood chuck chuck if a wood chuck could chuck wood?</strong>
					<p><em>A wood chuck would chuck as much wood as a wood chuck could chuck if a wood chuck could chuck wood.</em></p>
			</li>
		</ul>
	
		<a href="/Bill_Calculator/selection.html"><button class="btn login-button">Back</button></a>
	</div>
	<div class="row">
			<div class="col-sm-4 col-sm-offset-4 light_box">
				<p>How much wood would a wood chuck chuck if a wood chuck could chuck wood?</p>
			</div>
		</div>
	
</body>
</html>