<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ooppps</title>
</head>
<body>
	<h1>¡Oh vaya!</h1>
	<h3>Ocurrio un error!!</h3>
	<p><%= exception.getMessage() %></p>
	<p>Contactese con soporte tecnico (tec@pepe.com)</p>
</body>
</html>