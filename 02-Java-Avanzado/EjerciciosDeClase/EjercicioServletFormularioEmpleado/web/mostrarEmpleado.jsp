
<%@page import="java.util.List"%>
<%@page import="logica.Empleado"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Lista Empleados</h1>
        <%
            List<Empleado> listaEmpleados = (List) request.getSession().getAttribute("listaEmpleados");

            for (Empleado emple : listaEmpleados) {

        %>
        
        <p><%= emple.toString() %></p>
        
        <%
            }
        %>

    </body>
</html>
