/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daointerface;

import com.foodcitymanagement.dto.OrderDetail;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Sanu Vithanage
 */
public interface OrderDetailDao {

    public ArrayList<OrderDetail> getOrderDetail(String orderId) throws ClassNotFoundException, SQLException;

    public ArrayList<OrderDetail> getAllOrderDetail() throws ClassNotFoundException, SQLException;

    public boolean addOrderDetail(ArrayList<OrderDetail> details) throws ClassNotFoundException, SQLException;
    
    
}
