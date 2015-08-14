<%-- 
    Document   : index
    Created on : 14/08/2015, 20:10:23
    Author     : noite
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>e-Commerce</title>
    </head>
    <body>
        <header>
            <form action="login" name="form1" method="POST">
            <table width="200" border="0">
                    <tr>
                        <td>Name</td>
                        <td>Senha </td>
                    </tr>
                    <tr>
                        <td><input type="text" name="user"></td>
                        <td><input type="password" name="pwd"></td>
                    </tr>
                    <tr>
                        <td celspan="2" ><input type="submit" name="Login"</td>
                    </tr>
                    <tr>
                        <td celspan="2" ><%
                            
                            String valor = request.getParameter("form");
                            
                            if(valor == "0"){
                              %>
                              <h3>Preencha os dados<h3>
                              <%
                            }
                                    
                            %></td>
                    </tr>
                    
            </table>
            </form>
        </header>
        <section>
            <li>Loja Virtual</li>
            <article>
                <table width="200" border="1">
                    <tr>
                        <td>  </td>
                        <td>&nsb</td>
                        <td>&nsb</td>
                    </tr>
                     <tr>
                        <td>&nsb</td>
                        <td>&nsb</td>
                        <td>&nsb</td>
                    </tr>
                    <tr>
                        <td>&nsb</td>
                        <td>&nsb</td>
                        <td>&nsb</td>
                    </tr>
                </table>
                
            </article>
            
        </section>
        <footer>
            
        </footer>
    </body>
</html>
