/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saveData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Sofrosync
 */
public class DbConnection {
  	//    private static final String USERNAME = "dbuser";
//    private static final String PASSWORD = "dbpassword";
	
//    private static final String CONN = "jdbc:mysql:localhost/login";
    private static final String SQLITECONN ="jdbc:sqlite:Secrets.sqlite";
    public static Connection conn;
    
    public static Connection getConnection() throws SQLException{

        try {
        	 Class.forName("org.sqlite.JDBC");
        	 System.out.println("connected");
             return DriverManager.getConnection(SQLITECONN);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static ResultSet dbExecuteQuery(String query) throws SQLException, ClassNotFoundException {
        PreparedStatement pst = null;
        ResultSet result = null;
        conn = DbConnection.getConnection();
        pst = conn.prepareStatement(query);
        System.out.println("Execute query dbExecutequery");
         result = pst.executeQuery(); 
      
   return result;
    }

    public static void dbExecuteUpdate(String updateQuery) throws SQLException, ClassNotFoundException {
	Statement stmt = null;
		// Connection
		getConnection();
		// stmnt
		stmt = conn.createStatement();
		// Execute
		stmt.executeUpdate(updateQuery);
                System.out.println("Execute ");
                conn.setAutoCommit(false);
		conn.commit();
}
                      /**
	 * Checks if is db connected.
	 *
	 * @return true, if connected
	 */
	
	}

        
        
        
        
        
        
        
        
        
        
        
        

