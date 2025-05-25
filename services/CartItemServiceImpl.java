package com.hexaware.hotpot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hexaware.hotpot.entities.CartItem;
import com.hexaware.hotpot.repositories.CartItemRepository;

public class CartItemServiceImpl implements ICartItemService {
    @Autowired private CartItemRepository repo;

	@Override
	public CartItem addToCart(CartItem cartItemId) {
		return repo.save(cartItemId);
	}

	@Override
	public void removeFromCart(int cartItemId) {
		repo.deleteById(cartItemId);
	}

	@Override
	public void clearCartByUserId(int userId) {
		repo.deleteByUserUserId(userId);
	}

	@Override
	public List<CartItem> getCartItemsByUserId(int userId) {
		return repo.findByUserUserId(userId);
	}

	@Override
	public List<CartItem> findByUserUserId(int userId) {
		return repo.findAll();
	}

}
