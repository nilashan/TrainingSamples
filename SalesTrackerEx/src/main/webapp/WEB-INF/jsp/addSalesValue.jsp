<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<title></title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- Le styles -->
<link href="assets/css/bootstrap.css" rel="stylesheet">
<style>
body {
	padding-top: 60px; /* 60px to make the container go all the way
      to the bottom of the topbar */
}
</style>
<link href="assets/css/bootstrap-responsive.css" rel="stylesheet">

<link rel="shortcut icon" href="assets/ico/favicon.ico">
<link rel="apple-touch-icon-precomposed" sizes="144x144"
	href="assets/ico/apple-touch-icon-144-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="114x114"
	href="assets/ico/apple-touch-icon-114-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="72x72"
	href="assets/ico/apple-touch-icon-72-precomposed.png">
<link rel="apple-touch-icon-precomposed"
	href="assets/ico/apple-touch-icon-57-precomposed.png">
<script src="assets/js/bootstrap.js"></script>
<script src="http://code.jquery.com/jquery-1.10.2.js"></script>
</head>
<body>
<div class="navbar navbar-fixed-top navbar-inverse">
		<div class="navbar-inner">
			<div class="container">
				<a class="brand" href="#"> Add Daily Sales </a>
				<ul class="nav">
				</ul>
			</div>
		</div>
	</div>
	<div class="container">
		<a class="btn" href="?language=en">English</a> || <a class="btn"
			href="?language=sp">Spanish</a>

	<h1>Add sales value</h1>

	<form:form commandName="salesValues">
		<div>
			<div>
				<spring:message code="sales.enter" />
			</div>
			<div>
				<form:input path="sales" />
				<form:select path="salesTypes" id="salesTypes" />
			</div>
			<div>
				<input type="submit" value="save" />
			</div>
		</div>

	</form:form>

	from Session : ${addTarget.salesTargetValue}
	<script type="text/javascript">
		$(document)
				.ready(

						function() {
							$
									.getJSON(
											'http://localhost:8080/SalesTracker/salesTypes.json',
											{
												ajax : 'true'
											},
											function(data) {
												var html = '<option value="">--select sales type-- </option>';
												var len = data.length;

												for (var i = 0; i < len; i++) {
													html += '<option value="'+ data[i].salesType+'">'
															+ data[i].salesType
															+ '</option>';
												}
												
												$('#salesTypes').html(html);
											})
						});
	</script>
</body>
</html>