/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Menu;

import java.util.ArrayList;

/**
 *
 * @author garima
 */
public class Menu {
    private ArrayList<FoodDetails> foodMenu;
    
    public Menu(){
        foodMenu = new ArrayList<FoodDetails>();
    }

    public ArrayList<FoodDetails> getMenu() {
        return foodMenu;
    }

    public void setMenu(ArrayList<FoodDetails> menu) {
        this.foodMenu = menu;
    }
    
}
