<%-- 
    Document   : Index
    Created on : 15/09/2021, 08:49:47 PM
    Author     : Santiago Hernandez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Login</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <h1>Login</h1>
    <div>
        <div>
            <div>
                <form action="UserControler" method="POST" >
                    <div>
                        <label>User:</label> 
                        <input type="text" name="txtUser">
                    </div>
                    <div>
                        <label>Password:</label> 
                        <input type="text" name="txtPass">
                    </div>
                    <input type="submit" name="Login" value="Ingresar">                     
                </form>
                
            </div>
        </div>
    </div>
    </body>
</html>