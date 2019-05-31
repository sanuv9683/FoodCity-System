/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodcitymanagement.dao;

import com.foodcitymanagement.db.DBConnection;
import com.foodcitymanagement.dto.Customer;
import daointerface.CustomerDao;
import java.sql.*;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class CustomerDaoMysql implements CustomerDao {

    private final static ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    @Override
    public boolean addCustomer(Customer customer) throws ClassNotFoundException, SQLException {
        try {
            readWriteLock.writeLock().lock();
            String sql = "insert into Customer values(?,?,?,?)";
            Connection connection = DBConnection.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, customer.getCusId());
            statement.setString(2, customer.getName());
            statement.setString(3, customer.getAddress());
            statement.setString(4, customer.getTpNo());
            return !statement.execute();
        } finally {
            readWriteLock.writeLock().unlock();
        }
    }

    @Override
    public boolean updateCustomer(Customer customer) throws ClassNotFoundException, SQLException {
        try {
            readWriteLock.writeLock().lock();
            String sql = "Update Customer set name=?,address=?,tpNo=? where cusid=?";
            Connection connection = DBConnection.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, customer.getName());
            statement.setString(2, customer.getAddress());
            statement.setString(3, customer.getTpNo());
            statement.setString(4, customer.getCusId());
            return !statement.execute();
        } finally {
            readWriteLock.writeLock().unlock();
        }
    }

    @Override
    public Customer searchCustomer(String id) throws ClassNotFoundException, SQLException {
        try {
            readWriteLock.readLock().lock();
            String sql = "Select * from Customer where cusid='" + id + "'";
            Connection connection = DBConnection.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            Customer customer = null;
            while (resultSet.next()) {
                String cid = resultSet.getString("cusid");
                String cname = resultSet.getString("name");
                String caddress = resultSet.getString("address");
                String csalary = resultSet.getString("tpNo");

                customer = new Customer(cid, cname, caddress, csalary);
            }
            return customer;
        } finally {
            readWriteLock.readLock().unlock();
        }
    }

    @Override
    public boolean deleteCustomer(String id) throws ClassNotFoundException, SQLException {
        try {
            readWriteLock.writeLock().lock();
            String sql = "delete from Customer where cusid='" + id + "'";
            Connection connection = DBConnection.getConnection();
            Statement statement = connection.createStatement();
            return !statement.execute(sql);
        } finally {
            readWriteLock.writeLock().unlock();
        }
    }

    @Override
    public ArrayList<Customer> getAllCustomers() throws ClassNotFoundException, SQLException {
        try {
            readWriteLock.readLock().lock();
            String sql = "Select * from Customer";
            Connection connection = DBConnection.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            ArrayList<Customer> customers = new ArrayList<>();
            while (resultSet.next()) {
                String cid = resultSet.getString("cusid");
                String cname = resultSet.getString("name");
                String caddress = resultSet.getString("address");
                String csalary = resultSet.getString("tpNo");

                Customer customer = new Customer(cid, cname, caddress, csalary);
                customers.add(customer);
            }
            return customers;
        } finally {
            readWriteLock.readLock().unlock();
        }
    }

}
