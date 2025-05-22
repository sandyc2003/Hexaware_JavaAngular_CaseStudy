package com.hexaware.hotpot.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.hotpot.entities.MenuItem;

public interface MenuItemRepository extends JpaRepository<MenuItem, Integer> {
    List<MenuItem> findByCategoryCategoryName(String categoryName);
    List<MenuItem> findByRestaurantRestaurantId(int restaurantId);
}
