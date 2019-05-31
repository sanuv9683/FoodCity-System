/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daofactory;

import daointerface.CustomerDao;
import daointerface.CustomerLoanDao;
import daointerface.ItemDao;
import daointerface.OrderDao;
import daointerface.OrderDetailDao;
import daointerface.UserDao;

/**
 *
 * @author Sanu Vithanage
 */
public interface FoodCityFactory {

    public CustomerDao getCustomerDao();

    public ItemDao getItemDao();

    public OrderDao getOrderDao();

    public OrderDetailDao getOrderDetailDao();

    public CustomerLoanDao getCustomerLoanDao();

    public UserDao getUserDao();

}
