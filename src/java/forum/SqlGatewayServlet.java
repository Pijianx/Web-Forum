/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import java.sql.*;

 
/**
 *
 * @author derrick
 */
@WebServlet(name = "SqlGatewayServlet", urlPatterns = {"/SqlGatewayServlet"})
public class SqlGatewayServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
                          throws ServletException, IOException
    {
        String sqlStatement = request.getParameter("sqlStatement");
        String sqlResult = "";
      
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String emailAddress = request.getParameter("emailAddress");
            String name = request.getParameter("name");
            String country = request.getParameter("country");
            String interest = request.getParameter("interest");
            String verify = request.getParameter("verify");
        
        //create the User object
            User user = new User();
            user.setEmailAddress(emailAddress);
            user.setFirstName(firstName);
            user.setLastName(lastName);
            user.setCountry(country);
            user.setName(name);
            user.setInterest(interest);
            user.setVerify(verify);
            String url= "";
            String message = "";
            
         
          UserDB.update(user);
          message = "pow";
          url = "/updated_information.jsp";
            
          
            
            //comment below if didnt work
            HttpSession session = request.getSession();
            session.setAttribute("user",user);
           // request.setAttribute("message",message);
            
            //forward the request and response to the view
        RequestDispatcher dispatcher =
               getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
         //comment above if didnt work
        
    }
}
        
     