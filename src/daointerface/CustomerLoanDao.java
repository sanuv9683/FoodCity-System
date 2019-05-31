/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daointerface;

import com.foodcitymanagement.dto.CustomerLoan;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Sanu Vithanage
 */
public interface CustomerLoanDao {

    public boolean addCustomerLoan(CustomerLoan customerLoan) throws ClassNotFoundException, SQLException;

    public boolean updateCustomerLoan(CustomerLoan customerLoan,String loanID) throws ClassNotFoundException, SQLException;

    public CustomerLoan searchCustomerLoan(String id) throws ClassNotFoundException, SQLException;

    public boolean deleteCustomerLoan(String id) throws ClassNotFoundException, SQLException;

    public ArrayList<CustomerLoan> getAllCustomersLoans() throws ClassNotFoundException, SQLException;
}
