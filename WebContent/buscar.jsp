<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form class="contact_form" method="get" action="recibir.jsp" id="contact_form">

<li><label for="name">Código:</label><input type="text"
        placeholder="Ingresar codigo" required  /></li>
        
<input type="button"
value="Buscar"
id="boton3"
name="boton3"
onclick= "location.href = 'registrar.jsp'";/>        
</form>
</body>
</html>