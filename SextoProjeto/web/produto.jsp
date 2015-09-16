<%-- 
    Document   : produto
    Created on : 14/09/2015, 20:36:46
    Author     : noite
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" isELIgnored="true"%>
<%@taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@taglib uri="http://java.sun.com/jstl/sql" prefix="sql" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" >
        <title>Produto JSP</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%-- Instanciando objeto e setando/retornando as propriedades --%>
        
        <jsp:useBean id="produto" class="modelo.Produto" scope="page">
            <jsp:setProperty name="produto" property="nome" value="PHP"></jsp:setProperty>
        </jsp:useBean>
        <%=produto.getNome()%>
        <br><h3><jsp:getProperty name="produto" property="nome"></jsp:getProperty></h3>
        
        <%-- Formatação de Data --%>
        
        <%-- Core --%>
        
        <jsp:useBean class="modelo.Produto" id="p" scope="page">
            <jsp:setProperty name="p" property="id" value="10"></jsp:setProperty>
           
            <c:if test="${p.id > 9}">
                <c:out value="${p.id}"></c:out><br>
                <c:out value="ID"></c:out>
            </c:if>
        </jsp:useBean>
        
        
        <sql:setDataSource driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost/comercio" user="root" password="" var="conn"></sql:setDataSource>
        
        <sql:query sql="select * from produto" dataSource="${conn}" var="query"></sql:query>
        <c:forEach items="${query.rows}" var="result">
            <c:out value="${result.nome}" ></c:out><br>
        </c:forEach>
    </body>
</html>
