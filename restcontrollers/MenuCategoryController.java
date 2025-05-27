package com.hexaware.hotpot.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.hotpot.entities.MenuCategory;
import com.hexaware.hotpot.services.IMenuCategoryService;

@RestController
@RequestMapping("/api/categories")
public class MenuCategoryController {

    @Autowired
    private IMenuCategoryService service;

    @PostMapping("/add")
    public MenuCategory addCategory(@RequestBody MenuCategory category) {
        return service.addCategory(category);
    }

    @PutMapping("/update")
    public MenuCategory updateCategory(@RequestBody MenuCategory category) {
        return service.updateCategory(category);
    }

    @GetMapping("/{id}")
    public MenuCategory getCategoryById(@PathVariable int id) {
        return service.getCategoryById(id);
    }

    @GetMapping("/all")
    public List<MenuCategory> getAllCategories() {
        return service.getAllCategories();
    }

    
}