package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class Reattaching {


	public static void main(String[] args) {
		EntityManager em=null;
		EntityTransaction et = null;
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
			em= emf.createEntityManager();
			et=em.getTransaction();
			et.begin();
			Product p = em.find(Product.class, 101);
			System.out.println("before deabtachd the object");
			System.out.println(em.contains(p));
			
			em.detach(p);
			
			System.out.println("After detach");
			System.out.println(em.contains(p));
			System.out.println("after reattach the object");
			Product p1=em.merge(p);
			System.out.println(em.contains(p1));
			p1.setPname("mobile");
			//			p.setPid(102);
			System.out.println("updated");
			et.commit();
		}catch(Exception e) {
			e.printStackTrace();
			et.rollback();
		}
		em.close();



	}//end of main

}//end of class
