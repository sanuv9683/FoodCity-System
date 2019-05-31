/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daointerface;

import com.foodcitymanagement.dto.User;
import java.sql.SQLException;

/**
 *
 * @author Sanu Vithanage
 */
public interface UserDao {
     public boolean addUser(User user) throws ClassNotFoundException, SQLException;

    public boolean updateUser(User user)throws ClassNotFoundException, SQLException;

    public User searchUser(String id)throws ClassNotFoundException, SQLException;

    public boolean deleteUser(String id)throws ClassNotFoundException, SQLException;
}
