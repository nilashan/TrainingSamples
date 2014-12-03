<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<title>Sales Target</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="assets/css/bootstrap.css" rel="stylesheet">
 <style>
      body { padding-top: 60px; /* 60px to make the container go all the way
      to the bottom of the topbar */ }
    </style>
    <link href="assets/css/bootstrap-responsive.css" rel="stylesheet">
     <link rel="shortcut icon" href="assets/ico/favicon.ico">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="assets/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="assets/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="assets/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="assets/ico/apple-touch-icon-57-precomposed.png">
<style>
.errorText {
	color: #ff0000;
}

.errorBox {
	color: #000000;
	background-color: #ffEEEE;
	margin: 20px;
	padding: 10px;
	border: 3px solid #ff0000
}
</style>


</head>
<body>
<div class="navbar navbar-fixed-top navbar-inverse">
      <div class="navbar-inner">
        <div class="container">
          <a class="brand" href="#">
            Add Goal
          </a>
          <ul class="nav">
          </ul>
        </div>
      </div>
    </div>
    <div class="container">
      <div>
        <h1>
          Add Sales Target
        </h1>
        <p>
          Add sales target for the day
          <br>
          &nbsp;
        </p>
      </div>
	<form:form commandName="addTarget">
		<%-- <form:errors path="*" cssClass="errorBox" element="div" /> --%>
		<div>
			<div>add sales Target</div>
			<div>
				<form:input path="salesTargetValue" cssErrorClass="errorText" />
				<div><form:errors path="salesTargetValue" cssClass="errorText"/> </div>
			</div>
			<div>
				<input type="submit" value="Save Sales Target">
			</div>
		</div>



	</form:form>
</body>
</html>