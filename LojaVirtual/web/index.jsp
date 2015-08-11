<%-- 
    Document   : index
    Created on : 10/08/2015, 21:29:50
    Author     : noite
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page language="java" import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Loja Virtual</title>
    </head>
    <body>
        <% String mensagem = "Bem Vindo"; 
        
        out.println(new Date().toString());
        int dia = Integer.parseInt((new SimpleDateFormat("yyyy")).format(new Date()));
        %>
        <h1>Hello Word</h1>
            
        <h2><% out.println(mensagem); %></h2>
        <h2>Data <% out.println(dia);%></h2>
        
    </body>
</html>
