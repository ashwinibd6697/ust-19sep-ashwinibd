package com.ustglobal.storemanagement.service;

import java.util.List;

import com.ustglobal.storemanagement.dto.Cart;
import com.ustglobal.storemanagement.dto.Products;

public interface StoreService {

	public boolean addproducts(Products product);
	public boolean updateProducts(Products product);
	public Products getProduct(Products product);
	public List<Products> getAllProduct();
	
	public Cart addToCart(Products product,int quantity);
	public boolean removeProduct(int id,int quantity);
	public List<Cart> getCartProducts();
	public boolean order(List<Cart> cart);
	public boolean remove(int id);
}
