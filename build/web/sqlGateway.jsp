<%-- 
    Document   : sqlGateway.jsp
    Created on : Nov 22, 2014, 11:06:54 PM
    Author     : derrick
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Manager portal</title>
        <link type="text/css" rel="stylesheet" href="stylesheet.css"/><!-- CSS -->
    </head>
    <body>
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        
        <c:if test="${sqlStatement == null}">
            <c:set var="sqlStatement" value="select * from User" />
        </c:if>
        
        
        <h1>Manager Terminal</h1>
        <p id='art'>Here's a list of the employees you manage. Enter one of the commands. Then, information 
            about the <br>
            employee changes will appear at the bottom of this page. </p>
        <p><b>*it's easier when you copy and paste the commands</b></p>
        <p>
            <b>Statement List: </b><br>
        <p><i id="art">to show the current list of employees type:</i> select * from User </p> 
        <p><i id="art">to insert a a new employee type:</i> insert into Database.User (idUser,name,age) values (the employee number, 'name of employee' ,the age);</p>
        <p><i id="art">to update a employee type:</i> UPDATE Database.User set name= the name to change, age= (their age) where idUser=(employee id);</p>
        <p><i id="art">to delete a employee type:</i> delete from Database.User where idUser=(employee number);</p>
            <form action="SQLGatewayServlet" method="post"> <%--changed this from sqlGateway --%>
            <textarea name="sqlStatement" cols="60" rows="8">${sqlStatement}
            </textarea><br><br>
            <input type="submit" value="Execute">
        </form>
        </p>
        
        <p>
            <b>Output:</b><br>
                ${sqlResult}
        </p>
        
        <br>
        <br>
        <br>
        <br>
        <p id="head"> To check this quarters top performers click here</p>
        <form action="sql_gateway.jsp" method="post">
                <input type="submit" value ="Submit">
            </form>
    </body>
</html>