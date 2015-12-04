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
@WebServlet(name = "SatisfyServlet", urlPatterns = {"/SatisfyServlet"})
public class SatisfyServlet extends HttpServlet {

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
       // try   commented try out too
       // {
            //get a connection
           // Class.forName("com.mysql.jdbc.Driver");
           // String dbURL = "jdbc:mysql://localhost:3306/Database"; //should be sql database it connects to
           // String username = "root";
           // String password= "mindgamesforfun";
           // Connection connection = DriverManager.getConnection(
           //     dbURL, username, password);
            //commented above for now
            //think should create user here and set attributes to it
            //create a statement new stuff entered here
            String Exp = request.getParameter("Exp");
            String Content = request.getParameter("Content");
            String Age = request.getParameter("Age");
            String LikeToSee = request.getParameter("LikeToSee");
            String emailAddress = request.getParameter("EmailAddress");
        
        //create the User object
            User user = new User();
            user.setEmailAddress(emailAddress);
            user.setContent(Content);
            user.setAge(Age);
            user.setLikeToSee(LikeToSee);
            user.setExp(Exp);
            String url= "";
            String message = "";
            
         // user=  UserDB.selectUser(emailAddress); //try again in 5 minutes with this gone
          UserDB1.insert(user);
          message = "pow";
          url = "/thankyousatisfy.jsp";
            
            //do a function call to see user exist then display message just added in right below
         //   if (UserDB.emailExists(user.getEmailAddress()))
          //  {
           //     message = "This email address already exists";
           //             url = "/join_email_list.jsp";
          //  }
          //  else
         //   {
         //       UserDB.insert(user);
          //      url = "/display_email_entry.jsp";
         //   }
            
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
        
        
        //uncomment all below if didnt work
          //  String query=
            //        "INSERT INTO User (FirstName, LastName, EmailAddress)"+
              //      "VALUES ('" + user.getFirstName() + "', " +
                //            "'" + user.getLastName() + "', "+
                  //          "'" + user.getEmailAddress() + "')";
            
            
            //create a statement ended here
           // Statement statement = connection.createStatement();
            //added this here to start here
           // int rowCount = statement.executeUpdate(query);
            
            //ended here
            
         
        //}
          // catch(ClassNotFoundException e)
       //{
         //   e.printStackTrace();
        //}
        //catch(SQLException e)
        //{
          //  sqlResult = "Error executing the SQL statement: <br>"
            //        + e.getMessage();
     //   }
     
        
       // String url= "/display_email_entry.jsp"; //changed from /sql_gateway.jsp
       // RequestDispatcher dispatcher =
         //       getServletContext().getRequestDispatcher(url);
       // dispatcher.forward(request,response);
    //}
    
    

 
//}

