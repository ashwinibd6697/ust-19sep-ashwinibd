package com.ustglobal.jpawithhibernateapp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.manytoone.Pencil;
import com.ustglobal.jpawithhibernateapp.manytoone.PencilBox;

public class ManyToOne {

	
	public static void main(String[] args) {
		PencilBox pbox = new PencilBox();
		pbox.setBid(1);
		pbox.setBname("apsara");
		
		Pencil p =new Pencil();
		p.setPid(11);
		p.setColor("green");
		p.setPb(pbox);
		
		Pencil p1 =new Pencil();
		p1.setPid(12);
		p1.setColor("blaack");
		p1.setPb(pbox);

		 
		   EntityTransaction entityTransaction=null;
		   EntityManager entityManager = null;
		   try {
		   EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("TestPersistence");
		   entityManager=entityManagerFactory.createEntityManager();
		   entityTransaction =entityManager.getTransaction();
		   entityTransaction.begin();
		   
//		   Pencil pinfo = entityManager.find(Pencil.class, 11);
//		   entityManager.remove(pinfo);
//	 
//	         PencilBox pinfo1 = entityManager.find(PencilBox.class, 1);
//           entityManager.remove(pinfo1);
		  // BIDIRECTIONAL 
		   PencilBox v=  entityManager.find(PencilBox.class, 1);
		   List<Pencil> pen = v.getPencil();
		   for(Pencil pencil :pen) {
			  System.out.println( pencil.getPid());
		   }
		  
//		   entityManager.persist(p);
//		      entityManager.persist(p1);
		   System.out.println("record inserted to database");
		   entityTransaction.commit();
		   }catch(Exception e) {
			   e.printStackTrace();
			   entityTransaction.rollback();
			}
		   entityManager.close();
		   
	}
	
}
