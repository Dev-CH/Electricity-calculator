
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

<title>Create an Account</title>
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
				<h1>Electricity Calculator</h1>
			</div>
		</div>
	</div>
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-4 col-md-offset-4 create_box">
				<form:form modelAttribute="account">
					<div class="row">
						<div class="col-md-10 col-md-offset-1 ">
								<form:label path="firstName" class="placeholder">First Name</form:label>
								<form:input class="create_field" path="firstName" />						
								<form:errors class="marin20_error" path="firstName" />
						</div>
					</div>
					<div class="row">
						<div class="col-md-10 col-md-offset-1 ">
								<form:label path="surname" class="placeholder">Last Name</form:label>
								<form:input class="create_field" path="surname" />						
								<form:errors class="marin20_error"  path="surname" />
						</div>
					</div>
					<div class="row">
						<div class="col-md-10 col-md-offset-1 ">
								<form:label path="userName" class="placeholder">Username</form:label>
								<form:input class="create_field" path="userName" />						
								<form:errors class="marin20_error" path="userName" />
						</div>
					</div>
					<div class="row">
						<div class="col-md-10 col-md-offset-1 ">
								<form:label path="password" class="placeholder">Password</form:label>
								<form:input class="create_field" path="password" type="password" />						
								<form:errors class="marin20_error" path="password" />
						</div>
					</div>			
					<div class="row">						
						<div class="col-sm-12 text-center">
							<div><form:button type="submit" class="btn login-button" >Create Account!</form:button></div>
						</div>
					</div>
				</form:form>
			</div>
		</div>
		<div class="row">
			<div class="col-md-4 col-md-offset-4 light_box">
				<p>Just fill out the simple form so we can get you started!</p>
			</div>
		</div>
	</div>
</body>
</html>