package com.hexaware.hotpot.entity;
import javax.persistence.*;
@Entity
@Table(name = "menu_categories")
public class MenuCategory {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int categoryId;

    private String categoryName; // e.g., Breakfast, Lunch, Pizza, Arabian, etc.
    
    public MenuCategory() {}
    
    public MenuCategory(int categoryId, String categoryName) {
    	this.categoryId=categoryId;
    	this.categoryName=categoryName;
    }

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@Override
	public String toString() {
		return "MenuCategory [categoryId=" + categoryId + ", categoryName=" + categoryName + "]";
	}
    
}
