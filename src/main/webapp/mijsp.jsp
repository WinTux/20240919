<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date, java.math.*"
    errorPage="tratamientoDeError.jsp" %>
    <%-- Directiva --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ejemplo JSP</title>
</head>
<body bgcolor="yellow">
	<%-- Scriptlet --%>
	<% 
		String nombre = request.getParameter("usuario");
		contador = 45;
		int cantidad = 0;
		out.println(nombre+" "+(contador/cantidad));
	%>
	
	<%-- Declaration --%>
	<%! int contador; %>
	
	<%-- Expresión --%>
	<%= contador + " bla " %>
</body>
</html>