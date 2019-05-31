/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodcitymanagement.controller;

import com.foodcitymanagement.dto.User;
import daofactory.Factory;
import daofactory.FoodCityFactory;
import daointerface.UserDao;
import java.sql.SQLException;

/**
 *
 * @author Sanu Vithanage
 */
public class UserController {

    private static FoodCityFactory factory = Factory.getFoodCityFactory();
    private static UserDao userdao = factory.getUserDao();

    public static boolean addUser(User user) throws ClassNotFoundException, SQLException {
        return userdao.addUser(user);
    }

    public static User searchItem(String code) throws ClassNotFoundException, SQLException {
        return userdao.searchUser(code);
    }

    public static boolean updateItem(User user) throws SQLException, ClassNotFoundException {
        return userdao.updateUser(user);
    }

    public static boolean deleteUser(String code) throws ClassNotFoundException, SQLException {
        return userdao.deleteUser(code);
    }
}
