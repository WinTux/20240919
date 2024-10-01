<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="bs" uri="WEB-INF/misTags.tld" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Ejemplos SimpleTags</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
	<div class="display-5">Ejemplo de etiqueta card</div>
	<p>Este pequeño ejemplo nos muestra la creación de un card bajo el uso de una etiqueta simple</p>
	<bs:card/>
	<p>Con apertura y cierre</p>
	<bs:card2>Este es el cuerpo de card</bs:card2>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>