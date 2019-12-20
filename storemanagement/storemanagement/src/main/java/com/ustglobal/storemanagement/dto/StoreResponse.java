package com.ustglobal.storemanagement.dto;

import java.util.List;

public class StoreResponse {

	private int statuecode;
	
	private String message;
	
	private String description;
	
	private List<Products> products;
	
	private List<Order> order;
	
	private List<Cart> cart;

	public List<Cart> getCart() {
		return cart;
	}

	public void setCart(List<Cart> cart) {
		this.cart = cart;
	}

	public int getStatuecode() {
		return statuecode;
	}

	public void setStatuecode(int statuecode) {
		this.statuecode = statuecode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Products> getProducts() {
		return products;
	}

	public void setProducts(List<Products> products) {
		this.products = products;
	}

	public List<Order> getOrder() {
		return order;
	}

	public void setOrder(List<Order> order) {
		this.order = order;
	}
	
}
