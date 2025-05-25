package com.hexaware.hotpot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hexaware.hotpot.entities.MenuItem;
import com.hexaware.hotpot.repositories.MenuItemRepository;

public class MenuItemServieImpl implements IMenuItemService {
    @Autowired private MenuItemRepository repo;

	@Override
	public MenuItem addMenuItem(MenuItem item) {
		return repo.save(item);
	}

	@Override
	public MenuItem updateMenuItem(MenuItem item) {
		return repo.save(item);
	}

	@Override
	public void deleteMenuItem(int itemId) {
		repo.deleteById(itemId);
	}

	@Override
	public MenuItem getMenuItemById(int itemId) {
		return repo.findById(itemId).orElse(null);
	}

	@Override
	public List<MenuItem> getMenuByCategory(String categoryName) {
		return repo.findByCategoryCategoryName(categoryName);
	}

	@Override
	public List<MenuItem> getMenuByRestaurant(int restaurantId) {
		return repo.findByRestaurantRestaurantId(restaurantId);
	}

	@Override
	public List<MenuItem> getAllMenuItems() {
		return repo.findAll();
	}

}
