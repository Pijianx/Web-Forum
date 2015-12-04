<%-- 
    Document   : basket
    Created on : Nov 12, 2014, 4:04:33 AM
    Author     : derrick
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Derricks store</title>
    </head>
    <body>
        <h1>Your cart</h1>
        
        <table border="1" cellpadding="5">
            <tr>
                <th>Quantity</th>
                <th>Product</th>
                <th>Price</th>
                <th>Amount</th>
                
            </tr>
            <%@taglib prefix="c"
                  uri="http://java.sun.com/jsp/jstl/core" %>
            <c:forEach var="product" items="${basket.items}">
                <tr valign="top">
                    <td>
                        <form action="<c:url value='/basket' />">
                            <input type="hidden" name="itemCode"
                                   value="${product.itemCode}">
                            <input type=text size=2 name="quantity"
                                   value="${product.quantity}">
                            <input type="submit" value="Update">
                        </form>
                    </td>
                    <td>${product.item.description}</td>
                    <td>${product.item.priceCurrencyFormat}</td>
                    <td>${product.totalCurrencyFormat}</td>
                    <td>
                        <form action="<c:url value='/basket' />">
                        <input type="hidden" name="itemCode"
                               value="${product.item.code}">
                        <input type="hidden" name="quantity"
                               value="0">
                        <input type="submit" value="Remove Item">
                        </form>
                    </td>
                </tr>
            </c:forEach>
                <tr>
                    <td colspan="3">
                        <p><b> To change the quantity</b>,enter the new
                            quantity and click on the Update button.</p>
                    </td>
                </tr>
        </table>
            <br>
            <form action="<c:url value='/landing.jsp' />"method="post">
                <input type="submit" value="Continue Shopping">
            </form>
            
            <form action="<c:url value='/finished.jsp'/>"method="post">
                <input type="submit" value="Checkout">
            </form>
    </body>
</html>
