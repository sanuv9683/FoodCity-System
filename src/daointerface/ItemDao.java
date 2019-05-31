/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daointerface;

import com.foodcitymanagement.dto.Item;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Sanu Vithanage
 */
public interface ItemDao {

    public boolean addItem(Item item)throws ClassNotFoundException, SQLException;

    public Item searchItem(String code)throws ClassNotFoundException, SQLException;

    public boolean updateItem(Item item)throws ClassNotFoundException, SQLException;

    public boolean deleteItem(String code)throws ClassNotFoundException, SQLException;

    public ArrayList<Item> getAllItems()throws ClassNotFoundException, SQLException;

    public boolean updateItemQty(String name, double qty)throws ClassNotFoundException, SQLException;

    public Item findQtyByName(String name)throws ClassNotFoundException, SQLException;

    public boolean cancelQtyUpdate(ArrayList<Item> itemList)throws ClassNotFoundException, SQLException;

    public String getDescription(String code)throws ClassNotFoundException, SQLException;
}
