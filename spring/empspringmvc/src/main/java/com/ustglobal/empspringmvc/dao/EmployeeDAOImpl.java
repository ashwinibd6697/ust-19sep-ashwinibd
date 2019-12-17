package com.ustglobal.empspringmvc.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.empspringmvc.dto.EmployeeBean;
@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    @PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public EmployeeBean login(int id, String password) {
            String jpql="from EmployeeBean where id=:id and password=:pass";
            EntityManager manager =factory.createEntityManager();
            TypedQuery<EmployeeBean> query =manager.createQuery(jpql,EmployeeBean.class);
            query.setParameter("id", id);
            query.setParameter("pass", password);
            try {
            EmployeeBean bean =  query.getSingleResult();
            return bean;
            }catch(Exception e) {
            	e.printStackTrace();
            	return null;
            }

		
	}

	@Override
	public EmployeeBean searchEmployee(int id) {
		EntityManager manager =factory.createEntityManager();
		return  manager.find(EmployeeBean.class, id);

	}

	@Override
	public int register(EmployeeBean bean) {
		EntityManager manager =factory.createEntityManager();
		EntityTransaction transaction =manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(bean);
			transaction.commit();
			return bean.getId();
		}catch(Exception e) {
			e.printStackTrace();
			
		}
manager.close();
return -1;
	}

	@Override
	public boolean deleteEmployee(int id) {

		EntityManager manager =factory.createEntityManager();
		EntityTransaction transaction =manager.getTransaction();
		transaction.begin();
		try {
			EmployeeBean bean=  manager.find(EmployeeBean.class, id);
			manager.remove(bean);
			transaction.commit();
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}

	}


	@Override
	public boolean updateEmployee(EmployeeBean bean) {

		EntityManager manager =factory.createEntityManager();
		EntityTransaction transaction =manager.getTransaction();
		transaction.begin();

		EmployeeBean bean1=  manager.find(EmployeeBean.class, bean.getId());
		
		  bean1.setName(bean.getName()); 
		  
		  bean1.setPassword(bean.getPassword());
		  bean1.setEmail(bean.getEmail());
		  bean1.setGender(bean.getGender());
		 bean1.setDoj(bean.getDoj());
		 
	
		transaction.commit();
		return true;
	}

	@Override
	public boolean changePassword(int id, String password) {

		EntityManager manager =factory.createEntityManager();
		EntityTransaction transaction =manager.getTransaction();
		transaction.begin();
		EmployeeBean bean=  manager.find(EmployeeBean.class, id);
		bean.setPassword(password);
		transaction.commit();
		return true;

	}






}
