/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Customer.Customer;
import Business.DeliveryMan.DeliveryMan;
import Business.Menu.FoodDetails;
import Business.Restaurant.Restaurant;
import Business.WorkQueue.WorkRequest;

/**
 *
 * @author garima
 */
public class Orders extends WorkRequest{
    private String orderId;
    private int orderStatusPercentage;
    private FoodDetails foodItem;
    private Restaurant restaurant;
    private Customer customer;
    private DeliveryMan deliveryMan;
    private int orderQuantity;
    private String result;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public FoodDetails getFoodItem() {
        return foodItem;
    }

    public void setFoodItem(FoodDetails foodItem) {
        this.foodItem = foodItem;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public DeliveryMan getDeliveryMan() {
        return deliveryMan;
    }

    public void setDeliveryMan(DeliveryMan deliveryMan) {
        this.deliveryMan = deliveryMan;
    }

    public int getQuantity() {
        return orderQuantity;
    }

    public void setQuantity(int quantity) {
        this.orderQuantity = quantity;
    }


    public int getOrderStatusPercentage() {
        return orderStatusPercentage;
    }

    public void setOrderStatusPercentage(int orderStatusPercentage) {
        this.orderStatusPercentage = orderStatusPercentage;
    } 
    
}