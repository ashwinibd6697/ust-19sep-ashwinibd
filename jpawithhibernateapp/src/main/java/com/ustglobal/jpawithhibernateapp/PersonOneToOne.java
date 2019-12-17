package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.onetoone.PersonInfo;
import com.ustglobal.jpawithhibernateapp.onetoone.PersonOtherInfo;
import com.ustglobal.jpawithhibernateapp.onetoone.VoterId;

public class PersonOneToOne {

	public static void main(String[] args) {
		 
		PersonInfo pi = new PersonInfo();
		pi.setId(1);
		pi.setName("Ashwini");
		pi.setEmail("a@z.com");
		
		PersonOtherInfo poi = new PersonOtherInfo();
		poi.setFatherName("dyavaiah");
		poi.setPid(10);
		poi.setPerson(pi);
		
		
		
		
		
		EntityTransaction entityTransaction=null;
		   EntityManager entityManager = null;
		   try {
		   EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("TestPersistence");
		   entityManager=entityManagerFactory.createEntityManager();
		   entityTransaction =entityManager.getTransaction();
		   entityTransaction.begin();
		   
		   	   entityManager.persist(poi);
		   System.out.println("record inserted to database");
		   entityTransaction.commit();
		   }catch(Exception e) {
			   e.printStackTrace();
			   entityTransaction.rollback();
			}
		   entityManager.close();
		   
	}
}
