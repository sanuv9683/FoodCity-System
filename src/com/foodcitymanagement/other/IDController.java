/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodcitymanagement.other;


import com.foodcitymanagement.db.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Sanu Vithanage
 */
public class IDController {
     public static String getLastID(String tableName, String colName) throws SQLException, ClassNotFoundException {
        String sql = "select " + colName + " from " + tableName + " order by 1 desc limit 1";
        Connection conn = DBConnection.getConnection();

        Statement stm = conn.createStatement();
        ResultSet rst=stm.executeQuery(sql);
        if (rst.next()) {
            return  rst.getString(1);
        }
        return null;  
    }
}
