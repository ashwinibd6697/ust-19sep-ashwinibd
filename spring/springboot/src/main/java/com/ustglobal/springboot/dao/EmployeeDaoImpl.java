package com.ustglobal.springboot.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.springboot.dto.EmployeeBean;
//@Repository
public class 
EmployeeDaoImpl implements EmployeeDao {

//	@PersistenceUnit
	EntityManagerFactory factory;

	@Override
	public boolean addEmployee(EmployeeBean bean) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(bean);
			transaction.commit();
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean modifyEmployee(EmployeeBean bean) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
			transaction.begin();
			EmployeeBean ebean=	manager.find(EmployeeBean.class, bean.getId());
			ebean.setName(bean.getName());
			ebean.setEmail(bean.getEmail());
			ebean.setPassword(bean.getPassword());
			ebean.setGender(bean.getGender());
			ebean.setDoj(bean.getDoj());
			transaction.commit();
			return true;
	
	}

	@Override
	public boolean deleteEmployee(int id) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		transaction.begin();
		EmployeeBean ebean=	manager.find(EmployeeBean.class, id);
		if(ebean!=null) {
			manager.remove(ebean);
			transaction.commit();
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public EmployeeBean getEmployee(int id) {
		EntityManager manager=factory.createEntityManager();

		return manager.find(EmployeeBean.class, id);
	}

	@Override
	public List<EmployeeBean> getAllEmployee() {
		EntityManager manager=factory.createEntityManager();

		String jpql="from EmployeeBean";
		TypedQuery<EmployeeBean> query=manager.createQuery(jpql,EmployeeBean.class);
		
		List<EmployeeBean> employeeBeans=query.getResultList();
		
		return employeeBeans;
	}

}
