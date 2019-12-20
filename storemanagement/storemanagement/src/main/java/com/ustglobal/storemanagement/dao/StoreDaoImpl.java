package com.ustglobal.storemanagement.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.ustglobal.storemanagement.dto.Cart;
import com.ustglobal.storemanagement.dto.Order;
import com.ustglobal.storemanagement.dto.Products;

@Repository
public class StoreDaoImpl implements StoreDao {

	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public boolean addproducts(Products product) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction et = em.getTransaction();
		try {
			et.begin();
			em.persist(product);
			et.commit();
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			et.rollback();
			return false;
		}
		
	}

	@Override
	public boolean updateProducts(Products product) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction et = em.getTransaction();
		try {
			et.begin();
		Products p = em.find(Products.class, product.getId());
			
		if(p!=null) {
			p.setName(product.getName());
			p.setPrice(product.getPrice());
			p.setQuantity(product.getQuantity());
			p.setCategory(product.getCategory());
			p.setCompany(product.getCompany());
		}
		et.commit();
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			et.rollback();
			return false;
		}
	}

	@Override
	public Products getProduct(Products product) {
		EntityManager em = factory.createEntityManager();
		Products p = em.find(Products.class, product.getId());
		if(p!=null) {
			return p;
		}else {
			return null;
		}
		
	}

	@Override
	public List<Products> getAllProduct() {
		EntityManager em = factory.createEntityManager();
		String jpql = "from Products";
		Query q = em.createQuery(jpql);
		if(q!=null) {
			return q.getResultList();
		}else {
			return null;
		}
	}

	@Override
	public Cart addToCart(Products product,int quantity) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Cart t = new Cart();
		t.setId(product.getId());
		t.setName(product.getName());
		t.setCategory(product.getCategory());
        t.setCompany(product.getCategory());
        t.setPrice(product.getPrice()*quantity);
        t.setQuantity(quantity);
		try {
			et.begin();
			Cart t1=em.merge(t);
			et.commit();
			return t1;
		}catch(Exception e) {
			e.printStackTrace();
			et.rollback();
			return null;
		}
	}

	@Override
	public boolean removeProduct(int id,int quantity) {

		EntityManager em = factory.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Products p = em.find(Products.class, id);
		et.begin();
		if(p.getQuantity()==quantity) {
			em.remove(p);
			et.commit();
			return true;
		}
			
		else if(p.getQuantity()>quantity){
			
			p.setQuantity(p.getQuantity()-quantity);
			et.commit();
			return true;
			
		}
		else {
			return false;
		}
	}

	@Override
	public List<Cart> getCartProducts() {
		EntityManager em = factory.createEntityManager();
		String jpql = "from Cart";
		Query q = em.createQuery(jpql);
		if(q!=null) {
			return q.getResultList();
		}else {
			return null;
		}
	}

	@Override
	public boolean order(List<Cart> cart) {
		
		int sum = 0;
		for(Cart i :cart) {
			
			sum+=i.getPrice(); 
		}
		EntityManager em = factory.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Order o = new Order();
		o.setTotalprice(sum);
		o.setTotal_price_with_gst(sum+10);
		try {
			et.begin();
			em.persist(o);
			et.commit();
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			et.rollback();
			return false;
		}
	
		
		
	}

	@Override
	public boolean remove(int id) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Cart p = em.find(Cart.class, id);
		em.remove(p);
		return true;
	}
	
	
	
}
