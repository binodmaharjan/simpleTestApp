
<%@include  file="view/header.jsp" %>


<!-- <div id="navigation">
     <p>This is the Menu</p>
 </div>-->

<%@include  file="view/sidebar.jsp" %>

<div id="content">

    <div id="md-content">
       
        <form action="register" method="post">
            <header>Register user</header>
            <label>Username <span> *</span></label>
            <input type="text" name="username" value="${param.username}"/>
            <div class="help">At least 6 character</div>
            <label>Password <span> *</span></label>
            <input type="password" name="password"  value="${param.password}"/>
            <div class="help">Use upper and lowercase lettes as well</div>
            <button>Register</button>
        </form>
    </div>      

</div>
<%@ include file="view/footer.jsp" %>
