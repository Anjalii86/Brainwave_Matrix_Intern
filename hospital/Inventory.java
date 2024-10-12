package com.hospital;

/**
 * Created by Anjalii on 22-09-2024.
 */
public class Inventory {
    private String itemID;
    private String itemName;
    private int quantity;
    private double price;

    public Inventory(String itemID, String itemName, int quantity, double price) {
        this.itemID = itemID;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }

    public void restock(int additionalQuantity) {
        this.quantity += additionalQuantity;
    }

    public boolean useItem(int usedQuantity) {
        if (usedQuantity > this.quantity) {
            return false;
        } else {
            this.quantity -= usedQuantity;
            return true;
        }
    }

    // Other methods
}


