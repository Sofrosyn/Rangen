/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBHandler {
    
    
     Connection connection;

    public DBHandler(){
        try {
            connection = configs.getConnection();
            System.out.println("get login connection");
        } catch(SQLException e){
            e.printStackTrace();
        }

        if (this.connection == null){
            System.exit(1);
        }
    }

    public boolean isDatabaseConnected(){
        return this.connection != null;
    }

    public boolean checkLoginData(String user, String pass) throws Exception
    {
        PreparedStatement pr = null;
        ResultSet result = null;

        String sql = "select * from loginInfo where username = ? and password = ?";

        try {
            
          pr = connection.prepareStatement(sql);
          pr.setString(1, user);
          pr.setString(2, pass);
          ResultSet rs= pr.executeQuery();
          
           System.out.println("execute query");
            return rs.next();
            
        }
        catch (SQLException e){
            System.out.println("not execute query");
           
            return false;
        }catch (NullPointerException e){
            System.out.println("not execute query");
           
            return false;
        }
       
    
    
    
    }
    
}
