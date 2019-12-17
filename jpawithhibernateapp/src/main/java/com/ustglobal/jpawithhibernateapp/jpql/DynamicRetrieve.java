//package com.ustglobal.jpawithhibernateapp.jpql;
//
//import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
//import javax.persistence.Query;
//
//import com.ustglobal.jpawithhibernateapp.dto.Product;
//
//public class DynamicRetrieve {
//
//	EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
//	EntityManager em = emf.createEntityManager();
////	String jpql ="from Product";
//	String jpql = "select pname from Product where pid=:id";
//	Query q = em.createQuery(jpql);
//
//
//	for(int i =0;i<a.size();i++) {
//	    	Object obj=a.get(i);
//	    	System.out.println(obj);
//	}
//
////	
//}
//}
