/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Menu;

import java.awt.image.BufferedImage;

/**
 *
 * @author garima
 */
public class FoodItem {
    
    private String foodItemId;
    private String foodRestaurantId;
    private String foodItemName;
    private String foodDescription;
    private BufferedImage foodPhoto;
    private double foodPrice;

    public FoodItem(String foodItemId, String foodRestaurantId, String foodItemName, String foodDescription, BufferedImage foodPhoto, double foodPrice) {
        this.foodItemId = foodItemId;
        this.foodRestaurantId = foodRestaurantId;
        this.foodItemName = foodItemName;
        this.foodDescription = foodDescription;
        this.foodPhoto = foodPhoto;
        this.foodPrice = foodPrice;
    }

    public String getFoodItemId() {
        return foodItemId;
    }

    public void setFoodItemId(String foodItemId) {
        this.foodItemId = foodItemId;
    }

    public String getFoodRestaurantId() {
        return foodRestaurantId;
    }

    public void setFoodRestaurantId(String foodRestaurantId) {
        this.foodRestaurantId = foodRestaurantId;
    }

    public String getFoodItemName() {
        return foodItemName;
    }

    public void setFoodItemName(String foodItemName) {
        this.foodItemName = foodItemName;
    }

    public String getFoodDescription() {
        return foodDescription;
    }

    public void setFoodDescription(String foodDescription) {
        this.foodDescription = foodDescription;
    }

    public BufferedImage getFoodPhoto() {
        return foodPhoto;
    }

    public void setFoodPhoto(BufferedImage foodPhoto) {
        this.foodPhoto = foodPhoto;
    }

    public double getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(double foodPrice) {
        this.foodPrice = foodPrice;
    }

   
    
}
