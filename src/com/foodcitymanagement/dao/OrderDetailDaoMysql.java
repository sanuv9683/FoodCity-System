/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodcitymanagement.dao;

import com.foodcitymanagement.db.DBConnection;
import com.foodcitymanagement.dto.OrderDetail;
import daointerface.OrderDetailDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class OrderDetailDaoMysql implements OrderDetailDao {

    @Override
    public ArrayList<OrderDetail> getOrderDetail(String orderId) throws ClassNotFoundException, SQLException {
        String sql = "select * from orderDetail where orderId='" + orderId + "'";
        Connection connection = DBConnection.getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<OrderDetail> list = new ArrayList<>();
        while (rst.next()) {
            OrderDetail orderDetail = new OrderDetail(rst.getString("orderId"), rst.getString("itemCode"), rst.getInt("qty"), rst.getDouble("unitPrice"),rst.getDouble("amount"));
            list.add(orderDetail);
        }
        return list;
    }

    @Override
    public ArrayList<OrderDetail> getAllOrderDetail() throws ClassNotFoundException, SQLException {
        String sql = "select * from orderDetail ";
        Connection connection = DBConnection.getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<OrderDetail> list = new ArrayList<>();
        while (rst.next()) {
            OrderDetail orderDetail = new OrderDetail(rst.getString("orderId"), rst.getString("itemCode"), rst.getInt("qty"), rst.getDouble("unitPrice"),rst.getDouble("amount"));
            list.add(orderDetail);
        }
        return list;
    }

    @Override
    public boolean addOrderDetail(ArrayList<OrderDetail> detail) throws ClassNotFoundException, SQLException {
        boolean isTrue = false;
        String sql = "Insert into OrderDetail Values(?,?,?,?)";
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        for (OrderDetail detail1 : detail) {
            statement.setString(1, detail1.getOrderId());
            statement.setString(2, detail1.getItemCode());
            statement.setDouble(3, detail1.getQty());
            statement.setDouble(4, detail1.getUnitPrice());
            statement.setDouble(5, detail1.getAmount());
            statement.execute();
            isTrue = true;
        }
        return isTrue;
    }

}
