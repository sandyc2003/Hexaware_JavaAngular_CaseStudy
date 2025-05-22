package com.hexaware.hotpot.entities;
import java.awt.MenuItem;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "cart_items")
public class CartItem {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cartItemId;

    @ManyToOne
    private User user;

    @ManyToOne
    private MenuItem menuItem;

    private int quantity;
    
    public CartItem() {}

	public CartItem(int cartItemId, User user, MenuItem menuItem, int quantity) {
		
		this.cartItemId = cartItemId;
		this.user = user;
		this.menuItem = menuItem;
		this.quantity = quantity;
	}

	public int getCartItemId() {
		return cartItemId;
	}

	public void setCartItemId(int cartItemId) {
		this.cartItemId = cartItemId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public MenuItem getMenuItem() {
		return menuItem;
	}

	public void setMenuItem(MenuItem menuItem) {
		this.menuItem = menuItem;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "CartItem [cartItemId=" + cartItemId + ", user=" + user + ", menuItem=" + menuItem + ", quantity="
				+ quantity + "]";
	}
    
    
}
