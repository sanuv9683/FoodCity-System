/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daofactory;

/**
 *
 * @author Sanu Vithanage
 */
public class Factory {

    public static FoodCityFactory getFoodCityFactory() {
        return new MySQLFactory();
    }
}
