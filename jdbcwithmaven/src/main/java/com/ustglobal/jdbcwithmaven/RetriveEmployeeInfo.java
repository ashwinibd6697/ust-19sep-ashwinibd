package com.ustglobal.jdbcwithmaven;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.jdbcwithmaven.dto.Employee;

public class RetriveEmployeeInfo {
public static void main(String[] args) {
	

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
	EntityManager em=emf.createEntityManager();
	
	Employee e1 = em.find(Employee.class, 1);
     
	  System.out.println(e1.getId());
	  System.out.println(e1.getName());
	  System.out.println(e1.getSal());
	  System.out.println(e1.getGender());
	
	em.close();
}
}

