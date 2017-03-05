<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
  <%@page errorPage="view/errorPage.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/styles.css" />
<title><%= request.getAttribute("title") %></title>
</head>
<body>
    
      <div id="wrapper">
        <div id="header">
            <p>Welcome <%= session.getAttribute("username") %></p>
          
            <p> <a href="logout" >Log out</a></p>

        </div>
    