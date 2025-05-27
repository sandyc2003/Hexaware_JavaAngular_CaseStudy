package com.hexaware.hotpot.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.hotpot.dto.MenuItemDTO;
import com.hexaware.hotpot.services.IMenuItemService;

@RestController
@RequestMapping("/api/menuitems")
public class MenuItemController {

    @Autowired
    private IMenuItemService service;

    // ✅ Add a new menu item
    @PostMapping("/add")
    public ResponseEntity<MenuItemDTO> addMenuItem(@RequestBody MenuItemDTO dto) {
        return ResponseEntity.ok(service.addMenuItem(dto));
    }

    // ✅ Get menu item by ID
    @GetMapping("/getbyid/{id}")
    public ResponseEntity<MenuItemDTO> getMenuItemById(@PathVariable int id) {
        return ResponseEntity.ok(service.getMenuItemById(id));
    }

    // ✅ Get all menu items
    @GetMapping("/getall")
    public ResponseEntity<List<MenuItemDTO>> getAllMenuItems() {
        return ResponseEntity.ok(service.getAllMenuItems());
    }

    // ✅ Update a menu item
    @PutMapping("/update/{id}")
    public ResponseEntity<MenuItemDTO> updateMenuItem(@PathVariable int id, @RequestBody MenuItemDTO dto) {
        dto.setItemId(id); // Ensure the correct ID is set
        return ResponseEntity.ok(service.updateMenuItem(dto));
    }

    // ✅ Delete a menu item by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteMenuItem(@PathVariable int id) {
        service.deleteMenuItem(id);
        return ResponseEntity.ok("Menu item with ID " + id + " deleted successfully.");
    }
}
