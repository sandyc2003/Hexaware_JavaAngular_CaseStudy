package com.hexaware.hotpot.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "order_items")
public class OrderItem {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int orderItemId;

	    @ManyToOne
	    private Order order;

	    @ManyToOne
	    private MenuItem menuItem;

	    private int quantity;
	    private double price;
	    
	    public OrderItem() {}

		public OrderItem(int orderItemId, Order order, MenuItem menuItem, int quantity, double price) {
			this.orderItemId = orderItemId;
			this.order = order;
			this.menuItem = menuItem;
			this.quantity = quantity;
			this.price = price;
		}

		public int getOrderItemId() {
			return orderItemId;
		}

		public void setOrderItemId(int orderItemId) {
			this.orderItemId = orderItemId;
		}

		public Order getOrder() {
			return order;
		}

		public void setOrder(Order order) {
			this.order = order;
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

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		@Override
		public String toString() {
			return "OrderItem [orderItemId=" + orderItemId + ", order=" + order + ", menuItem=" + menuItem
					+ ", quantity=" + quantity + ", price=" + price + "]";
		}
	    
	    
}
