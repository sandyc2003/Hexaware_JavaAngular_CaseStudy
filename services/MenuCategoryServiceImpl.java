package com.hexaware.hotpot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hexaware.hotpot.entities.MenuCategory;
import com.hexaware.hotpot.repositories.MenuCategoryRepository;

public class MenuCategoryServiceImpl implements IMenuCategoryService {
    @Autowired private MenuCategoryRepository repo;

	@Override
	public MenuCategory addCategory(MenuCategory category) {
		return repo.save(category);
	}

	@Override
	public MenuCategory getCategoryById(int categoryId) {
		return repo.findById(categoryId).orElse(null);
	}

	@Override
	public List<MenuCategory> getAllCategories() {
		return repo.findAll();
	}

	@Override
	public MenuCategory getCategoryByName(String categoryName) {
		return repo.findByCategoryName(categoryName);
	}

}
