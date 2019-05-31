/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodcitymanagement.controller;

import com.foodcitymanagement.dto.Customer;
import daofactory.Factory;
import daofactory.FoodCityFactory;
import daointerface.CustomerDao;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Sanu Vithanage
 */
public class CustomerController {

    private static FoodCityFactory factory = Factory.getFoodCityFactory();
    private static CustomerDao customerDao = factory.getCustomerDao();

    public static boolean addCustomer(Customer customer) throws ClassNotFoundException, SQLException {
        return customerDao.addCustomer(customer);
    }

    public static boolean updateCustomer(Customer customer) throws ClassNotFoundException, SQLException {
        return customerDao.updateCustomer(customer);
    }

    public static Customer searchCustomer(String id) throws ClassNotFoundException, SQLException {
        return customerDao.searchCustomer(id);
    }

    public static boolean deleteCustomer(String id) throws ClassNotFoundException, SQLException {
        return customerDao.deleteCustomer(id);
    }

    public static ArrayList<Customer> getAllCustomers() throws ClassNotFoundException, SQLException {
        return customerDao.getAllCustomers();

    }

}
