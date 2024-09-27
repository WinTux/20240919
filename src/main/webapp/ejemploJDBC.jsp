<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <%-- JDBC, mvnrepository postgreSQL --%>
 <%
 	Class.forName("org.postgresql.Driver");
 	Connection con = DriverManager.getConnection("jdbc:postgresql://192.168.1.254:5432/UniversidadEducomser","super_user","123456Ax+");
 	Statement st = con.createStatement();
 	ResultSet rs = st.executeQuery("select * from pregrado.estudiante e;");
 	rs.next();
 %>
 
 <h3>Datos del estudiante</h3>
 <table border="1">
 	<tr>
 		<td>Matricula</td>
 		<td><%= rs.getInt(1) %></td>
 	</tr>
 	<tr>
 		<td>Nombre</td>
 		<td><%= rs.getString(2) %></td>
 	</tr>
 	<tr>
 		<td>Apellido</td>
 		<td><%= rs.getString(3) %></td>
 	</tr>
 </table>
 
 <table border="1">
 	<tr>
 		<td>Matricula</td>
 		<td>Nombre</td>
 		<td>Apellido</td>
 	</tr>
 	<%
 		while(rs.next()){
 			out.println(String.format("<tr><td>%d</td><td>%s</td><td>%s</td></tr>", rs.getInt(1), rs.getString(2),rs.getString(3)));
 		}
 	%>
 </table>
</body>
</html>