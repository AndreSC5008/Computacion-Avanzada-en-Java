<%-- 
    Document   : calculo
    Created on : 31 ene 2022, 3:14:47
    Author     : ansan
--%>

<%@page import="act2package.Triangulo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Resultados</h1>
        <%
            String base = request.getParameter("base");
            String altura = request.getParameter("altura");
            
            Triangulo t1 = new Triangulo(base, altura); 
            
           
            
        %>
        Area : <br>
        <%=t1.area()%>
        <br>
        Perimetro : <br>
        <%=t1.perimetro()%>
    </body>
</html>
