package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class InsertDemo {
   public static void main(String[] args) {
	
	   Product prdct = new Product();
	   prdct.setPid(103);
	   prdct.setPname("Pencil");
	   prdct.setQuantity(10);
	   
	   EntityTransaction entityTransaction=null;
	   EntityManager entityManager = null;
	   try {
	   EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("TestPersistence");
	   entityManager=entityManagerFactory.createEntityManager();
	   entityTransaction =entityManager.getTransaction();
	   entityTransaction.begin();
	   entityManager.persist(prdct);
	   System.out.println("record inserted to database");
	   entityTransaction.commit();
	   }catch(Exception e) {
		   e.printStackTrace();
		   entityTransaction.rollback();
		}
	   entityManager.close();
	   
}
}
