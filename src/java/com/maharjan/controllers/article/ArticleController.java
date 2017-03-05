/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maharjan.controllers.article;

import com.maharjan.controllers.helpers.DatabaseUtils;
import com.maharjan.controllers.helpers.DateUtils;
import com.maharjan.controllers.models.article.Article;
import com.maharjan.controllers.models.article.ArticleDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;


import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author binod
 */
@WebServlet(name = "ArticleController", urlPatterns = {"/articles"})
public class ArticleController extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
     Logger.getLogger(ArticleController.class.getName()).log(Level.INFO, "do get articles"+DateUtils.getDate(new Date()));
        
     Article art=new Article("title from code", " description form code ", true, 1);
        ArticleDao artDao=new ArticleDao();
     artDao.creatArticle(art);
     
     
     
     RequestDispatcher rs= request.getRequestDispatcher("articles.jsp");
        rs.forward(request, response);

    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
    }

}
