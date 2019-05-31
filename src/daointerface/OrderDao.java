/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daointerface;

import com.foodcitymanagement.dto.Order;
import com.foodcitymanagement.dto.OrderDetail;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Sanu Vithanage
 */
public interface OrderDao {

    public boolean addOrder(Order order, ArrayList<OrderDetail> detail) throws ClassNotFoundException, SQLException;

    public Order getOrder(String orderId) throws SQLException, ClassNotFoundException;

    public boolean updateOredr(Order order, ArrayList<OrderDetail> detail, String orderId) throws ClassNotFoundException, SQLException;

    public ArrayList<Order> getAllOrders() throws ClassNotFoundException, SQLException;
}
