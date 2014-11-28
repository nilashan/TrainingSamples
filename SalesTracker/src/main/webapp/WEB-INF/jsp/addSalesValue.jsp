<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>    
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Sales Values</title>
</head>
<body>
	Read in: <a href="?Languages=en"/>English</a> [*] <a href="?Languages=sp"/>Spanish</a>
	<h1>Add Sales Values</h1>
	<form:form commandName="salesValues">
		<div>
			<div><spring:message code="sales.enter"/></div>
			<div>
				<form:input path="sales"/>
			</div>
			<div>
				<input type="submit" value="Save" />
			</div>
		</div>
	</form:form>
	from Session: ${addTarget.salesTargetValue}
</body>
</html>