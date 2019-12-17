package com.ustglobal.jpawithhibernateapp.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicInsert {
	public static void main(String[] args) {
		
	
	EntityTransaction et=null;
	EntityManager em=null;
	try {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
	em = emf.createEntityManager();
       et = em.getTransaction();
	String jpql = "insert into Product(pid,pname,quantity) values(:id,:name,:quantity)";
	et.begin();
	Query q = em.createNativeQuery(jpql);
	q.setParameter("id", 104);
	q.setParameter("name", "Pencil");
	q.setParameter("quantity", 10);
	int a =q.executeUpdate();
	System.out.println(a +"inserted");
	et.commit();
	}catch(Exception e) {
		e.printStackTrace();
		et.rollback();
	}
	em.close();
}
}