<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<body>
<div align="center">
<form:form action="process-input-form-entity" method="get" modelAttribute="userDetails">
	<label for="userName">User Name : </label>
	<form:input  id="userName" path="userName"/>
	<form:errors path="userName"></form:errors>
	<br/>
	<label for="subject">subject : </label>
	<form:input  id="subject" path="subject"/>
	<form:errors path="subject"></form:errors>
	<br/>
	<label for="email">Email : </label>
	<form:input  id="email" path="communicationDTO.email"/>
	<br/>
	<label for="phone">Phone : </label>
	<form:input  id="phone" path="communicationDTO.phone"/>
	<br/>
	
	<label for="age">age : </label>
	<form:input  id="age" path="age"/>
	<form:errors path="age"></form:errors>
	<br/>
	<button type="submit">Submit</button>
	
</form:form>
</div>
</body>
</html>