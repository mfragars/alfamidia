<%-- 
    Document   : include
    Created on : 11/08/2015, 21:21:36
    Author     : noite
--%>

<%@page import="com.sun.org.apache.xalan.internal.xsltc.compiler.sym.error"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page errorPage="errorpge.jsp" %>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exemplo Include</title>
    </head>
    <body bgcolor="ligthblue">
        <jsp:useBean id="foo" scope="request" class="error.Smart"/>
        <%
            String name = null;
            if(request.getParameter("name") == null){
        %>
        
        <%@include file="erro.html" %>
        <% }
            else 
                foo.setName(request.getParameter("name"));
                if(foo.getName().equalsIgnoreCase("Integra"))
                    name = "acura";
                if(name.equalsIgnoreCase("acura")){
        %>
        
        <H>Yes!!!<a href="http://www.acura.com">Acura</a>is my favorite car.
            <%
                }
            }
            %>
    </body>
</html>
