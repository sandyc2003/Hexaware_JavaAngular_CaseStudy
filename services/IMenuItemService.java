package com.hexaware.hotpot.services;

import java.util.List;

import com.hexaware.hotpot.entities.MenuItem;

public interface IMenuItemService {
	MenuItem addMenuItem(MenuItem item);
    MenuItem updateMenuItem(MenuItem item);
    void deleteMenuItem(int itemId);
    MenuItem getMenuItemById(int itemId);
    List<MenuItem> getMenuByCategory(String categoryName);
    List<MenuItem> getMenuByRestaurant(int restaurantId);
    List<MenuItem> getAllMenuItems();
}
