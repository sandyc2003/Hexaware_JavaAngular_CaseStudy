package com.hexaware.hotpot.entities;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name = "menu_items")
public class MenuItem {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int itemId;

	    private String itemName;

	    @Column(length = 1000)
	    private String description;

	    private double price;
	    private String availabilityTime; // e.g., "All Day", "Lunch Hours"
	    private String specialDietaryInfo; // e.g., Veg, Non-Veg
	    private String tasteInfo; // e.g., Sweet, Spicy Light, Spicy Full
	    private String nutritionalInfo; // Can be JSON or long string
	    
	    @ManyToOne
	    private Restaurant restaurant;

	    @ManyToOne
	    private MenuCategory category;
	    
	    public MenuItem(){}

		public MenuItem(int itemId, String itemName, String description, double price, String availabilityTime,
				String specialDietaryInfo, String tasteInfo, String nutritionalInfo, Restaurant restaurant,
				MenuCategory category) {
			this.itemId = itemId;
			this.itemName = itemName;
			this.description = description;
			this.price = price;
			this.availabilityTime = availabilityTime;
			this.specialDietaryInfo = specialDietaryInfo;
			this.tasteInfo = tasteInfo;
			this.nutritionalInfo = nutritionalInfo;
			this.restaurant = restaurant;
			this.category = category;
		}

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

		public Restaurant getRestaurant() {
			return restaurant;
		}

		public void setRestaurant(Restaurant restaurant) {
			this.restaurant = restaurant;
		}

		public MenuCategory getCategory() {
			return category;
		}

		public void setCategory(MenuCategory category) {
			this.category = category;
		}

		@Override
		public String toString() {
			return "MenuItem [itemId=" + itemId + ", itemName=" + itemName + ", description=" + description + ", price="
					+ price + ", availabilityTime=" + availabilityTime + ", specialDietaryInfo=" + specialDietaryInfo
					+ ", tasteInfo=" + tasteInfo + ", nutritionalInfo=" + nutritionalInfo + ", restaurant=" + restaurant
					+ ", category=" + category + "]";
		}
	    
	    	
	    }
	

