package Controlador.Usuario;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Modelo.DAO.UserDAO;
import Modelo.BusinessEntity.UserBE;
/**
 *
 * @author Santiago Hernandez
 */
@WebServlet(name = "UserControler", urlPatterns = {"/UserControler"})
public class UserControler extends HttpServlet {
    
    UserDAO userDAO = new UserDAO();
    UserBE userBE = new UserBE();
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                  
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String accion = "";
            accion=request.getParameter("Register");
            if(accion != null){
                if (accion.equals("Ingresar")){
                    String nombres = request.getParameter("txtName");
                    String identificacion = request.getParameter("txtIdent");
                    String email = request.getParameter("txtEmail");
                    String contraseña = request.getParameter("txtPass");
                    
                    userBE.setName(nombres);
                    userBE.setEmail(email);
                    userBE.setPasswor(contraseña);

                    if(userDAO.Registro(userBE)){
                        request.getRequestDispatcher("Index.jsp").forward(request, response);
                    }
                    else{
                        request.getRequestDispatcher("Registrar.jsp").forward(request, response);
                    }

                }
            }
  
            accion = request.getParameter("Login");
            if(accion != null){
                if (accion.equals("Ingresar")){
                String user = request.getParameter("txtUser");
                String pass = request.getParameter("txtPass");
                userBE = userDAO.Login(user, pass);
                if(userBE.getName() != null){
                    request.getRequestDispatcher("/Auth/Principal.jsp").forward(request, response);
                    //request.getRequestDispatcher("RoutesUser?Page=Principal").forward(request, response);
                }else{
                    request.getRequestDispatcher("index.jsp").forward(request, response);
                }
                }
                else{
                    request.getRequestDispatcher("index.jsp").forward(request, response);      
                } 
            }
                   
    }

 
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
