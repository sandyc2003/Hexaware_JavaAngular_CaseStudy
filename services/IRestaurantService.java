package com.hexaware.hotpot.services;

import java.util.List;

import com.hexaware.hotpot.entities.Restaurant;

public interface IRestaurantService {
	    Restaurant addRestaurant(Restaurant restaurant);
	    void deleteRestaurant(int restaurantId);
	    Restaurant getRestaurantById(int restaurantId);
	    List<Restaurant> getAllRestaurants();
	}
