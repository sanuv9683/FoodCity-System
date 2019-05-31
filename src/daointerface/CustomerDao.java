/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daointerface;

import com.foodcitymanagement.dto.Customer;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Sanu Vithanage
 */
public interface CustomerDao {

    public boolean addCustomer(Customer customer) throws ClassNotFoundException, SQLException;

    public boolean updateCustomer(Customer customer)throws ClassNotFoundException, SQLException;

    public Customer searchCustomer(String id)throws ClassNotFoundException, SQLException;

    public boolean deleteCustomer(String id)throws ClassNotFoundException, SQLException;

    public ArrayList<Customer> getAllCustomers()throws ClassNotFoundException, SQLException;

}
