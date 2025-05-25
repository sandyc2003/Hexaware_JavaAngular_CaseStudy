package com.hexaware.hotpot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hexaware.hotpot.entities.Restaurant;
import com.hexaware.hotpot.repositories.RestaurantRepository;

public class RestaurantServiceImpl implements IRestaurantService {
    @Autowired private RestaurantRepository repo;

	@Override
	public Restaurant addRestaurant(Restaurant restaurant) {
		return repo.save(restaurant);
	}

	@Override
	public void deleteRestaurant(int restaurantId) {
		repo.deleteById(restaurantId);
	}

	@Override
	public Restaurant getRestaurantById(int restaurantId) {
		return repo.findById(restaurantId).orElse(null);
	}

	@Override
	public List<Restaurant> getAllRestaurants() {
		return repo.findAll();
	}

}
