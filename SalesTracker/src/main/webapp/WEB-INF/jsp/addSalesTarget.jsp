<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style >

.errorText{color:#ff0000;

}
.errorBox{
color:#000000;
background-color:#ffEEEE;
margin:20px;
padding:10px;
border:3px solid #ff0000;
}
</style>
</head>
<body>
<form:form commandName="addTarget">
<form:errors path="*" cssClass="errorBox" element="div"/>
		<div>
			<div>add sales target</div>
			<div>
				<form:input path="salesTargetValue" cssErrorClass="errorText"/>
				<div><form:errors path="salesTargetValue" cssClass="errorText" /></div>
			</div>
			<div>
				<input type="submit" value="Save Sales Target" />
			</div>
		</div>
	</form:form>
</body>
</html>