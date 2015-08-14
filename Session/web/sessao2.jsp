<%-- 
    Document   : sessao2
    Created on : 13/08/2015, 21:31:30
    Author     : noite
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sessao 2</title>
    </head>
    <body>
        <H1>Id da sess&atilde;o: <%= session.getId()%></H1>
            <%
                
                long sessionCreate = session.getCreationTime();
                int sessionMaxInactive = session.getMaxInactiveInterval();
                String nome = request.getParameter("nome");
                String telefone = request.getParameter("telefone");
                
                if(sessionCreate > 0 ){
                    session.setAttribute("sessionCreate", sessionCreate);
                }
               
                if(sessionMaxInactive > 0){
                    session.setAttribute("sessionMaxInactive", sessionMaxInactive);
                }
                
                if (nome != null && nome.length() > 0) {
                    session.setAttribute("nome", nome);
                }
                if (telefone != null && telefone.length() > 0) {
                    session.setAttribute("telefone", telefone);
                 } 
            %>
        <FORM TYPE=POST ACTION=index.jsp>
            <INPUT TYPE=submit name=submit Value="Retorna">
        </FORM>
    </body>
</html>
