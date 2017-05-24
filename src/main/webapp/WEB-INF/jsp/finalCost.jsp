
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Final Cost</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<link href="<c:url value="/resources/css/stylesheet.css"/>" rel="stylesheet" />

<!--  dependancies for bootstrap   -->
<link href="<c:url value="/resources/bootstrap/bootstrap.min.css" />" rel="stylesheet" />
<script src="<c:url value="/resources/bootstrap/bootstrap.min.js" />"></script>
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
				<h3>Your estimated monthly cost would be: </h3>
				<p><em>This cost is including the Standing Charge from the provider selected.</em></p>
			</div>
		</div>
		<div class="row">
			<div class="col-md-8 col-md-offset-2 text-center">
				<h1>£${finalCost}</h1>		
			</div>
		</div>	
		<div class="row top_margin">
			<div class="col-md-4 col-md-offset-2 create_box">
				<a href="/Bill_Calculator/provider.html"><button class="btn button">Choose Another Provider</button></a>
			</div>
			<div class="col-md-4 create_box">
				<a href="/Bill_Calculator/selection.html"><button class="btn button">Edit Your List</button></a>
			</div>
		</div>
	</div>
	<div class="container-fluid">
		<div class="row">
			<div class="panel-group col-md-8 col-md-offset-2 top_margin">
				<div class="panel panel-default ">
				<div  class="panel-heading custom-panel text-center" id="panel-header">
					<h4>
						<a data-toggle="collapse" href="#createdList" class="custom-panel-text">View Your Monthly Cost Breakdown</a>
					</h4>
				</div>
					<div id="createdList" class="panel-collapse collapse">
						<table id="userList" class="table">
							<tr class="text-center">
								<th class="table_header">Product</th> 
								<th class="table_header">Hours Used Per Day</th>
								<th class="table_header">Energy Used Per Month</th>
								<th class="table_header">Monthly Running Cost</th>
							</tr>
							<c:forEach items="${accountReports}" var="accountReport">
							<tr class="list">
								<td class="">
									${accountReport.productName}
								</td>
								<td class="">
									${accountReport.productUsed} hours
								</td>
								<td class="">
									${accountReport.monthlyUseage} kW
								</td>
								<td class="">
									£${accountReport.costBreakdown}
								</td>
							</tr>
							</c:forEach>
						</table>
					</div>
				</div>
			</div>
		</div>
 	</div>
</body>
</html>