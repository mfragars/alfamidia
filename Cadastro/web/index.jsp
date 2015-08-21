<%-- 
    Document   : index
    Created on : 20/08/2015, 19:54:07
    Author     : noite
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro</title>
    </head>
    <body>
        <h3>Cadastro de Produtos</h3>
        <br>
        <form action="Registra.jsp" name="form" method="POST">
            <tr>
                <td>Codigo</td>
                <td><input type="text" name="codigo" size="32"></td>
            <br>
            </tr>
            <tr>
                <td>Produto</td>
                <td><input type="text" name="produto" size="32"></td>
            <br>
            </tr>
            <tr>
                <td>Descrição</td>
                <td><input type="text" name="descricao" size="32"></td>
            <br>
            </tr>
            <tr>
                <td>Valor</td>
                <td><input type="text" name="valor" size="32"></td>
            <br>
            </tr>
            <tr>
                <td>Qtd Estoque</td>
                <td><input type="text" name="qtdEstoque" size="32"></td>
            </tr>
            <tr>
                <td><input type="submit" name="ENTER"></td>
            </tr> 
        </form>
    </body>
</html>
