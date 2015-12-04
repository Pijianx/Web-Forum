/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum;
import java.io.*;
import forum.User;


/**
 *
 * @author derrick
 */
public class UserIO 
{
    public static void add(User user, String filepath) throws IOException
    {
        File file= new File(filepath);
        PrintWriter out= new PrintWriter(
                new FileWriter(file,true));
        out.println(
                user.getFirstName()+""
                +user.getLastName()+""
                +user.getEmailAddress());
        out.close();
        
        
    }
    
}
