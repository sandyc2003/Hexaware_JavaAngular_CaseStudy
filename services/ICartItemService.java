package com.hexaware.hotpot.services;

import java.util.List;

import com.hexaware.hotpot.entities.CartItem;

public interface ICartItemService {
	List<CartItem> findByUserUserId(int userId);
	CartItem addToCart(CartItem item);
    void removeFromCart(int cartItemId);
    void clearCartByUserId(int userId);
    List<CartItem> getCartItemsByUserId(int userId);
}
