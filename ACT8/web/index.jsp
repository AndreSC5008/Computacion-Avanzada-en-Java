<%-- 
    Document   : index
    Created on : 15 feb 2022, 3:09:54
    Author     : ansan
--%>

<%@page import="java.util.Enumeration"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Act8</title>
    </head>
    <body>
          
        <%
            Cookie cookie[]= request.getCookies(); 
            if(cookie!=null){
            
            for (int i=0; i<cookie.length;i++)
            {
                if(cookie[i].getName().equals("base"))
                {
                out.print("<h1>Tu calculo anterior fue "+ cookie[i].getValue()+" de base, ");
                }
                if(cookie[i].getName().equals("altura"))
                {
                out.print( cookie[i].getValue()+" de altura, ");
                }
                 if(cookie[i].getName().equals("area"))
                {
                out.print( cookie[i].getValue()+" de area, ");
                }
                 if(cookie[i].getName().equals("perimetro"))
                {
                out.print( cookie[i].getValue()+" de perimetro.");
                }
            }
            
            }
            
            
        %>
        <%
           if (request.getAttribute("flag")!=null)
           {
                out.println("<h1>Utiliza un numero mayor a 0 </h1>");
            }
            
        %>
        
      
        <h1>Act8</h1>
        
        <form action="CalculoServlet" method="post">
             
        <%
            HttpSession sesion= request.getSession(false);
            Enumeration e = sesion.getAttributeNames();
            if (e.hasMoreElements()){
                out.print("<h1>Hola de nuevo ");
                out.print(sesion.getAttribute("nombre"));
                out.print("<br>");
            }
            else {
                    out.print("Nombre <br> <input type=\"text\" name=\"nombre\" value=\"\"> <br>");
                    }
        %>
            Base: <br>
            <input type="text" name="base" value=""> <br>
            Altura: <br>
            <input type="text" name="altura" value=""> <br>
            <input type="submit" value="calcular"> <br>
        </form>
    </body>
</html>
