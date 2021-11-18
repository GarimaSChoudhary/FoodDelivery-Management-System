/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.EcoSystem;
import Business.Menu.MenuDirectory;
import Business.Order.OrderDirectory;
import Business.Restaurant.RestaurantDirectory;

import Business.UserAccount.UserAccount;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author garima
 */
public class SystemAdminRole extends Role{

    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, EcoSystem system,
            CustomerDirectory customerDirectory, RestaurantDirectory restaurantDirectory,
            DeliveryManDirectory deliveryManDirectory, MenuDirectory menuDirectory, OrderDirectory orderDirectory) {
        return new SystemAdminWorkAreaJPanel(userProcessContainer, system, customerDirectory, restaurantDirectory, deliveryManDirectory,menuDirectory,orderDirectory);
    }
    
}
