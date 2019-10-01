<%-- 
    Document   : Login
    Created on : 1-Oct-2019, 9:19:14 AM
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
        <h1>Login</h1>
        <form action="login" method="get">
            Username: <input type="text" name="username"><br>
            Password: <input type="password" name="password">
            <br>
            <input type="Submit" value="Log In">
        </form>
    </body>
</html>
