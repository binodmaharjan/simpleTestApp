/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maharjan.controllers.models.article;

import com.maharjan.controllers.models.*;
import com.maharjan.controllers.helpers.DatabaseUtils;
import com.maharjan.controllers.helpers.DateUtils;
import static com.sun.xml.ws.security.addressing.impl.policy.Constants.logger;
import static com.sun.xml.ws.security.impl.policy.Constants.logger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;

import java.util.logging.Logger;

/**
 *
 * @author binod
 */
public class ArticleDao {
    
    final static Logger log=Logger.getLogger(ArticleDao.class.getName());
    
    

    public boolean creatArticle(Article article) {

        String query = "INSERT INTO article  ( title, description, publish_status,  user_id,created_at,updated_at ) VALUES (null, ?, ?, ?, ?,?,?) ";
        PreparedStatement pst;
        try {
            pst = DatabaseUtils.getConnection().prepareStatement(query);
        pst.setString(1, article.title);
        pst.setString(2,article.description);
        pst.setBoolean(3, true);
        pst.setInt(4, article.user_id);
        
        Date date=new Date();
         pst.setString(5,(DateUtils.getDate(date)));
          pst.setString(6, (DateUtils.getDate(date)));
        

            int i = pst.executeUpdate();

            Logger.getLogger(ArticleDao.class.getName()).log(Level.INFO, " create success " + i);

            if (i > 0) {
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(ArticleDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ArticleDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    public Article getUser(String username, String password) {

//        String query = " SELECT * FROM  user where username = ? AND password = ? ";
//
//        PreparedStatement pst;
//        try {
//            pst = DatabaseUtils.getConnection().prepareStatement(query);
//            pst.setString(1, username);
//            pst.setString(2, password);
//            ResultSet rs = pst.executeQuery();
//
//            if (rs.next()) {
//                Article user = new Article();
//                user.setId(rs.getInt("id"));
//                user.setUsername(rs.getString("username"));
//                user.setPassword(rs.getString("password"));
//                return user;
//
//            }
//
//        } catch (SQLException ex) {
//            Logger.getLogger(ArticleDao.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(ArticleDao.class.getName()).log(Level.SEVERE, null, ex);
//        }

        return null;

    }

    public List<Article> readUser() {

//        List<Article> userList = new ArrayList<>();
//        String query = " SELECT * FROM  user ";
//
//        PreparedStatement pst;
//        try {
//            pst = DatabaseUtils.getConnection().prepareStatement(query);
//            ResultSet rs = pst.executeQuery();
//
//            while (rs.next()) {
//                Article user = new Article();
//                user.setId(rs.getInt("id"));
//                user.setUsername(rs.getString("username"));
//                user.setPassword(rs.getString("password"));
//                userList.add(user);
//
//            }
//
//        } catch (SQLException ex) {
//            Logger.getLogger(ArticleDao.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(ArticleDao.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
        return null;

    }

    public boolean update(Article user) {
        return true;
    }

    public boolean delete(Article user) {
        return true;
    }

}
