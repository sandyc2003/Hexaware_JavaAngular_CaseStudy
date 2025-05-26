package com.hexaware.hotpot.dto;

public class OrderDTO {
	 private int orderId;
	    private String shippingAddress;
	    private String orderStatus;
	    private int userId;
	    private double totalAmount;
	    
		public OrderDTO(int orderId, String shippingAddress, String orderStatus, int userId, double totalAmount) {
			super();
			this.orderId = orderId;
			this.shippingAddress = shippingAddress;
			this.orderStatus = orderStatus;
			this.userId = userId;
			this.totalAmount = totalAmount;
		}

		public OrderDTO() {
			// TODO Auto-generated constructor stub
		}

		public int getOrderId() {
			return orderId;
		}

		public void setOrderId(int orderId) {
			this.orderId = orderId;
		}

		public String getShippingAddress() {
			return shippingAddress;
		}

		public void setShippingAddress(String shippingAddress) {
			this.shippingAddress = shippingAddress;
		}

		public String getOrderStatus() {
			return orderStatus;
		}

		public void setOrderStatus(String orderStatus) {
			this.orderStatus = orderStatus;
		}

		public int getUserId() {
			return userId;
		}

		public void setUserId(int userId) {
			this.userId = userId;
		}

		public double getTotalAmount() {
			return totalAmount;
		}

		public void setTotalAmount(double totalAmount) {
			this.totalAmount = totalAmount;
		}
	    
	    
}
