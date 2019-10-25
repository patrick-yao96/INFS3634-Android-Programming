package com.example.borgerkong;

public class Item {
    // item identifier
    private int itemID;
    //item name
    private String item_name;
    //item price
    private int item_price;
    //item description
    private String item_description;
    //item image
    private int item_imageDrawableID;
    //item quantity
    private int item_quantity;

    //Item constructor
    public Item(int itemID, String item_name, int item_price, String item_description, int item_imageDrawableID, int item_quantity)
    {
        this.itemID = itemID;
        this.item_name = item_name;
        this.item_price = item_price;
        this.item_description = item_description;
        this.item_imageDrawableID = item_imageDrawableID;
        this.item_quantity = item_quantity;

    }

    // Item attributes getters and setters
    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public int getItem_price() {
        return item_price;
    }

    public void setItem_price(int item_price) {
        this.item_price = item_price;
    }

    public String getItem_description() {
        return item_description;
    }

    public void setItem_description(String item_description) {
        this.item_description = item_description;
    }

    public int getItem_imageDrawableID() {
        return item_imageDrawableID;
    }

    public void setItem_imageDrawableID(int item_imageDrawableID) {
        this.item_imageDrawableID = item_imageDrawableID;
    }

    public int getItem_quantity() {
        return item_quantity;
    }

    public void setItem_quantity(int item_quantity) {
        this.item_quantity = item_quantity;
    }
}
