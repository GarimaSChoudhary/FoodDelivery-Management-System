/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import java.awt.image.BufferedImage;

/**
 *
 * @author garima
 */
public class DeliveryMan {
    private String deliveryId;
    private String deliveryName;
    private String deliveryPhoneNo;
    private String deliveryAddress;
    private BufferedImage deliveryPhoto;

    public DeliveryMan(String deliveryId, String name, String phoneNo, String address, BufferedImage photo) {
        this.deliveryId = deliveryId;
        this.deliveryName = name;
        this.deliveryPhoneNo = phoneNo;
        this.deliveryAddress = address;
        this.deliveryPhoto = photo;
    }
    
    public String getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(String deliveryId) {
        this.deliveryId = deliveryId;
    }

    public String getDeliveryName() {
        return deliveryName;
    }

    public void setDeliveryName(String deliveryName) {
        this.deliveryName = deliveryName;
    }

    public String getDeliveryPhoneNo() {
        return deliveryPhoneNo;
    }

    public void setDeliveryPhoneNo(String deliveryPhoneNo) {
        this.deliveryPhoneNo = deliveryPhoneNo;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public BufferedImage getDeliveryPhoto() {
        return deliveryPhoto;
    }

    public void setDeliveryPhoto(BufferedImage deliveryPhoto) {
        this.deliveryPhoto = deliveryPhoto;
    }

    
}
