<%-- 
    Document   : form
    Created on : 11/08/2015, 21:04:07
    Author     : noite
--%>

<%@page import="java.util.Enumeration"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exemplo Formulario</title>
    </head>
    <body>
        <%
            Enumeration campos = request.getParameterNames();
            
            while(campos.hasMoreElements()){
                String campo = (String)campos.nextElement();
                String valor = request.getParameter(campo);%>
                
    <li><%=campo%>=<%=valor%></li>
    <%}%>
    
    <form method="POST" action="form.jsp">
        Nome:<input type="text" size="20" name="nome"><br>
        Telefone:<input type="text" size="20" name="telefone"><br>
        <input type="submit" name="submit" value="Enviar">
    </form>
        
        
        
        
        
        
    </body>
</html>
