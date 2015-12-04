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
        <br><br><br><br><br><br><br><br><br><br><br><br>
        <h1 id="center">Survey</h1>
        <%-- <p id="center"> Please  enter your information below<br>
        Then, click on the Submit button.</p> --%><br><br><br>
        
        <p><i>${message}</i></p>
        <div id="pad">
        <form action="SatisfyServlet" method="post"> <%--added the servlet part to addemail  changed to post instead of get--%>
            <table cellspacing="5" border ="0">
                <tr>
                    <td alling="right">Rate your experience on a scale of 1-10</td>
                    <td><input type="text" name="Exp"
                               value="${user.Exp}">
                    </td>
                </tr>
                <tr>
                    <td alling="right">How do you like the content of the site on a scale of 1-10</td>
                    <td><input type="text" name="Content"
                               value="${user.Content}">
                    </td>
                </tr>
                <tr>
                    <td alling="right">What is your age?</td>
                    <td><input type="text" name="Age"
                               value="${user.Age}">
                    </td>
                </tr>
                <tr>
                    <td alling="right">What would you like to see on our site?</td>
                    <td><input type="text" name="LikeToSee"
                               value="${user.LikeToSee}">
                    </td>
                </tr>
                <tr>
                    <td alling="right">What is your email address?</td>
                    <td><input type="text" name="EmailAddress"
                               value="${user.EmailAddress}">
                    </td> <br>
                </tr>
                <tr>
                    <td></td>
                    <td id="center"><br><br><br><input id="tweet" type="submit" value="Submit"></td>
                </tr>
            </table>
        </form>
        </div>
    </body>
</html>
