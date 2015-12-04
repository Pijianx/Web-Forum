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
        <title>Are you sure you want to Delete your account?</title>
        <link type="text/css" rel="stylesheet" href="stylesheet.css"/><!-- CSS -->
        <img src="http://project-nerd.com/wp-content/uploads/2013/08/Banner-Tech.jpg">
    </head>
    <body
        <br><br><br><br><br><br><br><br><br><br><br>
        <h1 id="center">Are you sure you want to Delete your account?</h1><br>
        <p id="center">Verify your  information for<br>  <%-- add later must enter correct password --%>
            Then,press the delete button.</p><br><br><br<br><br>
        
        <p><i>${message}</i></p> 
        <div id="pad">
        <form action="SqlGatewayServlet2" method="post"> <%--added the servlet part to addemail  changed to post instead of get--%>
            <table cellspacing="5" border ="0">
                <tr>
                    <td alling="right">ID:</td>
                    <td><input type="text" name="firstName"
                               value="${user.firstName}">
                    </td>
                </tr>
                <tr>
                    <td alling="right">Password:</td>
                    <td><input type="password" name="lastName"
                               value="${user.lastName}">
                    </td>
                </tr>
                <tr>
                    <td alling="right">Email Address:</td>
                    <td><input type="text" name="emailAddress"
                               value="${user.emailAddress}">
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td><br><input id="tweet" type="submit" value="Delete"></td>
                </tr>
            </table>
        </form>
        </div>
    </body>
</html>
