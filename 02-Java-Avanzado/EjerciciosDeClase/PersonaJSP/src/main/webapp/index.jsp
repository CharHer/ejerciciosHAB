
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.hackaboss.logica.Persona"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario de Personas</title>
        <!-- estilo de la web-->    
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    </head>
    <body> 
        <%
            String usu = (String) request.getSession().getAttribute("email");
            if (usu != null) {

        %>
        <p style="float: right" clas="m-4">Bienvenido <%=usu%></p>
        <div class="container mt-4">
        <h1>Formulario alta de personas</h1>
        <form action="PersonaSv" method="POST">
            
        <div class="form-group">
                <label for="nombre">Nombre:</label>
                <input type="text" class="form-control" id="nombre" name="nombre">
         </div>  
        
            <div class="form-group">
                 <label for="apellido">Apellido:</label>
                <input type="text" class="form-control" id="apellido" name="apellido">
            </div> 
        
            <div class="form-group">
                <label for="nombre">Teléfono:</label>
                <input type="text" class="form-control" id="telefono" name="telefono">
            </div>           
            
        <button type="submit" class="btn btn-primary">Enviar</button>
        
        </form>
        
        <!-- Búsqueda-->
        <h1 class="mt-4">Búsqueda</h1>
        <form action="PersonaSv" method="GET">
             <div class="form-group">
                 <label for="busquedaApellido">Buscar por Apellido:</label>
                <input type="text" class="form-control" id="busquedaApellido" name="busquedaApellido">
            </div> 
            
          <button type="submit" class="btn btn-primary">Buscar</button>  
        </form>
        
         <!-- Resultados de la búsqueda-->
         <div class="results-table mt-4">
             
             <h3 >Resultados</h3>
             <table class="table">
                 <thead>
                     <tr>
                         <th>Nombre</th>
                         <th>Apellido</th>
                         <th>Telefono</th>
                         <th>Acción</th>
                     </tr>    
                 </thead>
                 <tbody>
                     <% 
                         //traer la lista de Personas
                        List<Persona> listaPersonas = (List) request.getSession().getAttribute("listaPersonas");
                        if (listaPersonas!=null) { 
                        
                        for (Persona pers:listaPersonas) { %>
                            <tr>
                                <td><%=pers.getNombre()%> </td>
                                <td><%=pers.getApellido()%> </td>
                                <td><%=pers.getTelefono()%> </td>
                                <td  style="display: flex; width: 230px;"> 
                                      <form name="eliminar" action="EliminarPersonaSv" method="POST"> <!-- esto es para mandar el codigo al servlet -->
                                                            <button type="submit" class="btn btn-primary btn-user btn-block" style="background-color:red; margin-right: 5px; "> 
                                                              <i class="fas fa-trash-alt"></i>Eliminar</button>
                                          <input type="hidden" name="id_persona" value="<%=pers.getId()%>"> <!-- esto es para mandar el codigo al servlet -->
                                                </form>
                                                
                                                   <form name="editar" action="EditarPersonaSv" method="GET"> <!-- esto es para mandar el codigo al servlet -->
                                                            <button type="submit" class="btn btn-primary btn-user btn-block"; style="margin-left: 5px;"> 
                                                              <i class="fas fa-pencil-alt"></i>Editar  </button>
                                                            <input type="hidden" name="id_persona" value="<%=pers.getId()%>"> <!-- esto es para mandar el codigo al servlet -->
                                                </form> 
                                
                                                
                                </td>
                            </tr>      
                        <% 
                         }
                     %>
                  </tbody>  
                  <% }%>
             </table> 
         </div>
             
             
        </div>
   <!-- Scripts de Bootstrap -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

    </body>
</html>
<% } 
else {
    response.sendRedirect("login.jsp");
}
%>
