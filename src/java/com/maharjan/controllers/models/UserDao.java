/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maharjan.controllers.models;

import com.maharjan.controllers.helpers.DatabaseUtils;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author binod
 */
public class UserDao {

    public boolean createUser(String username, String password) {

        String query = "INSERT INTO  user (username, password ) VALUES (? ,?)";

        PreparedStatement pst;
        try {
            pst = DatabaseUtils.getConnection().prepareStatement(query);
            pst.setString(1, username);
            pst.setString(2, password);

            int i = pst.executeUpdate();

            Logger.getLogger(UserDao.class.getName()).log(Level.INFO, " create success " + i);

            if (i > 0) {
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    public User getUser(String username, String password) {

        String query = " SELECT * FROM  user where username = ? AND password = ? ";

        PreparedStatement pst;
        try {
            pst = DatabaseUtils.getConnection().prepareStatement(query);
            pst.setString(1, username);
            pst.setString(2, password);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                return user;

            }

        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;

    }

    public List<User> readUser() {

        List<User> userList = new ArrayList<>();
        String query = " SELECT * FROM  user ";

        PreparedStatement pst;
        try {
            pst = DatabaseUtils.getConnection().prepareStatement(query);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                userList.add(user);

            }

        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return userList;

    }

    public boolean update(User user) {
        return true;
    }

    public boolean delete(User user) {
        return true;
    }

}
