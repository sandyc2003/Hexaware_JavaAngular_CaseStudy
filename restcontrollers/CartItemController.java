package com.hexaware.hotpot.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.hotpot.entities.CartItem;
import com.hexaware.hotpot.services.ICartItemService;

@RestController
@RequestMapping("/api/cart")
public class CartItemController {
	 @Autowired
	    private ICartItemService service;

	    @PostMapping("/add")
	    public CartItem addToCart(@RequestBody CartItem cartItem) {
	        return service.addToCart(cartItem);
	    }

	    @DeleteMapping("/remove/{cartItemId}")
	    public void removeFromCart(@PathVariable int cartItemId) {
	        service.removeFromCart(cartItemId);
	    }

	    @DeleteMapping("/clear/{userId}")
	    public void clearCart(@PathVariable int userId) {
	        service.clearCartByUserId(userId);
	    }

	    @GetMapping("/user/{userId}")
	    public List<CartItem> getCartItems(@PathVariable int userId) {
	        return service.getCartItemsByUserId(userId);
	    }

}
