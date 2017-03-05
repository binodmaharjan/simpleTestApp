/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maharjan.controllers.helpers;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author binod
 */
public class DateUtils {
    
    public static String getDate(Date dt){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    
        String currentTime = sdf.format(dt);
        return currentTime;
    }
    
}
