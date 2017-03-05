
package com.maharjan.controllers;

import com.maharjan.controllers.helpers.DatabaseUtils;
import com.maharjan.controllers.models.UserDao;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author binod
 */
public class RegisterController extends HttpServlet {

private static final Logger logger = Logger.getLogger(RegisterController.class.getName());
  

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          boolean isLog = false;
       
       HttpSession session = request.getSession(false);
     
      
        if (session != null) {
            if(session.getAttribute("isLogged")!=null){
            isLog = (boolean) session.getAttribute("isLogged");
            }
        }

        if (!isLog) {

            response.sendRedirect("login");
        } else {
            
             request.setAttribute("title", "Register page");
            RequestDispatcher rs = request.getRequestDispatcher("register.jsp");
            rs.forward(request, response);

        }

        
    }
    

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      logger.addHandler(new ConsoleHandler());
      
       String name=request.getParameter("username");
       String pass=request.getParameter("password");
       
    //   LOGGER.log(Level.INFO, "name "+name+ " pass "+pass);
       
        UserDao userDao=new UserDao();
        userDao.createUser(name, pass);
        
       //  LOGGER.log(Level.INFO, "user list "+userDao.readUser().size());
    
    }



}
