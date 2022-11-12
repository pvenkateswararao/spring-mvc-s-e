<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>details</h1>
<div align="center">
	Name: ${transaction.name}
	Card: ${transaction.card.firstNumber}
	Currency: ${transaction.bankCurrency.currency}
	
</div>
</body>
</html>