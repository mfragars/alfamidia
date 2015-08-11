<%-- 
    Document   : exemplo1
    Created on : 11/08/2015, 20:00:00
    Author     : noite
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% String valor = request.getParameter("Celcius");
            if(valor != null){
            double f = Double.parseDouble(valor)*9/5+32;
            out.println("<P>");
            out.println("<h2>Valor em Fahrenheit:" +f +"<h2><br>");
            }
        %>
        
        <form action="Temperatura.jsp" method="POST">
            Celcius <input type="text size=20" name="Celcius"><br>
            <input type="submit">
        </form>
        
        
        
        
    </body>
</html>
