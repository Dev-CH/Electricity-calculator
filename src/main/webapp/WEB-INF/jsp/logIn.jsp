
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link href="<c:url value="/resources/css/stylesheet.css"/>" rel="stylesheet" />
<link href="<c:url value="/resources/bootstrap/bootstrap.min.css" />" rel="stylesheet" />

<title>Log in</title>
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
				<h1>Energy Calculator</h1>
			</div>
		</div>
	</div>

	<div class="container-fluid">
		<div class="row">
			<div class="col-sm-4 col-sm-offset-4 login_box">
				<form:form commandName="loginAttempt">
					<div class="row">
						<div class="col-sm-6 col-sm-offset-3 login_field">
							<div><form:input  class="form-controll" path="userName" placeholder="User Name"/></div>
						</div>
						<div class="col-sm-6 col-sm-offset-3 password_field">
							<div class=""><form:input class="form-controll" path="password" placeholder="Password" type="password" /></div>
						</div>
					</div>
					<div class="row">						
						<div class="col-sm-12 text-center">
							<div><form:button type="submit" class="btn login-button">Log In</form:button></div>
							<p class="error">${error}</p>
						</div>
					</div>
				</form:form>
			</div>
		</div>
		<div class="row">
			<div class="col-sm-4 col-sm-offset-4 light_box">
				<p>Not been here before? <a href="/Bill_Calculator/createAccount.html">create a new account!</a></p>
			</div>
		</div>
	</div>
</body>
</html>