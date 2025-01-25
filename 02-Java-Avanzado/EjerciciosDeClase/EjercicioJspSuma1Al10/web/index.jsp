

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Suma del 1 al 10</title>
    </head>
    <body>
        
        <%int suma=0;%>
        <%for (int i = 1; i <= 10; i++) {
        suma += i; %>
        <h1><%=i%> = <%=suma%></h1>
        <% }%>
        
    </body>
</html>
