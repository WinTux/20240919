<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="func" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ejemplos sobre funciones</title>
</head>
<body>
	<h4>Para obtener la longitud</h4>
	<c:set var="cadena" value="Esta es una cadena cualquiera"/>
	Longitud: ${func:length(cadena)}<br/>
	<h4>Para realizar un split</h4>
	<c:forEach items="${func:split(cadena,' ')}" var="elem">
		${elem} <br>
	</c:forEach>
	<h4>Para hallar el indice de una subcadena</h4>
	Indice: ${func:indexOf(cadena, "na ")}
	<h4>Para evaluar si una subcadena esta dentro de otra cadena</h4>
	Esta en cadena: ${func:contains(cadena,"todo")}<br>
	Esta en cadena: ${func:contains(cadena,"ade")}<br>
	<c:if test='${func:contains(cadena,"todo")}'>
		Efectivamente la subcadena 'todo' esta contenida en la cadena principal.
	</c:if>
	<c:if test='${func:contains(cadena,"ade")}'>
		Efectivamente la subcadena 'ade' esta contenida en la cadena principal.
	</c:if>
	<h4>Para verificar si termina en una substring dada</h4>
	<c:if test='${func:endsWith(cadena,"ade")}'>
		Efectivamente la subcadena 'ade' esta al final de la cadena principal.
	</c:if>
	<h4>Para escribir todo en minusculas y mayusculas</h4>
	Minusculas: ${func:toLowerCase(cadena)}<br>
	Mayusculas: ${func:toUpperCase(cadena)}<br>
</body>
</html>