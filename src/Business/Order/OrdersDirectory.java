/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import java.util.ArrayList;

/**
 *
 * @author garima
 */
public class OrdersDirectory {
    private ArrayList<Orders> orderDirectory;

    public OrdersDirectory(){
        orderDirectory = new ArrayList<Orders>();
    }
    
    public ArrayList<Orders> getOrderDirectory() {
        return orderDirectory;
    }

    public void setOrderDirectory(ArrayList<Orders> orderDirectory) {
        this.orderDirectory = orderDirectory;
    }
    
    public Orders addOrder(){
        Orders order = new Orders();
        orderDirectory.add(order);
        return order;
    }
    
    public Orders getOrderById(int index){
        return orderDirectory.get(index);
    }
    
    public Orders getOrderByOrderId(String id){
        for(Orders order: orderDirectory){
            if(order.getOrderId().equalsIgnoreCase(id)){
                return order;
            }
        }
        return null;
    }
}
