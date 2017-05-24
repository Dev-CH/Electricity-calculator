
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Products</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>


<link href="<c:url value="/resources/css/stylesheet.css"/>" rel="stylesheet" />
<script src="<c:url value="/resources/js/populateDropdown.js" />"></script>
<script src="<c:url value="/resources/js/main.js" />"></script>

<!--  dependancies for bootstrap   -->
<link href="<c:url value="/resources/bootstrap/bootstrap.min.css" />" rel="stylesheet" />
<link href="<c:url value="/resources/bootstrap/bootstrap-select.min.css" />" rel="stylesheet" />
<script src="<c:url value="/resources/bootstrap/bootstrap.min.js" />"></script>
<script src="<c:url value="/resources/bootstrap/bootstrap-select.min.js" />"></script>
<script>
$(document).ready(function(){
	if((${listExists}) == true) {
		$("#createdList").addClass("in");
	}
});
</script>
</head>
<body class="background" background="<c:url value='/resources/img/abstract-ice.jpeg' />">
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12 header_bar">
				<div class="col-md-6 text-left">
					<a href="/Bill_Calculator/" class="nav_login">Log Out</a>
				</div>
				<div class="col-md-6 text-right">
					<a href="/Bill_Calculator/help.html" class="nav_login">Help</a>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-lg-12 text-center header">
				<h1>Electricity Calculator</h1>
				<p class="top_margin">Begin by constructing a list of everything you have in your house, select how many you own and how long you use it for, click <a href="/Bill_Calculator/help.html">here</a> to see FAQ's.</p>
			</div>
		</div>
		<div class="row">
			 <div class="col-md-10 col-md-offset-1 ">
				<form:form commandName="product" class="form-horizontal" role="form">
					<div class="row">
						<div class="col-md-8 col-md-offset-2">
							<form:select id="data" path ="name" class="selectpicker form-control dropdown_box" data-live-search="true" />
							<div class="marin20_error text-center"><form:errors class="dropdown_error" path="name" /></div>
						</div>
					</div>
					<div class="row text-center">
						<div class="col-md-4 col-md-offset-2 top_margin">
							<form:label path="amountOwned" class="">Amount Owned</form:label>
							<br>
							<form:input path="amountOwned" class="input_box" />
							<div class= "row error">
								<form:errors class="" path="amountOwned"><spring:message code="product.amountOwned.error" /></form:errors>
							</div> 
						</div>
						<div class="col-md-4 top_margin ">
							<form:label path="hoursUsed" class="">Hours Used</form:label>
							<br>
							<form:input path="hoursUsed" class="input_box"/>
							<div class="row text-center error">
								<form:errors class="" path="hoursUsed"></form:errors>
							</div>
						</div>
					</div>
					<div class="row">						
						<div class="col-sm-12 text-center">
							<form:button type="submit" class="btn login-button" >Add Product!</form:button>
						</div>
					</div>
				</form:form>
			</div> 
		</div>
	</div>
	<div class="container-fluid">
		<div class="row">
			<div class="panel-group col-md-8 col-md-offset-2 top_margin">
				<div class="panel panel-default ">
					<div class="panel-heading" id="panel-header">
						<h4 class="panel-title  text-center">
							<a data-toggle="collapse" href="#createdList">Collapsable Tab</a>
						</h4>
					</div>
					<div id="createdList" class="panel-collapse collapse">
						<table id="userList" class="table">
							<tr class="text-center">
								<th class="table_header">Product</th> 
								<th class="table_header">Amount Owned</th>
								<th class="table_header">Used(hours)</th>
								<th class="table_header"></th>
							</tr>
							<c:forEach items="${accountReports}" var="accountReport">
							<tr class="list">
								<td class="">
									${accountReport.productName}
								</td>
								<td class="">
									${accountReport.productOwned}
								</td>
								<td class="">
									${accountReport.productUsed}
								</td>
								<td class="">
							 		<a href="/Bill_Calculator/delete.html?id=${accountReport.productId }" class="btnDelete"><img class="delete_button" src="<c:url value="/resources/img/delete.png"/>"/></a>
								</td>
							</tr>
							</c:forEach>
						</table>
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-md-8 col-md-offset-2 text-center">
				<a href="/Bill_Calculator/provider.html"><button class="btn login-button">Continue</button></a>
			</div>
		</div>
 	</div>
	
<footer class="top_margin">
<p></p>
</footer>	
</body>
</html>	