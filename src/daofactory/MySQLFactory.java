/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daofactory;

import com.foodcitymanagement.dao.CustomerDaoMysql;
import com.foodcitymanagement.dao.CustomerLoanDaoMysql;
import com.foodcitymanagement.dao.ItemDaoMysql;
import com.foodcitymanagement.dao.OrderDaoMysql;
import com.foodcitymanagement.dao.OrderDetailDaoMysql;
import com.foodcitymanagement.dao.UserDaoMysql;
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
public class MySQLFactory implements FoodCityFactory {

    @Override
    public CustomerDao getCustomerDao() {
        return new CustomerDaoMysql();
    }

    @Override
    public ItemDao getItemDao() {
        return new ItemDaoMysql();
    }

    @Override
    public OrderDao getOrderDao() {
        return new OrderDaoMysql();
    }

    @Override
    public OrderDetailDao getOrderDetailDao() {
        return new OrderDetailDaoMysql();
    }

    @Override
    public CustomerLoanDao getCustomerLoanDao() {
        return new CustomerLoanDaoMysql();
    }

    @Override
    public UserDao getUserDao() {
       return new UserDaoMysql();
    }

}
