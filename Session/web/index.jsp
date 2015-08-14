<%-- 
    Document   : index
    Created on : 13/08/2015, 20:54:20
    Author     : noite
--%>

<%@page import="java.util.Enumeration"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Session</title>
    </head>
    <body>
       <H1>Formulário</H1>
       
       <H1>Id da sess&atilde;o: <%= session.getId()%></H1>
       <br>
       <H3><li>Essa sess&atilde;o foi criada em <%= session.getCreationTime()%></li></H3>
       
       <H3><li>Antigo intervalo de inatividade = <%= session.getMaxInactiveInterval()%></li>
       
           <% session.setMaxInactiveInterval(10);%>
           
           <li>Novo intervalo de inatividade= <%= session.getMaxInactiveInterval()%></li> </H3>
           
           <% Enumeration atribs = session.getAttributeNames();
                   while (atribs.hasMoreElements()) {
                       String atrib = (String)atribs.nextElement();
                       String valor = (String)session.getAttribute(atrib);
                       
               %>
               <li><%= atrib %> = <%= valor %></li>
                <% } %>
    <form method="POST" action="sessao2.jsp">
        Nome: <input type="text" size="20" name="nome" ><br>
        Telefone: <input type="text" size="20" name="telefone" > <br>
        <INPUT TYPE=submit name=submit value="envie">
    </form>
    </body>
</html>
