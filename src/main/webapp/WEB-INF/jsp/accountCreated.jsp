<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="<c:url value="/resources/css/stylesheet.css"/>" rel="stylesheet" />
<link href="<c:url value="/resources/bootstrap/bootstrap.min.css" />" rel="stylesheet" />
<title>Account Created</title>
</head>
<body class="background" background="<c:url value='/resources/img/abstract-ice.jpeg' />">
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12 header_bar">
				<div class="col-md-6 text-left">
					<a href="/Bill_Calculator/" class="nav_login">Home</a>
				</div>
				<div class="col-md-6 text-right">
					<a href="#" class="nav_login"></a>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-lg-12 text-center header">
				<h1>Congratulations ${name}!</h1>
				<h3>you can now start using the Electricity Calculator!</h3>
			</div>
		</div>
	</div>
	<div class="col-md-12 text-center celebrate_box">
		<a href="/Bill_Calculator/"><button class="btn login-button">Get Started!</button></a>
	</div>
	
</body>
</html>