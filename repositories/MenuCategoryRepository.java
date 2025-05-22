package com.hexaware.hotpot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.hotpot.entities.MenuCategory;

@Repository
public interface MenuCategoryRepository extends JpaRepository<MenuCategory, Integer> {
    MenuCategory findByCategoryName(String categoryName);
}
