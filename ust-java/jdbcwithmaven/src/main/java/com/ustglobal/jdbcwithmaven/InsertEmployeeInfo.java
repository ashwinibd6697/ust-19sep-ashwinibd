package com.ustglobal.jdbcwithmaven;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jdbcwithmaven.dto.Employee;

public class InsertEmployeeInfo {
   public static void main(String[] args) {
	Employee e = new Employee();
	e.setId(101);
	e.setName("kanasu");
	e.setSal(300000);
	e.setGender("f");
	
	EntityManager em=null;
	EntityTransaction et=null;
	
	try {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
		em=emf.createEntityManager();
		et=em.getTransaction();
		et.begin();
		em.persist(e);
		System.out.println("inserted");
		et.commit();
	}catch(Exception e1) {
		e1.printStackTrace();
		et.rollback();
	}
	em.clear();
}//end of main
}//end of class
