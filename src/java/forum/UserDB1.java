/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum;
import java.sql.*;

/**
 *
 * @author derrick
 */
public class UserDB1 {
   public static int insert(User user)
   {
       try{
    Class.forName("com.mysql.jdbc.Driver");
            String dbURL = "jdbc:mysql://localhost:3306/Database"; //should be sql database it connects to
            String username = "root";
            String password= "mindgamesforfun";
            Connection connection = DriverManager.getConnection(
                dbURL, username, password);
    PreparedStatement ps=null;
    //worse comes to worse i think in my servlet this is where i insert stuff in
    
    String query= 
            "INSERT INTO Satisfy (Exp, Content, Age, LikeToSee, EmailAddress)"+
            "VALUES (?, ?, ?, ?, ?)";
    
        ps = connection.prepareStatement(query);
        ps.setString(1, user.getExp());
        ps.setString(2, user.getContent());
        ps.setString(3, user.getAge());
        ps.setString(4, user.getLikeToSee());
        ps.setString(5, user.getEmailAddress());
        return ps.executeUpdate();
    }
           catch(ClassNotFoundException e)
        {
            e.printStackTrace();
            return 0;
        }
    catch(SQLException e)
    {
        e.printStackTrace();
        return 0;
    }
    finally
    {
        //DBUtil.closePreparedStatement(ps); //need the utility class first me thinfs
      //  pool.freeConnection(connection);
        //should insert free connection
    }
}
   
   public static int update(User user)
   {
      try{
    Class.forName("com.mysql.jdbc.Driver");
            String dbURL = "jdbc:mysql://localhost:3306/Database"; //should be sql database it connects to
            String username = "root";
            String password= "mindgamesforfun";
            Connection connection = DriverManager.getConnection(
                dbURL, username, password);
       PreparedStatement ps = null;
       Statement stmnt = null; //just added this in
       String query = "update User set FirstName = ?, LastName = ? where EmailAddress = ?";
      // String query = "UPDATE User SET " +
         //      "FirstName ="+user.getFirstName() +
          //     " LastName ="+user.getLastName() +
          //     " WHERE EmailAddress ="+user.getEmailAddress()+""; //changed this obv
      // String query= "UPDATE Database.User set name= the name to change, age= (their age) where EmailAddress=(employee id);";
            ps = connection.prepareStatement(query);
            ps.setString(1, user.getFirstName());
            ps.setString(2, user.getLastName());
            ps.setString(3, user.getEmailAddress());
            return ps.executeUpdate();
           //return stmnt.executeUpdate(query);
            //return 1;
       }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
            return 0;
        }
       catch(SQLException e)
       {
           e.printStackTrace();
           return 0;
       }
       finally
       {
          // DBUtil.closePreparedStatement(ps);
          // pool.freeConnection(connection);
           
       }
   }
   public static int delete(User user)
   {
        try{
    Class.forName("com.mysql.jdbc.Driver");
            String dbURL = "jdbc:mysql://localhost:3306/Database"; //should be sql database it connects to
            String username = "root";
            String password= "mindgamesforfun";
            Connection connection = DriverManager.getConnection(
                dbURL, username, password);
       PreparedStatement ps = null;
       
       String query = "DELETE FROM User " +
               "WHERE EmailAddress = ?";
      
            ps = connection.prepareStatement(query);
            ps.setString(1, user.getEmailAddress()); //this is set for email address for priority i think
            
           
            return ps.executeUpdate();
       }
         catch(ClassNotFoundException e)
        {
            e.printStackTrace();
            return 0;
        }
       catch(SQLException e)
       {
           e.printStackTrace();
           return 0;
       }
       finally
       {
         //  DBUtil.closePreparedStatement(ps);
         //  pool.freeConnection(connection);
           
       }
   }
     public static boolean emailExists(String emailAddress)
   {
        try{
    Class.forName("com.mysql.jdbc.Driver");
            String dbURL = "jdbc:mysql://localhost:3306/Database"; //should be sql database it connects to
            String username = "root";
            String password= "mindgamesforfun";
            Connection connection = DriverManager.getConnection(
                dbURL, username, password);
       PreparedStatement ps = null;
       ResultSet rs= null;
       
       String query = "SELECT EmailAddress FROM User " +
                "WHERE EmailAddress = ?";
       
            ps = connection.prepareStatement(query);
            ps.setString(1, emailAddress);
            rs = ps.executeQuery();
            return rs.next();
            
       }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
            return false;
        }
       catch(SQLException e)
       {
           e.printStackTrace();
           return false;
       }
       finally
       {
          // DBUtil.closeResultSet(rs);
         // DBUtil.closePreparedStatement(ps);
         //  pool.freeConnection(connection);
           
       }
   } 
     
     public static User selectUser(String emailAddress)
   {
         try{
    Class.forName("com.mysql.jdbc.Driver");
            String dbURL = "jdbc:mysql://localhost:3306/Database"; //should be sql database it connects to
            String username = "root";
            String password= "mindgamesforfun";
            Connection connection = DriverManager.getConnection(
                dbURL, username, password);
       PreparedStatement ps = null;
       ResultSet rs=null;
       
       String query = "SELECT * FROM User " +
                      "WHERE EmailAddress = ?";
      
            ps = connection.prepareStatement(query);
            ps.setString(1, emailAddress);
            rs = ps.executeQuery();
            User user = null;
            if(rs.next())
            {
                user = new User();
                user.setFirstName(rs.getString("FirstName"));
                user.setLastName(rs.getString("LastName"));
                user.setEmailAddress(rs.getString("EmailAddress"));
            }
            return user;
       }
       catch(ClassNotFoundException e)
        {
            e.printStackTrace();
            return null;
        }
       catch(SQLException e)
       {
           e.printStackTrace();
           return null;
       }
       finally
       {
         //  DBUtil.closeResultSet(rs);
         //  DBUtil.closePreparedStatement(ps);
         //  pool.freeConnection(connection);
           
       }
   }
}
