<%-- 
    Document   : display_email_entry
    Created on : Nov 28, 2014, 10:34:39 PM
    Author     : derrick
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head
        <link type="text/css" rel="stylesheet" href="stylesheet.css"/><!-- CSS -->
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link type="text/css" rel="stylesheet" href="stylesheet.css"/><!-- CSS -->
        <img src="http://project-nerd.com/wp-content/uploads/2013/08/Banner-Tech.jpg">
   
    </head>
    <body>
      
        <br><br><br><br><br><br><br><br><br><br><br><br>
        <p id="new1">Tech forum</p>
        
        <p id="new"> A place to discuss the newest technologies. A place to discover new areas of interest </p>
        <jsp:useBean id="user" scope="session" class="forum.User"/> 
        <table cellspacing="5" border="0">
            <tr>
                <%--  <td id="art">ID: </td>
                
                <td><jsp:getProperty name="user" property="firstName"/></td> --%>
            </tr>
             <tr>
                 <%--    <td id="art">Name:</td>
                <td><jsp:getProperty name="user" property="lastName"/></td> --%>
            </tr>
             <tr>
                 <%--  <td id="art">Email address:</td>
                <td><jsp:getProperty name="user" property="emailAddress"/></td> --%>
            </tr>
            <tr>
                <%--       Output: ${sqlResult} --%>
                
            </tr>
        </table>
              
            </form>
            <div id="pad">
                <p><a id="link" href="2plus2.com">Internet</a> Discuss different ISP providers </p>
                <p><a id="link" href="2plus2.com">Software</a> Discuss Software</p>
                <p><a id="link" href="2plus2.com">Electronics</a> A forum dedicated to various types of electronics</p>
                <p><a id="link" href="2plus2.com">Other</a> Non Technology related discussion</p><br><br><br>

            </div>
            
              <div id='tweet' >  
                  <a href="http://www.twitter.com/">Follow us on<span>Twitter!</span></a>
              </div><br><br>
            
            <div id='tweet2'>
            <form action="change_information.jsp" method="post">
                <input id='tweet2' type="submit" value ="Edit information">
                </div>
    </body>
</html>
