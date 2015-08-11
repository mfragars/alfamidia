<%-- 
    Document   : index
    Created on : 10/08/2015, 21:29:50
    Author     : noite
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Date"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Loja Virtual</title>
    </head>
    <body>
        <% String mensagem = "Bem Vindo"; 
        
        out.println(new Date().toString());
        
        %>
        <h1>Hello Word</h1>
            
        <% out.println(mensagem); %>
        
    </body>
</html>
