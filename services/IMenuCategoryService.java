package com.hexaware.hotpot.services;

import java.util.List;

import com.hexaware.hotpot.entities.MenuCategory;

public interface IMenuCategoryService {
	    MenuCategory addCategory(MenuCategory category);
	    MenuCategory getCategoryById(int categoryId);
	    List<MenuCategory> getAllCategories();
	    MenuCategory getCategoryByName(String categoryName);
	}

