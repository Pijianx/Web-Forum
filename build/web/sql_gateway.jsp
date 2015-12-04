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
            <c:set var="sqlStatement" value="select * from DistrictWest" />
        </c:if>
        
        
        <h1>Top Performers this Quarter!</h1>
        
        <p>
            <b>Command List: </b><br>
        <p id="art"> To pick the district you would like to view </p>
        <p id="art"> You may chose from West,South,Central,East </p>
        <p><i id="art"> Type in this to see the West district:</i> select * from DistrictWest</p>
        <b> *Replace DistrictEast with DistrictCentral to see the Central district etc </b>
        
            <form action="SqlGatewayServlet" method="post"> <%--changed this from sqlGateway --%>
            <textarea name="sqlStatement" cols="0" rows="0">${sqlStatement}
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
        
    </body>
</html>