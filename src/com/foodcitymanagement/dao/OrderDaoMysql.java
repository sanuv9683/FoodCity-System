/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodcitymanagement.dao;

import com.foodcitymanagement.db.DBConnection;
import com.foodcitymanagement.dto.Order;
import com.foodcitymanagement.dto.OrderDetail;
import daointerface.OrderDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.swing.JOptionPane;

public class OrderDaoMysql implements OrderDao {

    private ReentrantReadWriteLock rwLock = new ReentrantReadWriteLock();

    @Override
    public boolean addOrder(Order order, ArrayList<OrderDetail> detail) throws ClassNotFoundException, SQLException {

        String sql = "insert into Orders values(?,?,?)";
        Connection connection = DBConnection.getConnection();
        connection.setAutoCommit(false);
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, order.getId());
            statement.setString(2, order.getDate());
            statement.setString(3, order.getCustomerId());
            int res = statement.executeUpdate();

            if (res > 0) {
                int ress = 0;
                String query = "INSERT INTO OrderDetail VALUES(?,?,?,?,?)";

                for (OrderDetail orderDetail : detail) {

                    PreparedStatement stm = connection.prepareStatement(query);
                    stm.setObject(1, orderDetail.getOrderId());
                    stm.setObject(2, orderDetail.getItemCode());
                    stm.setObject(3, orderDetail.getQty());
                    stm.setObject(4, orderDetail.getUnitPrice());
                    stm.setObject(5, orderDetail.getAmount());
                    ress += stm.executeUpdate();

                }

                if (detail.size() == ress) {
                    connection.commit();
                    return true;
                } else {
                    connection.rollback();
                    return false;

                }
            }
            return false;
        } finally {

            connection.setAutoCommit(true);

        }
    }

    @Override
    public Order getOrder(String orderId) throws SQLException, ClassNotFoundException {

        String sql = "select * from orders where orderId='" + orderId + "'";
        Connection conn = DBConnection.getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        Order order = new Order();
        while (rst.next()) {
            order.setId(rst.getString("orderId"));
            order.setCustomerId(rst.getString("customerId"));
            order.setDate(rst.getString("date"));
        }
        return order;
    }

    @Override
    public boolean updateOredr(Order order, ArrayList<OrderDetail> details, String orderId) throws ClassNotFoundException, SQLException {
        String sql = " update orders set date=?,customerId=? where orderId=?";
        Connection connection = DBConnection.getConnection();
        connection.setAutoCommit(false);
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, order.getDate());
            statement.setString(2, order.getCustomerId());
            statement.setString(3, order.getId());

            int ress = statement.executeUpdate();

            if (ress > 0) {

                String sq = "delete  from orderDetail where OrderId='" + orderId + "'";
                Statement stmm = connection.createStatement();
                int d = stmm.executeUpdate(sq);

                if (d > 0) {
                    int isTrue = 0;
                    String query = "INSERT INTO OrderDetail VALUES(?,?,?,?,?)";

                    for (OrderDetail orderDetail : details) {

                        PreparedStatement stm = connection.prepareStatement(query);
                        stm.setObject(1, orderDetail.getOrderId());
                        stm.setObject(2, orderDetail.getItemCode());
                        stm.setObject(3, orderDetail.getQty());
                        stm.setObject(4, orderDetail.getUnitPrice());
                        stm.setObject(5, orderDetail.getAmount());
                        isTrue += stm.executeUpdate();
                        //JOptionPane.showMessageDialog(null, "od update " + isTrue);

                    }
                    if (details.size() == isTrue) {
                        connection.commit();
                        return true;
                    } else {
                        connection.rollback();
                        return false;
                    }
                } else {
                    connection.rollback();
                    return false;
                }
            }
            return false;
        } finally {
            connection.setAutoCommit(true);
        }
    }

    @Override
    public ArrayList<Order> getAllOrders() throws ClassNotFoundException, SQLException {
        String sql = "select * from orders";
        Connection connection = DBConnection.getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<Order> list = new ArrayList<>();
        while (rst.next()) {
            Order order = new Order(rst.getString("id"), rst.getDate("date").toString(), rst.getString("customerId"));
            list.add(order);
        }
        return list;
    }

}
