package com.ustglobal.jpawithhibernateapp.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UpdateDemo {
public static void main(String[] args) {
	EntityTransaction et=null;
	EntityManager em=null;
	try {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
	em = emf.createEntityManager();
       et = em.getTransaction();
	String jpql = "update Product set pname='Ashwini' where pid=101";
	et.begin();
	Query q = em.createQuery(jpql);
	int a =q.executeUpdate();
	System.out.println(a +"updated");
	et.commit();
	}catch(Exception e) {
		e.printStackTrace();
		et.rollback();
	}
	em.close();
}
}
