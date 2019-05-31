/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodcitymanagement.dao;

import com.foodcitymanagement.db.DBConnection;
import com.foodcitymanagement.dto.CustomerLoan;
import daointerface.CustomerLoanDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.swing.JOptionPane;

/**
 *
 * @author Sanu Vithanage
 */
public class CustomerLoanDaoMysql implements CustomerLoanDao {

    private final static ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    @Override
    public boolean addCustomerLoan(CustomerLoan customerLoan) throws ClassNotFoundException, SQLException {
        try {
            readWriteLock.writeLock().lock();
            String sql = "insert into customerLoan values(?,?,?,?,?,?)";
            Connection connection = DBConnection.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, customerLoan.getLoanId());
            statement.setString(2, customerLoan.getCusId());
            statement.setString(3, customerLoan.getCusName());
            statement.setString(4, customerLoan.getOrderId());
            statement.setString(5, customerLoan.getDate());
            statement.setString(6, Double.toString(customerLoan.getAmount()));
            return !statement.execute();
        } finally {
            readWriteLock.writeLock().unlock();
        }
    }

    @Override
    public CustomerLoan searchCustomerLoan(String id) throws ClassNotFoundException, SQLException {
        try {
            readWriteLock.readLock().lock();
            String sql = "Select * from customerLoan where loanID='" + id + "'";
            Connection connection = DBConnection.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            CustomerLoan customerLoan = null;
            while (resultSet.next()) {
                String loanid = resultSet.getString("loanID");
                String cID = resultSet.getString("cus");
                String cname = resultSet.getString("cusName");
                String caddress = resultSet.getString("orderId");
                String dateD = resultSet.getString("date");
                Double csalary = Double.parseDouble(resultSet.getString("amount"));

                customerLoan = new CustomerLoan(loanid, cID, cname, caddress, dateD, csalary);
            }
            return customerLoan;
        } finally {
            readWriteLock.readLock().unlock();
        }
    }

    @Override
    public boolean deleteCustomerLoan(String id) throws ClassNotFoundException, SQLException {
        try {
            readWriteLock.writeLock().lock();
            String sql = "delete from customerLoan where loanID='" + id + "'";
            Connection connection = DBConnection.getConnection();
            Statement statement = connection.createStatement();
            return !statement.execute(sql);
        } finally {
            readWriteLock.writeLock().unlock();
        }
    }

    @Override
    public ArrayList<CustomerLoan> getAllCustomersLoans() throws ClassNotFoundException, SQLException {
        try {
            readWriteLock.readLock().lock();
            String sql = "Select * from customerLoan";
            Connection connection = DBConnection.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            ArrayList<CustomerLoan> customerLoans = new ArrayList<>();
            while (resultSet.next()) {
                String loanID = resultSet.getString("loanID");
                String cID = resultSet.getString("cus");
                String cname = resultSet.getString("cusName");
                String caddress = resultSet.getString("orderId");
                String dateD = resultSet.getString("date");
                Double csalary = Double.parseDouble(resultSet.getString("amount"));

                CustomerLoan customerLoan = new CustomerLoan(loanID, cID, cname, caddress, dateD, csalary);
                customerLoans.add(customerLoan);
            }
            return customerLoans;
        } finally {
            readWriteLock.readLock().unlock();
        }
    }

    @Override
    public boolean updateCustomerLoan(CustomerLoan customerLoan, String loanID) throws ClassNotFoundException, SQLException {
        try {
            readWriteLock.writeLock().lock();
            String sql = "Update customerLoan set cus=?,cusName=?,orderId=?,date=?,amount=? where loanID=?";
            Connection connection = DBConnection.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, customerLoan.getCusId());
            statement.setString(2, customerLoan.getCusName());
            statement.setString(3, customerLoan.getOrderId());
            statement.setString(4, customerLoan.getDate());
            statement.setString(5, Double.toString(customerLoan.getAmount()));
            statement.setString(6, customerLoan.getLoanId());
            return !statement.execute();
        } finally {
            readWriteLock.writeLock().unlock();
        }

    }

}
