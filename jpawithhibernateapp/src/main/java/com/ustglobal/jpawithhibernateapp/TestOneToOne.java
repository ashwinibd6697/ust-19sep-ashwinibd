package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.onetoone.Person;
import com.ustglobal.jpawithhibernateapp.onetoone.VoterId;

public class TestOneToOne {
public static void main(String[] args) {
	 VoterId vi = new VoterId();
	    vi.setVid(10);
	    vi.setVname("Ashwini");
	    
	    Person p = new Person();
	    p.setPid(1);
	    p.setName("Ashwini");
	    p.setVoterId(vi);
	 
	 
	   EntityTransaction entityTransaction=null;
	   EntityManager entityManager = null;
	   try {
	   EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("TestPersistence");
	   entityManager=entityManagerFactory.createEntityManager();
	   entityTransaction =entityManager.getTransaction();
	   entityTransaction.begin();
	   VoterId v=  entityManager.find(VoterId.class, 10);
       System.out.println(v.getPerson().getPid());
	   //	   entityManager.persist(p);
	   System.out.println("record inserted to database");
	   entityTransaction.commit();
	   }catch(Exception e) {
		   e.printStackTrace();
		   entityTransaction.rollback();
		}
	   entityManager.close();
	   
}
}
