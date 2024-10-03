<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Archivos</title>
</head>
<body>
	<form action="subida" method="post" enctype="multipart/form-data">
		<input type="file" name="archivo" ><br><!-- multiple -->
		<input type="submit" value="Subir archivo">
	</form>
</body>
</html>