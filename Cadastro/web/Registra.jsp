<%-- 
    Document   : Registra
    Created on : 20/08/2015, 20:49:15
    Author     : noite
--%>

<%@page import="java.io.FileWriter"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.io.PrintStream"%>
<%@page import="java.io.FileOutputStream"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
           String codigo = request.getParameter("codigo");
           String produto = request.getParameter("produto");
           String descricao = request.getParameter("descricao");
           String valor = request.getParameter("valor");
           String qtdEstoque = request.getParameter("qtdEstoque");
           
           FileOutputStream f1;
           PrintStream registra;
           
           try {
               f1 = new FileOutputStream("C:/Users/noite/Documents/NetBeansProjects/alfamidia/Cadastro/web/BD/cadastro.txt");
               registra = new PrintStream(f1);
               registra.println(codigo + "|" + produto + "|" + descricao + "|" + valor + "|" + qtdEstoque);
               f1.close();
           } catch(Exception e){
               System.out.println("Erro ao gravar arquivo");
           } finally{
               response.sendRedirect("index.jsp?form=gravacao_OK");
           }
           
           
        
        %>
        
        
        
    </body>
</html>
