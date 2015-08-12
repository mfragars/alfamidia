<%-- 
    Document   : errorpge
    Created on : 11/08/2015, 21:54:15
    Author     : noite
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor="red">
        
        <%@page isErrorPage="true" %>
        <h1>The exception <%= exception.getMessage()%></h1>
        
    </body>
</html>
