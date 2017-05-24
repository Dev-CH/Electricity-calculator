
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Choosing Provider</title>

<link href="<c:url value="/resources/css/stylesheet.css"/>" rel="stylesheet" />
<link href="<c:url value="/resources/bootstrap/bootstrap.min.css" />" rel="stylesheet" />
</head>
<body class="background" background="<c:url value='/resources/img/abstract-ice.jpeg' />">
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12 header_bar">
				<div class="col-md-6 text-left">
					<a href="/Bill_Calculator/" class="nav_login">Home</a>
				</div>
				<div class="col-md-6 text-right">
					<a href="#" class="nav_login">log in</a>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-lg-12 text-center header">
				<h1>Select Your Provider</h1>
			</div>
		</div>
	</div>
	<div class="container-fluid text-center ">
		<div class="row top_margin">
			<a href="calculate.html?provider=BG">
				<div class="col-md-4 create_box expand">
					<div class="provider"><img class="provider_logo" src="<c:url value="/resources/img/britishGas.png"/>"></div>
				</div>
			</a>
			<a href="calculate.html?provider=SP">
				<div class="col-md-4 create_box expand">
					<div class="provider"><img class="provider_logo" src="<c:url value="/resources/img/scottishPower.png"/>"></div>
				</div>
			</a>
			<a href="calculate.html?provider=ED">
				<div class="col-md-4 create_box expand">
					<div class="provider"><img class="provider_logo" src="<c:url value="/resources/img/edfEnergy.png"/>"></div>
				</div>
			</a>
		</div>
		<div class="row top_margin">
			<a href="calculate.html?provider=NP">
				<div class="col-md-4 create_box expand">
					<div class="provider"><img class="provider_logo" src="<c:url value="/resources/img/npower.png"/>"></div>
				</div>
			</a>
			<a href="calculate.html?provider=SE">
				<div class="col-md-4 create_box expand">
					<div class="provider"><img class="provider_logo" src="<c:url value="/resources/img/southernElectric.png"/>"></div>
				</div>
			</a>
			<a href="calculate.html?provider=EO">
				<div class="col-md-4 create_box expand">
					<div class="provider"><img class="provider_logo" src="<c:url value="/resources/img/e-onEnergy.png"/>"></div>
				</div>
			</a>
		</div>
		<!-- 
		<a href="calculate.html?provider=BG"><button class="provider"> British Gas </button></a>
		<a href="calculate.html?provider=SP"><button class="provider"> Scotish Power </button></a>
		<a href="calculate.html?provider=ED"><button class="provider"> EDF </button></a>
		<a href="calculate.html?provider=NP"><button class="provider"> Npower </button></a>
		<a href="calculate.html?provider=SE"><button class="provider"> SSE </button></a>
		<a href="calculate.html?provider=EO"><button class="provider"> E.ON UK </button></a>
		 -->
	</div>
</body>
</html>