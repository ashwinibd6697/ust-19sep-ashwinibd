package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.onetoone.PersonExp;
import com.ustglobal.jpawithhibernateapp.onetoone.PersonInfo;

public class PersonManytoOne {
public static void main(String[] args) {
	
	PersonInfo pi = new PersonInfo();
	pi.setId(3);
	pi.setName("Ashwini");
	pi.setEmail("a@z.com");
	
	PersonExp px = new PersonExp();
	
	px.setPpid(111);
	px.setCompany_name("ust");
	px.setYear(3);
	px.setP(pi);
	
PersonExp px1 = new PersonExp();
	
	px1.setPpid(112);
	px1.setCompany_name("ty");
	px1.setYear(3);
	px1.setP(pi);
	
	
PersonExp px2 = new PersonExp();
	
	px2.setPpid(113);
	px2.setCompany_name("capgemini");
	px2.setYear(3);
	px2.setP(pi);
	
	

	EntityTransaction entityTransaction=null;
	   EntityManager entityManager = null;
	   try {
	   EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("TestPersistence");
	   entityManager=entityManagerFactory.createEntityManager();
	   entityTransaction =entityManager.getTransaction();
	   entityTransaction.begin();
	   
	   	   entityManager.persist(px);
	   	 entityManager.persist(px1);
	   	 entityManager.persist(px2);
	   	   
	   System.out.println("record inserted to database");
	   entityTransaction.commit();
	   }catch(Exception e) {
		   e.printStackTrace();
		   entityTransaction.rollback();
		}
	   entityManager.close();
	
	
}
}
