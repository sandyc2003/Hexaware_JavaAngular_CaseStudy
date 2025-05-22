package com.hexaware.hotpot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.hotpot.entities.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Integer> {}
