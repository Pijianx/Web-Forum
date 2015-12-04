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
        <link type="text/css" rel="stylesheet" href="stylesheet.css"/><!-- CSS -->
        <img src="http://project-nerd.com/wp-content/uploads/2013/08/Banner-Tech.jpg">
    </head>
    <body>
        <br><br><br><br><br><br><br><br><br><br>
        <h1 id="center">Change your information</h1>
        <p id="center"> Please change the information<br>  <%-- add later must enter correct password --%>
        Then, click on the Submit button.</p>
        
        <p><i>${message}</i></p>
        <div id="pad">
        <form action="SqlGatewayServlet" method="post"> <%--added the servlet part to addemail  changed to post instead of get--%>
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
                    
                    <td alling="right">Name:</td>
                    <td><input type="text" name="name"
                               value="${user.name}">
                    </td>
                </tr>
                <tr>
                    <td alling="right">Country:</td>
                    <td><input type="text" name="country"
                               value="${user.country}">
                    </td>
                </tr>
                <tr>
                    <td alling="right">Interest:</td>
                    <td><input type="text" name="interest"
                               value="${user.interest}">
                    </td>   
                </tr>
                <tr>
                    <td></td>
                    <td><br><input id ="tweet2" type="submit" value="Submit"></td>
                </tr>
            </table>
        </form>
        </div><br><br><br><br><br><br><br>           
                    <form action="delete.jsp" method="post">
                <input id="tweet2" type="submit" value ="Delete account">
    </body>
</html>
