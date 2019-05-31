/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodcitymanagement.dao;

import com.foodcitymanagement.db.DBConnection;
import com.foodcitymanagement.dto.Item;
import daointerface.ItemDao;
import java.sql.*;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.swing.JOptionPane;

public class ItemDaoMysql implements ItemDao {

    private final ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    @Override
    public boolean addItem(Item item) throws ClassNotFoundException, SQLException {
        try {
            readWriteLock.writeLock().lock();
            String sql = "Insert into Item values(?,?,?,?)";
            Connection connection = DBConnection.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, item.getCode());
            statement.setString(2, item.getDescription());
            statement.setDouble(3, item.getUnitPrice());
            statement.setDouble(4, item.getQtyOnHand());
            return !statement.execute();
        } finally {
            readWriteLock.writeLock().unlock();
        }
    }

    @Override
    public Item searchItem(String code) throws ClassNotFoundException, SQLException {
        try {
            readWriteLock.readLock().lock();
            String sql = "select * from Item where code='" + code + "'";
            Connection connection = DBConnection.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            Item item = null;
            while (resultSet.next()) {
                String id = resultSet.getString("code");
                String description = resultSet.getString("description");
                Double unitprice = resultSet.getDouble("unitPrice");
                int qty = resultSet.getInt("qtyOnHand");

                item = new Item(code, description, unitprice, qty);
            }
            return item;
        } finally {
            readWriteLock.readLock().unlock();
        }
    }

    @Override
    public boolean updateItem(Item item) throws ClassNotFoundException, SQLException {
        try {
            readWriteLock.writeLock().lock();
            String sql = "Update Item set description=?,unitPrice=?,qtyOnHand=? where code=?";
            Connection connection = DBConnection.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, item.getDescription());
            statement.setDouble(2, item.getUnitPrice());
            statement.setDouble(3, item.getQtyOnHand());
            statement.setString(4, item.getCode());
            return !statement.execute();
        } finally {
            readWriteLock.writeLock().lock();
        }
    }

    @Override
    public boolean deleteItem(String code) throws ClassNotFoundException, SQLException {
        try {
            readWriteLock.writeLock().lock();
            String sql = "Delete from Item where code='" + code + "'";
            Connection connection = DBConnection.getConnection();
            Statement statement = connection.createStatement();
            return !statement.execute(sql);
        } finally {
            readWriteLock.writeLock().unlock();
        }
    }

    @Override
    public ArrayList<Item> getAllItems() throws ClassNotFoundException, SQLException {
        try {
            readWriteLock.readLock().lock();
            String query = "select * from Item";
            Connection connection = DBConnection.getConnection();
            Statement createStatement = connection.createStatement();
            ResultSet rst = createStatement.executeQuery(query);
            ArrayList<Item> itemList = new ArrayList<>();
            while (rst.next()) {
                Item item = new Item(rst.getString("code"), rst.getString("description"), rst.getDouble("unitPrice"), rst.getInt("qtyOnHand"));
                itemList.add(item);
            }
            return itemList;
        } finally {
            readWriteLock.readLock().unlock();
        }
    }

    @Override
    public boolean updateItemQty(String name, double qty) throws ClassNotFoundException, SQLException {
        String SQL = "update Item set qtyOnHand = '" + qty + "' where description='" + name + "' ";
        Connection connection = DBConnection.getConnection();
        Statement stm = connection.createStatement();
        int res = stm.executeUpdate(SQL);
        return res > 0;
    }

    @Override
    public Item findQtyByName(String name) throws ClassNotFoundException, SQLException {
        String sql = "select * from item where description='" + name + "' ";
        Connection connection = DBConnection.getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            Item item = new Item(rst.getString("code"), rst.getString("description"), rst.getDouble("unitPrice"), rst.getInt("qtyOnHand"));
            return item;
        } else {
            return null;
        }
    }

    @Override
    public boolean cancelQtyUpdate(ArrayList<Item> itemList) throws ClassNotFoundException, SQLException {
        String sql = "update item set description=?,unitPrice=?,qtyOnHand=? where code=? ";
        Connection connection = DBConnection.getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
        boolean isTrue = false;
        for (Item item : itemList) {
            stm.setObject(1, item.getDescription());
            stm.setObject(2, item.getUnitPrice());
            stm.setObject(3, item.getQtyOnHand());
            stm.setObject(4, item.getCode());
            stm.executeUpdate();
            isTrue = true;
        }
        return isTrue;
    }

    @Override
    public String getDescription(String code) throws ClassNotFoundException, SQLException {
        String sql = "select description from item where code='" + code + "'";
        Connection connection = DBConnection.getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        String des = "";
        while (rst.next()) {

            des = rst.getString("description");
        }
        return des;
    }

}
