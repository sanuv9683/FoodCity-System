/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodcitymanagement.dao;

import com.foodcitymanagement.db.DBConnection;
import com.foodcitymanagement.dto.Item;
import com.foodcitymanagement.dto.User;
import daointerface.UserDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 *
 * @author Sanu Vithanage
 */
public class UserDaoMysql implements UserDao {

    private final ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    @Override
    public boolean addUser(User user) throws ClassNotFoundException, SQLException {
        try {
            readWriteLock.writeLock().lock();
            String sql = "Insert into user values(?,?)";
            Connection connection = DBConnection.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, user.getUserName());
            statement.setString(2, user.getUserPass());

            return !statement.execute();
        } finally {
            readWriteLock.writeLock().unlock();
        }
    }

    @Override
    public boolean updateUser(User user) throws ClassNotFoundException, SQLException {
        try {
            readWriteLock.writeLock().lock();
            String sql = "Update user set passW=? where userN=?";
            Connection connection = DBConnection.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, user.getUserPass());
            statement.setString(2, user.getUserName());

            return !statement.execute();
        } finally {
            readWriteLock.writeLock().lock();
        }
    }

    @Override
    public User searchUser(String idd) throws ClassNotFoundException, SQLException {
         try {
            readWriteLock.readLock().lock();
            String sql = "select * from user where userN='" + idd + "'";
            Connection connection = DBConnection.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            User user = null;
            while (resultSet.next()) {
                String userName = resultSet.getString("userN");
                String userPass = resultSet.getString("passW");
               

                user = new User(userName, userPass);
            }
            return user;
        } finally {
            readWriteLock.readLock().unlock();
        }
    }

    @Override
    public boolean deleteUser(String id) throws ClassNotFoundException, SQLException {
        return true;
    }

}
