<%-- 
    Document   : index
    Created on : 15 feb 2022, 3:09:54
    Author     : ansan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Act4</title>
    </head>
    <body>
        <h1>Act4</h1>
        <form action="CalculoServlet" method="post">
            Base: <br>
            <input type="text" name="base" value=""> <br>
            Altura: <br>
            <input type="text" name="altura" value=""> <br>
            <input type="submit" value="calcular"> <br>
        </form>
    </body>
</html>
