package com.ustglobal.storemanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.storemanagement.dao.StoreDao;
import com.ustglobal.storemanagement.dto.Cart;
import com.ustglobal.storemanagement.dto.Products;

@Service
public class StoreServiceImpl implements StoreService{

	
	
	@Autowired
	private StoreDao dao;
	
	@Override
	public boolean addproducts(Products product) {
		
		return dao.addproducts(product);
	}

	@Override
	public boolean updateProducts(Products product) {
		
		return dao.updateProducts(product);
	}

	@Override
	public Products getProduct(Products product) {
		
		return dao.getProduct(product);
	}

	@Override
	public List<Products> getAllProduct() {
		
		return dao.getAllProduct();
	}

	@Override
	public Cart addToCart(Products product,int quantity) {
		
		return dao.addToCart(product,quantity);
	}

	@Override
	public boolean removeProduct(int id, int quantity) {
		
		return dao.removeProduct(id, quantity);
	}

	@Override
	public List<Cart> getCartProducts() {
		
		return dao.getCartProducts();
	}

	@Override
	public boolean order(List<Cart> cart) {
		
		return dao.order(cart);
	}

	@Override
	public boolean remove(int id) {
		
		return dao.remove(id);
	}
	

}
