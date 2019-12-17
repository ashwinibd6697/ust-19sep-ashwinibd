package com.ustglobal.jpawithhibernateapp;

import java.util.AbstractList;
import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.onetoone.PersonInfo;
import com.ustglobal.jpawithhibernateapp.onetoone.TrainingInfo;

public class PersonManyMany {

	public static void main(String[] args) {
		PersonInfo pi = new PersonInfo();
		pi.setId(9);
		pi.setName("Ashwini");
		pi.setEmail("a@z.com");
		
		
		PersonInfo p = new PersonInfo();
		p.setId(10);
		p.setName("Ashwini");
		pi.setEmail("a@z.com");
		
		
		PersonInfo p2 = new PersonInfo();
		p2.setId(11);
		p2.setName("Ashwini");
		p2.setEmail("a@z.com");
		
		ArrayList<PersonInfo> a = new ArrayList<PersonInfo>();
		a.add(pi);
		a.add(p);
		a.add(p2);
		
		TrainingInfo tf = new TrainingInfo();
		tf.setTid(5);
		tf.setTrainingType("java");
		tf.setP1(a);
		

		TrainingInfo t1 = new TrainingInfo();
		t1.setTid(4);
		t1.setTrainingType("java");
		t1.setP1(a);
		
		EntityTransaction entityTransaction=null;
		   EntityManager entityManager = null;
		   try {
		   EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("TestPersistence");
		   entityManager=entityManagerFactory.createEntityManager();
		   entityTransaction =entityManager.getTransaction();
		   entityTransaction.begin();
		   
		   	   entityManager.persist(tf);
		   	   entityManager.persist(t1);
		   System.out.println("record inserted to database");
		   entityTransaction.commit();
		   }catch(Exception e) {
			   e.printStackTrace();
			   entityTransaction.rollback();
			}
		   entityManager.close();
	}
	
	
	
}
