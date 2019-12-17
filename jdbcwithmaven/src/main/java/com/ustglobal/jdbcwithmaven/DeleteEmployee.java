package com.ustglobal.jdbcwithmaven;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jdbcwithmaven.dto.Employee;

public class DeleteEmployee {
	public static void main(String[] args) {

		EntityManager em=null;
		EntityTransaction et=null;
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
			em = emf.createEntityManager();
			et = em.getTransaction();
			et.begin();
			Employee d =em.find(Employee.class, 1);
			em.remove(d);
			System.out.println("removed");
			et.commit();
			
		}catch(Exception e) {
			e.printStackTrace();
			et.rollback();
		}
		em.close();
	}//end of main
}
