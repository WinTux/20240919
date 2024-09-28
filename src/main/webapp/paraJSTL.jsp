<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%-- Puede ser uri="http://java.sun.com/jsp/jstl/core" --%>
<%@ page import="com.pepe.p20240919.Modelos.*, java.util.Arrays, java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:out value="Hola desde c:out"/><%-- / --%>
	<br/>
	<c:set scope="session" value="${1234}" var="userid"></c:set>
	<c:import url="https://www.google.com"></c:import>
	
	<h4>${userid}</h4>
	
	<%
		Estudiante est = new Estudiante(123,"Pepe","Perales");
		request.setAttribute("estudiante", est);
		
		List<Estudiante> ests = Arrays.asList(new Estudiante(1,"Pepe","Perales"),new Estudiante(2,"Ana","Sosa"),new Estudiante(3,"Samantha","Barrios"));
		request.setAttribute("estudiantes", ests);
	%>
	
	<h3>Nombre completo: ${estudiante.nombre} ${estudiante.apellido}</h3>
	
	<c:forEach items="${estudiantes}" var="es">
		${es.nombre} ${es.apellido} <br/>
	</c:forEach>
</body>
</html>