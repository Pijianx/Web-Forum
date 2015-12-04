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
        <h1 id="center">Join the forum!</h1>
        <p id="center"> To join the forum, enter your information below<br>
            Then, click on the Submit button.</p<br><br><br><br><br>
         
        <p id="center"><i id="art">${message}</i></p>
         <div id="pad">
        <form action = "SQLGatewayServlet" method="post"> 
            <table cellspacing="5" border ="0">
               
                <tr>
                    <td alling="right">ID:</td>
                    <td><input type="text" name="firstName"
                               value="${user.firstName}">
                    </td>
                </tr>
                <tr>
                    <td alling="right">Password:</td>  <%-- do a verification for password, i can prob do another variable for pw2 and do comparrison in servlet --%>
                    <td><input type="password" name="lastName"
                               value="${user.lastName}">
                    </td>
                </tr>
                <tr>
                    <td alling="right">Verify password:</td>  <%-- do a verification for password, i can prob do another variable for pw2 and do comparrison in servlet --%>
                    <td><input type="password" name="verify"
                               value="${user.verify}">
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
                    <td><input id= "tweet2" type="submit" value="Register"></td>
                </tr>
                 
            </table>
        </form>
     </div>
    </body>
</html>
