<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form class="contact_form" method="post" action="control" runat="server">
<div>
<ul>
<li><h2>Registrar Empleados</h2><span class="required_notification"></span>
</li>
<li><label for="name">Codigo:</label><input type="text" name="codigo"
        placeholder="Codigo" required  /></li>
        
 <li><label for="name">Cedula:</label><input type="text" name="cedula"
        placeholder="Cedula" required  /></li>
        
        
 <li><label for="name">Fecha Nacimiento:</label><input type="text" id="fecha" name="fechaNacimiento" > </li>
 
 <li><label for="name">Fecha Ingreso:</label><input type="text" id="fecha" name="fechaIngreso" > </li>
 
 <li><label for="name">Fecha Retiro:</label><input type="text" id="fecha" name="fechaRetiro" > </li>
 
 <input type="button" 
value="Registrar" 
id="boton4"
name="boton4" 
onclick= "location.href = 'registrar.jsp'";/>

<input type="button" 
value="volver" 
id="boton5"
name="boton5" 
onclick= "location.href = 'index.jsp'";/>
 
 
 
 </ul>
 </div>
</body>
</html>