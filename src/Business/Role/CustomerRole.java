/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.EcoSystem;
import Business.Menu.MenuDirectory;
import Business.Order.OrdersDirectory;

import Business.Organization;
import Business.Restaurant.RestaurantDirectory;
import Business.UserAccount.UserAccount;
import userinterface.CustomerRole.CustomerAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author garima
 */
public class CustomerRole extends Role{

    
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, EcoSystem business, CustomerDirectory customerDirectory,RestaurantDirectory restaurantDirectory,
            DeliveryManDirectory deliveryManDirectory,MenuDirectory menuDirectory, OrdersDirectory orderDirectory) {
        return new CustomerAreaJPanel(userProcessContainer, userAccount, business, customerDirectory, restaurantDirectory,deliveryManDirectory,menuDirectory);
    }
    
    
}
