<%-- 
    Document   : Registrar
    Created on : 23/09/2021, 08:46:26 PM
    Author     : Santiago Hernandez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <h1>Registrar</h1>
            <form action="UserControler" method="POST">
                <div class="inputs">
                    <label id="user">Nombre:</label> 
                    <input type="text" name="txtName">
                </div>
                <div class="inputs">
                    <label>Identificacion:</label> 
                    <input type="text" name="txtIdent">
                </div>
                <div class="inputs">
                    <label>Correo:</label> 
                    <input type="text" name="txtEmail">
                </div>
                <div class="inputs">
                    <label>Clave:</label> 
                    <input type="text" name="txtPass">
                </div>
                <input id="enviar" type="submit" name="Register" value="Registrar">
            </form>
        </div>       
    </body>
</html>
