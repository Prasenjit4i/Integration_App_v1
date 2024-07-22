/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lease.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.naming.NamingException;
/**
 *
 * @author Prasenjit
 */
public class CallDBQuery {

    static Connection connection;
    static Statement statement;
    static ResultSet resultSet;
    static PreparedStatement ps;
    
    /**
     * Method to initialize DB connection
     * @throws SQLException
     * @throws NamingException
     * @throws ClassNotFoundException 
     */

    public static void dbInitialization() throws SQLException, NamingException, ClassNotFoundException {
        connection = DBConnection.getConnectionDS("PL");    //CLOUD
//        connection = DBConnection.getDBConnection();                //LOCAL
    }

    /**
     * Method to destroy DB connection
     * @throws SQLException 
     */
    public static void dbDestroy() throws SQLException {
        if (resultSet != null) {
            resultSet.close();
        }
        if (statement != null) {
            statement.close();
        }
        if (ps != null) {
            ps.close();
        }
        if (connection != null) {
            connection.close();
        }
    }

    
    public static Statement getStatement() throws SQLException{
        return connection.createStatement();
    }
        
}
