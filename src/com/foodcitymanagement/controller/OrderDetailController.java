/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodcitymanagement.controller;

import com.foodcitymanagement.dto.OrderDetail;
import daofactory.Factory;
import daofactory.FoodCityFactory;
import daointerface.OrderDetailDao;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Sanu Vithanage
 */
public class OrderDetailController {

    private static FoodCityFactory factory = Factory.getFoodCityFactory();
    private static OrderDetailDao orderDetailsDao = factory.getOrderDetailDao();

    public static ArrayList<OrderDetail> getOrderDetail(String orderId) throws ClassNotFoundException, SQLException {
        return orderDetailsDao.getOrderDetail(orderId);
    }

    public static ArrayList<OrderDetail> getAllOrderDetail() throws ClassNotFoundException, SQLException {
        return orderDetailsDao.getAllOrderDetail();
    }
}
