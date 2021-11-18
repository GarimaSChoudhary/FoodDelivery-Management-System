/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.awt.image.BufferedImage;

/**
 *
 * @author garima
 */
public class Restaurant {
    private String restaurantId;
    private String restaurantName;
    private String restaurantPhoneNo;
    private String restaurantAddress;
    private BufferedImage restaurantPhoto;
    private String restaurantManagerName;
    private String restaurantLicenseNo;

    public Restaurant(String restaurantId, String restaurantName, String restaurantPhoneNo, String restaurantAddress, BufferedImage restaurantPhoto, String restaurantManagerName, String restaurantLicenseNo) {
        this.restaurantId = restaurantId;
        this.restaurantName = restaurantName;
        this.restaurantPhoneNo = restaurantPhoneNo;
        this.restaurantAddress = restaurantAddress;
        this.restaurantPhoto = restaurantPhoto;
        this.restaurantManagerName = restaurantManagerName;
        this.restaurantLicenseNo = restaurantLicenseNo;
    }

    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getRestaurantPhoneNo() {
        return restaurantPhoneNo;
    }

    public void setRestaurantPhoneNo(String restaurantPhoneNo) {
        this.restaurantPhoneNo = restaurantPhoneNo;
    }

    public String getRestaurantAddress() {
        return restaurantAddress;
    }

    public void setRestaurantAddress(String restaurantAddress) {
        this.restaurantAddress = restaurantAddress;
    }

    public BufferedImage getRestaurantPhoto() {
        return restaurantPhoto;
    }

    public void setRestaurantPhoto(BufferedImage restaurantPhoto) {
        this.restaurantPhoto = restaurantPhoto;
    }

    public String getRestaurantManagerName() {
        return restaurantManagerName;
    }

    public void setRestaurantManagerName(String restaurantManagerName) {
        this.restaurantManagerName = restaurantManagerName;
    }

    public String getRestaurantLicenseNo() {
        return restaurantLicenseNo;
    }

    public void setRestaurantLicenseNo(String restaurantLicenseNo) {
        this.restaurantLicenseNo = restaurantLicenseNo;
    }
    

}