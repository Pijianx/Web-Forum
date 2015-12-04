/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum;

/**
 *
 * @author derrick
 */
import java.sql.*;
import javax.sql.DataSource;
import javax.naming.InitialContext;


public class ConnectionPool {
    private static ConnectionPool pool = null;
    private static DataSource dataSource = null;
    
    private ConnectionPool()  //first time ive seen a private constructor
    {
        try
        {
            InitialContext ic = new InitialContext();
            dataSource = (DataSource)
                    ic.lookup("jdbc:mysql://localhost:3306/Database"); //dont know about this maybe use 
            //previous mapping url
            // "jdbc:mysql://localhost:3306/Database"
            //was this before  "java:/comp/env/jdbc/Database123"
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static ConnectionPool getInstance()
    {
        if(pool==null)
        {
            pool = new ConnectionPool();
        }
        return pool;
    }
    public Connection getConnection()
    {
        try
        {
            return dataSource.getConnection();
        }
        catch(SQLException sqle)
        {
            sqle.printStackTrace();
            return null;
        }
    }
    public void freeConnection(Connection c)
    {
        try
        {
            c.close();
        }
        catch(SQLException sqle)
        {
            sqle.printStackTrace();
        }
    }
    
}
