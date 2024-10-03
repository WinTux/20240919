<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="login_logout.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Videos</title>
</head>
<body>
	<%
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");// HTTP 1.1
	
		response.setHeader("Pragma", "no-cache");// Para el antigüo HTTP 1.0
		response.setHeader("Expires", "0");// Para el antigüo HTTP 1.0
	
	
		if(session.getAttribute("usuario") == null)
			response.sendRedirect("login_login.jsp");
	%>
	<h3>Acá se mostrarán los videos institucionales</h3>
</body>
</html>