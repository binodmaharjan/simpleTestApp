<%-- 
    Document   : index
    Created on : Feb 3, 2017, 1:55:19 PM
    Author     : binod
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Login</title>
   
    <link href="css/styles.css" rel="stylesheet" type="text/css" />
</head>

<body>
    
    
    
        <img src="http://localhost:8080/NewsApp/upload/best.jpg"/>

    <form action="login" method="post">
        <header>Login</header>
        
        <% if (request.getAttribute("errorMsg")!=null) {%>
        
        
        
        <div class="error"><%= request.getAttribute("errorMsg") %></div>
         
         <% }%>
         
         
        
        <label>Username <span> *</span></label>
        <input type="text" name="username" value="${param.username}"/>
        <div class="help">At least 6 character</div>
        <label>Password <span> *</span></label>
        <input type="password" name="password"  value="${param.password}"/>
        <div class="help">Use upper and lowercase lettes as well</div>
        <button>Login</button>
    </form>
</body>
