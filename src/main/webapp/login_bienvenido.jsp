<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="login_logout.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<title>Bienvenido</title>
</head>
<body>
	<%
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");// HTTP 1.1
		
		response.setHeader("Pragma", "no-cache");// Para el antigüo HTTP 1.0
		response.setHeader("Expires", "0");// Para el antigüo HTTP 1.0
		
		if(session.getAttribute("usuario") == null)
			response.sendRedirect("login_login.jsp");
	%>
	<div class="display-1">
		Bienvenido ${usuario} !!
	</div>
	<p>Esta es la página de bienvenida promedio.</p>
	<a href="login_videos.jsp" class="btn btn-blue">Ir a videos</a>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>