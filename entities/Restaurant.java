package com.hexaware.hotpot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "restaurants")
public class Restaurant {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int restaurantId;

	    private String restaurantName;
	    private String location;
	    private String contactNumber;
	    
	    public Restaurant() {}
	    
	    public Restaurant(int restaurantId, String restaurantName, String location, String contactNumber) {
	    	this.restaurantId=restaurantId;
	    	this.restaurantName=restaurantName;
	    	this.location=location;
	    	this.contactNumber=contactNumber;
	    }

		public int getRestaurantId() {
			return restaurantId;
		}

		public void setRestaurantId(int restaurantId) {
			this.restaurantId = restaurantId;
		}

		public String getRestaurantName() {
			return restaurantName;
		}

		public void setRestaurantName(String restaurantName) {
			this.restaurantName = restaurantName;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public String getContactNumber() {
			return contactNumber;
		}

		public void setContactNumber(String contactNumber) {
			this.contactNumber = contactNumber;
		}

		@Override
		public String toString() {
			return "Restaurant [restaurantId=" + restaurantId + ", restaurantName=" + restaurantName + ", location="
					+ location + ", contactNumber=" + contactNumber + "]";
		}
	    
}
