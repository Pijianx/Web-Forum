<%-- 
    Document   : display_email_entry
    Created on : Nov 28, 2014, 10:34:39 PM
    Author     : derrick
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link type="text/css" rel="stylesheet" href="stylesheet.css"/><!-- CSS -->
        <img src="http://project-nerd.com/wp-content/uploads/2013/08/Banner-Tech.jpg">
    </head>
    <body>
        <br><br><br><br><br><br><br><br><br><br>
        <h1 id="center">Thanks for joining the forum!</h1>
        <%--<p>Your information:</p> --%>
        <jsp:useBean id="user" scope="session" class="forum.User"/> 
        <table cellspacing="5" border="0">
            <tr>
               
          
            <tr>
                <%-- Output: ${sqlResult} --%>
                
            </tr>
        </table>
                <br><br><br><br><br><br><br><br><br><br>
              <div id="center">
              <p> Please take a survey on your registration experience</p>
              
              <form action="SqlGatewayServlet4" method="post">
                <input id="tweet2" type="submit" value ="Survey">
            </form>
            </div>
    </body>
</html>
