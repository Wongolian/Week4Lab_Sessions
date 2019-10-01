<%-- 
    Document   : Home
    Created on : 1-Oct-2019, 9:53:44 AM
    Author     : Steven
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action="home" method="get">
            <span name="message">Hello ${username}</span><br>
            <a href="/Login">Log out</a>
        </form>
    </body>
</html>
