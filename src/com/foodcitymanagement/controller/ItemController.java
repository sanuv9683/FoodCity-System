/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodcitymanagement.controller;

import com.foodcitymanagement.dto.Item;
import daofactory.Factory;
import daofactory.FoodCityFactory;
import daointerface.ItemDao;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Sanu Vithanage
 */
public class ItemController {

    private static FoodCityFactory factory = Factory.getFoodCityFactory();
    private static ItemDao itemDao = factory.getItemDao();

    public static boolean addItem(Item item) throws ClassNotFoundException, SQLException {
        return itemDao.addItem(item);
    }

    public static Item searchItem(String code) throws ClassNotFoundException, SQLException {
        return itemDao.searchItem(code);
    }

    public static boolean updateItem(Item item) throws SQLException, ClassNotFoundException {
        return itemDao.updateItem(item);
    }

    public static boolean deleteItem(String code) throws ClassNotFoundException, SQLException {
        return itemDao.deleteItem(code);
    }

    public static ArrayList<Item> getAllItems() throws SQLException, ClassNotFoundException {
        return itemDao.getAllItems();
    }

    public static boolean updateItemQty(String name, double qty) throws ClassNotFoundException, SQLException {
        return itemDao.updateItemQty(name, qty);
    }

    public static Item findQtyByName(String name) throws ClassNotFoundException, SQLException {
        return itemDao.findQtyByName(name);
    }

    public static boolean cancelQtyUpdate(ArrayList<Item> itemList) throws ClassNotFoundException, SQLException {
        return itemDao.cancelQtyUpdate(itemList);
    }

    public static String getDescription(String code) throws ClassNotFoundException, SQLException {
        return itemDao.getDescription(code);
    }

}
