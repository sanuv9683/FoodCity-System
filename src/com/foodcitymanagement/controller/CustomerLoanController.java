/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodcitymanagement.controller;

import com.foodcitymanagement.dto.CustomerLoan;
import daofactory.Factory;
import daofactory.FoodCityFactory;

import daointerface.CustomerLoanDao;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Sanu Vithanage
 */
public class CustomerLoanController {

    private static FoodCityFactory factory = Factory.getFoodCityFactory();
    private static CustomerLoanDao customerLoanDao = factory.getCustomerLoanDao();

    public static boolean addCustomerLoan(CustomerLoan customerLoan) throws ClassNotFoundException, SQLException {
        return customerLoanDao.addCustomerLoan(customerLoan);
    }

    public static boolean updateCustomerLoan(CustomerLoan customerLoan,String loanID) throws ClassNotFoundException, SQLException {
        return customerLoanDao.updateCustomerLoan(customerLoan,loanID);
    }

    public static CustomerLoan searchCustomerLoan(String id) throws ClassNotFoundException, SQLException {
        return customerLoanDao.searchCustomerLoan(id);
    }

    public static boolean deleteCustomerLoan(String id) throws ClassNotFoundException, SQLException {
        return customerLoanDao.deleteCustomerLoan(id);
    }

    public static ArrayList<CustomerLoan> getAllCustomersLoan() throws ClassNotFoundException, SQLException {
        return customerLoanDao.getAllCustomersLoans();

    }
}
