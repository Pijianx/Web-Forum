/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import forum.User;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


/**
 *
 * @author derrick
 */
public class AddToEmailListServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                        HttpServletResponse response)
                        throws ServletException,IOException
    {
        //get parameters from the request
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String emailAddress = request.getParameter("emailAddress");
        
        //create the User object
        User user = new User();
        user.setEmailAddress(emailAddress);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        
        String url = "";
        String message = "";
        if (UserDB.emailExists(user.getEmailAddress()))
        {
            message = "This email address already exists<br>" + //might need to change this
                      "Please enter another email address.";
            url= "/join_email_list.jsp";
        }
        else
        {
            UserDB.insert(user);
            url = "/display_email_entry.jsp";
            
        }
        //store the user and message in the session
        //problem with database can always do the older method and modify stuff around
        HttpSession session = request.getSession();
        session.setAttribute("user",user);
        request.setAttribute("message",message);
        
        //forward the request and response to the view
        RequestDispatcher dispatcher =
                getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
        
        
        
    }
   

}
