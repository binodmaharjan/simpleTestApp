/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maharjan.controllers.helpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author binod
 */
public class DatabaseUtils {

    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/training";
    private static final String DATABASE_USER = "root";
    private static final String DATABASE_PASSOWRD = "maharjan1";

    public static Connection getConnection() throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(DATABASE_URL,
                DATABASE_USER, DATABASE_PASSOWRD);
        Logger.getLogger(DatabaseUtils.class.getName()).log(Level.SEVERE, "connection success");

        return con;
    }

}
