<%-- 
    Document   : form2
    Created on : 11/08/2015, 22:10:02
    Author     : noite
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="javax.servlet.http.Cookie"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%
            
            Cookie[] cookies = request.getCookies();
            
            out.println(cookies.length);
            
        %>
        
        <form method="POST" action="HelloServlet">
        Nome:<input type="text" size="20" name="nome"><br>
        Telefone:<input type="text" size="20" name="telefone"><br>
        Color:<input type="text" size="20" name="color"><br>
        <input type="submit" name="submit" value="Enviar">
        </form>
        
        
    </body>
</html>
