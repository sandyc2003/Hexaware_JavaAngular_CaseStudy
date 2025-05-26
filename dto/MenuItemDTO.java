// MENU ITEM DTO CLASS

package com.hexaware.hotpot.dto;

public class MenuItemDTO {
    private int itemId;
    private String itemName;
    private String description;
    private double price;
    private String availabilityTime;
    private String specialDietaryInfo;
    private String tasteInfo;
    private String nutritionalInfo;
    private int restaurantId;
    private int categoryId;

    // Getters and Setters
    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAvailabilityTime() {
        return availabilityTime;
    }

    public void setAvailabilityTime(String availabilityTime) {
        this.availabilityTime = availabilityTime;
    }

    public String getSpecialDietaryInfo() {
        return specialDietaryInfo;
    }

    public void setSpecialDietaryInfo(String specialDietaryInfo) {
        this.specialDietaryInfo = specialDietaryInfo;
    }

    public String getTasteInfo() {
        return tasteInfo;
    }

    public void setTasteInfo(String tasteInfo) {
        this.tasteInfo = tasteInfo;
    }

    public String getNutritionalInfo() {
        return nutritionalInfo;
    }

    public void setNutritionalInfo(String nutritionalInfo) {
        this.nutritionalInfo = nutritionalInfo;
    }

    public int getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(int restaurantId) {
        this.restaurantId = restaurantId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
} 

// Now your MenuItemDTO includes all the detailed fields from the MenuItem entity.
