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
        <title>Conversor de Temperatura</title>
    </head>
    <body>
        <p>Coversor de Temperatura</p>
        <% String valor = request.getParameter("Celcius");
            double f = 0;
            if(valor != null){
            f = Double.parseDouble(valor)*9/5+32;
            } 
        %>
        
        <form action="Temperatura.jsp" method="POST">
            Celcius <input type="text size=20" name="Celcius"><br>
            
            <input type="submit" value="Enviar">
            
        </form>
        
        
        <h2> <%="O valor convertido é: " + f%> </h2>
            
        
    </body>
</html>
