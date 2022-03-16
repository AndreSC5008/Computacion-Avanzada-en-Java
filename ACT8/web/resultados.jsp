<%-- 
    Document   : resultados
    Created on : 15 feb 2022, 3:36:41
    Author     : ansan
--%>

<%@page import="Act4.Triangulo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultados</title>
    </head>
    <body>
            <h1>Resultados</h1>
        <%
            Triangulo t1= (Triangulo) request.getAttribute("CalculosFinales");
            
        %>
        Area : <br>
        <%=t1.getAreaCalculada()%>
        <br>
        Perimetro : <br>
        <%=t1.getPerimetroCalculado()%>
    </body>
    
    
</html>
