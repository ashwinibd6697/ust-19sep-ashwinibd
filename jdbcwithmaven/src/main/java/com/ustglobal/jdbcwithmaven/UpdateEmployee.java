package com.ustglobal.jdbcwithmaven;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jdbcwithmaven.dto.Employee;

public class UpdateEmployee {
public static void main(String[] args) {
		
		EntityManager em=null;
		EntityTransaction et=null;
  try {
	  EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
	em = emf.createEntityManager();
     et = em.getTransaction();
	et.begin();
	Employee pinfo =em.find(Employee.class, 12);
	pinfo.setName("siri");
	System.out.println("updated");
	et.commit();
  }catch(Exception e) {
	  e.printStackTrace();
	  et.rollback();
  }
	em.close();
}//end of main
}
