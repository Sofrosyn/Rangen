/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


 
public class configs {
    private static final String SQLITECONN = "jdbc:sqlite:Games.sqlite";

    public static Connection getConnection() throws SQLException{

        try {
            Class.forName("org.sqlite.JDBC");
            System.out.println("get connection");
            return DriverManager.getConnection(SQLITECONN);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
                      /**
	 * Checks if is db connected.
	 *
	 * @return true, if connected
	 */
	

}
