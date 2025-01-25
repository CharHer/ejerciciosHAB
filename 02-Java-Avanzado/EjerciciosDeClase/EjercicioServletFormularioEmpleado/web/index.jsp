

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio Servlet</title>
    </head>
    <body>
        <h1>Formulario para Empleados</h1>
        <form action="empleadoSv" method="POST">
            <p><label> Nombre: </label><input  type="text" name="nombre"></p>
            <p><label> Apellido: </label><input  type="text" name="apellido"></p>
            <p><label>Direccion</label><input  type="text" name="direccion"></p>
            <p><label> Teléfono: </label><input  type="text" name="telefono"></p>
            <button type="submit"> Enviar </button>
        </form>
        
        <h1>Ver Empleados</h1>
        <form action="empleadoSv" method="GET">
            <button type="submit"> Ver Empleados </button>
        </form>
        
    </body>
</html>
