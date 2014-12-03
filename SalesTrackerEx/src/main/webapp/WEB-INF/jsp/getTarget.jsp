<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Get Traget</title>
</head>
<body>
	<table>
		<tr>
			<th>ID</th>
			<th>TARGET</th>
		</tr>
		
		<c:forEach items="${targets}" var="target">
			<tr>
				<td>${target.id}</td>
				<td>${target.salesTargetValue}</td>
				<td>
					<table>
						<tr>
							<th>sales id</th>
							<th>sales value</th>
							<th>sales type</th>
						</tr>
						<c:forEach items="${target.sales}" var="salelist">
							<tr>
								<td>${salelist.id}</td>
								<td>${salelist.sales}</td>
								<td>${salelist.salesTypes}</td>
							</tr>
						</c:forEach>
					</table>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>