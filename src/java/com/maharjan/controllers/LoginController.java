/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maharjan.controllers;

import com.maharjan.controllers.models.User;
import com.maharjan.controllers.models.UserDao;

import java.io.IOException;
import java.io.PrintWriter;
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
public class LoginController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     
        if(!User.isLogged(request)){
            RequestDispatcher rs = request.getRequestDispatcher("login.jsp");
            rs.forward(request, response);

        } else {
            response.sendRedirect("welcome");
        }
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("username");
        String password = request.getParameter("password");

        if (name != null && name.isEmpty()) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
            request.setAttribute("errorMsg", "Username is empty");
            dispatcher.forward(request, response);
        } else if (password != null && password.isEmpty()) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
            request.setAttribute("errorMsg", "Password is empty");
            dispatcher.forward(request, response);
        } else {

            UserDao ud = new UserDao();

            User user = ud.getUser(name, password);

            if (user != null) {
                HttpSession session = request.getSession();
                session.setAttribute("username", name);
                session.setAttribute("isLogged", true);
                response.sendRedirect("welcome");
            } else {
                RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
                request.setAttribute("errorMsg", "Username and password didnt match");
                dispatcher.forward(request, response);
            }
        }

    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
