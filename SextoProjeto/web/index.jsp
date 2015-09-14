<%-- 
    Document   : index
    Created on : 14/09/2015, 19:34:04
    Author     : noite
--%>

<%@page import="modelo.Produto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
          Produto p = new Produto();
          p.setId(1);
          p.setNome("Java");
          p.setDescricao("Linguagem de Programação");
          p.setValor(10.00);
          //response.getWriter().write(p.getId());
          out.print(p.getId());
          session.setAttribute("alfa", p);
        %>
        <h1>Hello World!</h1>
        <table>
            <tr>
                <td>
                    <%=p.getId()%>
                </td>
                <td>
                    <%=p.getNome()%>
                </td>
                <td>
                    <%=p.getDescricao()%>
                </td>
                <td>
                    <%=p.getValor()%>
                </td>
            </tr>
            <% 
              if(!session.getAttribute("alfa").equals(null)){
                  Produto produto = (Produto) session.getAttribute("alfa");
                  out.write("Nome do produto: "+ p.getNome());
              }  
            %>
        </table>
        
    </body>
</html>
