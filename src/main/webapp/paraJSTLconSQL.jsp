<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sql" uri="jakarta.tags.sql" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%-- Puede ser uri="http://java.sun.com/jsp/jstl/sql" --%>
<%@ page import="java.util.List" %>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<body>
	<sql:setDataSource var="db" driver="org.postgresql.Driver"
		url="jdbc:postgresql://192.168.1.254:5432/UniversidadEducomser"
		user="super_user" password="123456Ax+"/>
		
	<h3>Ejemplo de conexión a la base de datos Universidad Educomser</h3>
	
	<sql:query var="rs" dataSource="${db}">
		select * from pregrado.estudiante
	</sql:query>
	
	<c:forEach items="${rs.rows}" var="est">
		<c:out value="${est.matricula}"></c:out>
		<c:out value="${est.nombre}"></c:out>
		<c:out value="${est.apellido}"></c:out>
		<br>
	</c:forEach>
</body>
</html>