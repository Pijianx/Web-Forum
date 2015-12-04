<%-- 
    Document   : join_email_list
    Created on : Nov 28, 2014, 9:22:38 PM
    Author     : derrick
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Email log in</title>
        <img src="http://project-nerd.com/wp-content/uploads/2013/08/Banner-Tech.jpg">
    </head>
    <body>
        <br><br><br><br><br><br><br><br><br><br><br>
        <h1>Log In</h1>
        <link type="text/css" rel="stylesheet" href="stylesheet.css"/><!-- CSS -->
        <%--<p> To join our email list, enter your information below<br>
Then, click on the Submit button.</p> --%>  <%-- add a register link at the bottom --%>
        <%--changing this arround --%>
        <p><i>${message}</i></p>
        
        <form action="SqlGatewayServlet3" method="post"> <%--added the servlet part to addemail  changed to post instead of get--%>
            <table cellspacing="5" border ="0">
                <tr>
                    <td alling="right">Email:</td>
                    <td><input type="text" name="firstName"
                               value="${user.emailAddress}">
                    </td>
                </tr>
                <tr>
                    <td alling="right">Password:</td>
                    <td><input type="password" name="lastName"
                               value="${user.lastName}">
                    </td>
                </tr>
                <tr>
                    
                </tr>
                <tr>
                    <td></td>
                    <td><input id="tweet2" type="submit" value="Log in"></td>
                </tr>
            </table><br><br><br><br><br><br><br><br><br>
        </form>
                <p> New users register here</p>
                <form action="join_email_list.jsp" method="post">
                <input id="tweet2" type="submit" value ="Register">
            </form>
    </body>
</html>
