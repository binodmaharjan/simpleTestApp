/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maharjan.controllers.models.article;

import com.maharjan.controllers.models.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 *
 * @author binod
 */
public class Article {
    
    int id;
    String title;
    String description;
    boolean publish_status;
    int user_id;
    String created_at;
    String updated_at;

    public Article() {
    }

    public Article(String title, String description, boolean publish_status, int user_id) {
        this.title = title;
        this.description = description;
        this.publish_status = publish_status;
        this.user_id = user_id;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isPublish_status() {
        return publish_status;
    }

    public void setPublish_status(boolean publish_status) {
        this.publish_status = publish_status;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }
    
    

    
    
    
}
