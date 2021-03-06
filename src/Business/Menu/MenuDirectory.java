/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Menu;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

/**
 *
 * @author garima
 */
public class MenuDirectory {
    private ArrayList<FoodDetails> menuDirectory;
    
    public MenuDirectory(){
        menuDirectory = new ArrayList<FoodDetails>();
    }

    public ArrayList<FoodDetails> getMenuDirectory() {
        return menuDirectory;
    }

    public void setMenuDirectory(ArrayList<FoodDetails> menuDirectory) {
        this.menuDirectory = menuDirectory;
    }

    public void add(String restaurantId, String name, String description,BufferedImage photo, double price) {
        FoodDetails item = new FoodDetails("F"+(menuDirectory.size()+1),restaurantId,name,description,photo,price);
        menuDirectory.add(item);
    }
    
    public FoodDetails getFoodItem(String itemId){
        for(FoodDetails item: menuDirectory){
            if(item.getFoodItemId().equalsIgnoreCase(itemId)){
                return item;
            }
        }
        return null;
    }

    public void updateFoodItem(String itemId, String name, String description, Double price, BufferedImage img) {
        for(FoodDetails item: menuDirectory){
            if(item.getFoodItemId().equalsIgnoreCase(itemId)){
                item.setFoodItemName(name);
                item.setFoodDescription(description);
                item.setFoodPrice(price);
                item.setFoodPhoto(img);
            }
        }
    }
    
    public void deleteItem(String id){
        for(int i =0; i< menuDirectory.size();i++){
            if(menuDirectory.get(i).getFoodItemId().equalsIgnoreCase(id)){
                menuDirectory.remove(i);
            }
        }
    }
    
    public FoodDetails getFoodItemByIndex(int index){
        return menuDirectory.get(index);
    }
}
