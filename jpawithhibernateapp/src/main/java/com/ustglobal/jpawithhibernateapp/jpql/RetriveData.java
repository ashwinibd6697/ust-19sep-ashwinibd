package com.ustglobal.jpawithhibernateapp.jpql;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class RetriveData {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager em = emf.createEntityManager();
//		String jpql ="from Product";
		String jpql = "select pname from Product";
		Query q = em.createQuery(jpql);
		List<Product> a = q.getResultList();
//		List  <Product> a=q.getResultList();

		/*
		 * for(Product p : a) {
		 * 
		 * System.out.println(p.getPid()); System.out.println(p.getPname());
		 * System.out.println(p.getQuantity());
		 * System.out.println("*********************");
		 * 
		 * System.out.println(p.);
		 * 
		 * }
		 */

		for(int i =0;i<a.size();i++) {
		    	Object obj=a.get(i);
		    	System.out.println(obj);
		}

//		
	}

}
