<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<body>
<label >User Name : </label> ${userDetails.userName}
<label >subject : </label> ${userDetails.subject}
<label >Email : </label> ${userDetails.communicationDTO.email}
<label >Country code: </label> ${userDetails.communicationDTO.phone.code}
<label >Phone Number: </label> ${userDetails.communicationDTO.phone.mobile}
</body>
</html>