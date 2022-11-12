<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
<div align="center">
<form:form action="showDetails" method="get" modelAttribute="transaction">
	<label for="userName">User Name : </label>
	<form:input  id="userName" path="name"/>
	<label for="card">Card Number : </label>
	<form:input  id="card" path="card"/>
	<br/>
	<label for="bankCurrency">Currency : </label>
	<form:input  id="bankCurrency" path="bankCurrency"/>
	<br/>
	<button type="submit">Submit</button>
</form:form>
</div>

</body>
</html>