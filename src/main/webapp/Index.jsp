<%-- 
    Document   : Index
    Created on : 15/09/2021, 08:49:47 PM
    Author     : Santiago Hernandez
    Author CSS : Andres Cubides
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Login</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="Css/index.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div>
            <h1>Login</h1>
            
            <form action="UserControler" method="POST" >
                <div class="inputs">
                    <label id="user">User:</label> 
                    <input type="text" name="txtUser">
                </div>
                <div class="inputs">
                    <label>Password:</label> 
                    <input type="text" name="txtPass">
                </div>
                <input id="enviar" type="submit" name="Login" value="Ingresar">
                <a href="Auth/Registrar.jsp">Registrar</a>
            </form>
            <img src=" Img/logo.png" alt="logo el bosque"/>
        </div>
    </body>
</html>
