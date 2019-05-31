/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodcitymanagement.controller;

import com.foodcitymanagement.dto.Order;
import com.foodcitymanagement.dto.OrderDetail;
import daofactory.Factory;
import daofactory.FoodCityFactory;
import daointerface.OrderDao;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Sanu Vithanage
 */
public class OrderController {

    private static FoodCityFactory factory = Factory.getFoodCityFactory();
    private static OrderDao OrderDao = factory.getOrderDao();

    public static boolean addOrder(Order order, ArrayList<OrderDetail> detail) throws ClassNotFoundException, SQLException {
        return OrderDao.addOrder(order, detail);
    }

    public static Order getOrder(String orderId) throws SQLException, ClassNotFoundException {
        return OrderDao.getOrder(orderId);
    }

    public static boolean updateOredr(Order order, ArrayList<OrderDetail> detail, String orderId) throws ClassNotFoundException, SQLException {
        return OrderDao.updateOredr(order, detail, orderId);
    }

    public static ArrayList<Order> getAllOrders() throws ClassNotFoundException, SQLException {
        return OrderDao.getAllOrders();
    }
}
